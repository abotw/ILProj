package com.ilproj.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    public static void main(String[] args) {
        System.out.println("test1");
        System.out.println("test2");
        System.out.println("2023.4.26 text");
    }
    @RequestMapping("/test")
    public String ww(){
        return "hello";
    }

}
