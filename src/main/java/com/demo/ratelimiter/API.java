package com.demo.ratelimiter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {


    @GetMapping("/hello")
    public String sampleGet(){
        return "hello";
    }


}
