package org.shortlink.admin.controller;


import lombok.RequiredArgsConstructor;
import org.shortlink.admin.common.convention.result.Result;
import org.shortlink.admin.common.convention.result.Results;
import org.shortlink.admin.common.enums.UserErrorCodeEnum;
import org.shortlink.admin.dto.resp.UserRespDTO;
import org.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * 根据用户名获取用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username){
        UserRespDTO result = userService.getUserByUsername(username);
        if(result == null){
            return new Result<UserRespDTO>().setCode(UserErrorCodeEnum.USER_NULL.code()).setMessage(UserErrorCodeEnum.USER_NULL.code());
        }else{
            return Results.success(result);
        }
        //return userService.getUserByUsername(username);
    }
}
