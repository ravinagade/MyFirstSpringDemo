package com.helloexample.hellodemo.implement;

import com.helloexample.hellodemo.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {

    @Override
    public String getData(){
        return "Hello World";
    }
}
