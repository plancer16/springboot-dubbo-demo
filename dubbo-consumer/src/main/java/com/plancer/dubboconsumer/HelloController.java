package com.plancer.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.plancer.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author plancer16
 * @create 2021/2/14 14:16
 */
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("plancer"));
        return hello;
    }
}
