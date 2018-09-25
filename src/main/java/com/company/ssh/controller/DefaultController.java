package com.company.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping
@Controller
public class DefaultController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        List list =new ArrayList();
        list.add("s");
        System.out.println(list);
        return "abc";
    }
    @RequestMapping("")
    public String index(){
        String a = "abc";
        List list = new ArrayList();
        list.add("sss");
        System.out.println(1234);
        System.out.println("mm");
        return "index/index";
    }
}
