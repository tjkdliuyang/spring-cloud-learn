package com.springcloud.springcloudeurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/api/v1/test1")
    public void test(){
        System.out.println("测试01");
    }
}
