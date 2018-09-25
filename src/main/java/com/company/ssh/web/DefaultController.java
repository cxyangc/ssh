package com.company.ssh.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("")
@Controller
public class DefaultController {
	
	@RequestMapping("")
    public String index(Model model){
	    return "index/index";
    }
    @RequestMapping("data")
    @ResponseBody
    public String data(HttpServletRequest request){
	    return "";
    }
	
}
