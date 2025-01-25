package org.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.shortlink.admin.dao.mapper")
public class ShortLinkAdmin {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdmin.class, args);
    }
}
