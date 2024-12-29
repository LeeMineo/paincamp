package com.example.paincamp.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/testpost")
@Controller
public class TestpostController {
    //PathVariable : url값 변수로 받아오는 기능
    @GetMapping("/{page}")
    public String page(@PathVariable String page){
        return "testpost/" + page;
    }
    //PathVariable을 여러개사용가능. (/ 사용 조건하에)
    @GetMapping("/{page}/{id}")
    public String page2(@PathVariable String page, @PathVariable String id){
        return "testpost/" + page;
    }

}