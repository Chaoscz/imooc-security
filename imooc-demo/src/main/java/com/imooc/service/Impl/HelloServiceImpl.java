package com.imooc.service.Impl;

import com.imooc.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String greeting(String name) {
        System.out.println("greeting");
        return "Hello " + name;
    }
}
