package com.chuan.dubbo.springboot.client.dubboclient;

import com.chuan.dubbo.springboot.study.ISayHelloService;

/**
 * author:曲终、人散
 * Date:2019/9/1 11:33
 */
public class SayHelloServiceMock implements ISayHelloService {
    @Override
    public String sayHello(String s) {
        return "服务降级了。。。。。";
    }
}
