package com.zhangke.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhangKe
 * @Description:
 * @Date: 2018/9/21 15:37
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping(value = "/hello")
    public String sayHello() {

        return "Hello World!";
    }

    @GetMapping(value = "/{id}")
    public Long printId(@PathVariable Long id) {

        return id;
    }
}
