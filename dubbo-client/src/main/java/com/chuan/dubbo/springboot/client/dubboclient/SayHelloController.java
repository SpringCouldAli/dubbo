package com.chuan.dubbo.springboot.client.dubboclient;

import com.chuan.dubbo.springboot.study.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:曲终、人散
 * Date:2019/9/1 0:09
 */
@RestController
public class SayHelloController {

    @Reference(loadbalance = "random",timeout = 1,cluster = "failover",mock = "com.chuan.dubbo.springboot.client.dubboclient.SayHelloServiceMock")
    private ISayHelloService sayHelloService;

    @GetMapping("/sayHello")
    private String sayHello(){
        String s = sayHelloService.sayHello("");
        return s;
    }

}
