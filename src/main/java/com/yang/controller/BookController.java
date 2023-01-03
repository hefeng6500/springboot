package com.yang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

//    @Value("${lesson}")
//    private String lesson;
//
//    @Value("${server.port}")
//    private Integer port;
//
//    @Value("${enterprise.subject[0]}")
//    private String subject_00;

    @Autowired
    private Environment env;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==> "+id);
        System.out.println(env.getProperty("lesson"));
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("enterprise.subject[0]"));
//        System.out.println(lesson);
//        System.out.println(port);
//        System.out.println(subject_00);
        return "<h1>hello , spring boot!</h1>";
    }
}
