package com.awen.user.tool;

import com.awen.feign.clients.ShiroClient;
import com.awen.feign.entity.Shiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShiroTool {

    @Autowired
    private ShiroClient shiroClient;

    public Shiro check(String token) {
        //feign远程调用
        //返回
        return shiroClient.check(token);
    }
}
