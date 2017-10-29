package com.deno.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deno.mq.sender.SimpleSender;

@RestController
@RequestMapping("/rabbit")
public class SimpleController {
    @Autowired
    private SimpleSender simpleSender;

    @GetMapping("/hello")
    public String hello() {
        simpleSender.send();
        return "success";
    }
}
