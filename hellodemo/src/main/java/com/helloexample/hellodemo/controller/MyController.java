package com.helloexample.hellodemo.controller;

import com.helloexample.hellodemo.implement.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @GetMapping("/checking")
    public String check(){
        return myImpl.getData();
    }
}
