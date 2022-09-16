package com.book;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class RequestController{

    @GetMapping("/get")
    public String get(){
        return "hello word";
    }
}
