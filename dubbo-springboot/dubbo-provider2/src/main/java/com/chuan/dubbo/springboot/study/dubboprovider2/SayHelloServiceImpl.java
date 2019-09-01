package com.chuan.dubbo.springboot.study.dubboprovider2;


import com.chuan.dubbo.springboot.study.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * author:曲终、人散
 * Date:2019/8/31 23:42
 */

@Service(loadbalance = "roundrobin",timeout = 5000)
public class SayHelloServiceImpl  implements ISayHelloService {

    @Override
    public String sayHello(String str) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("--------------");
        return "Hello Dubbo";
    }
}
