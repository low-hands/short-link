package org.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.shortlink.admin.dao.entity.UserDO;
import org.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 存在，返回True；不存在，返回False
     */
    Boolean hasUsername(String username);
}
