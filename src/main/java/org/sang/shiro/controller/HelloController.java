package org.sang.shiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Autoor wzf
 * @DATE 2022/1/9
 * @Description
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello shiro!";
    }

    public static void main(String[] args) {
        System.out.println("hello git!");
        System.out.println("hello git ll!");
    }
}
