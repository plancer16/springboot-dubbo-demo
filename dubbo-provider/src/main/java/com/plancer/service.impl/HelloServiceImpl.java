package com.plancer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.plancer.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author plancer16
 * @create 2021/2/14 14:00
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello "+ name;
    }
}
