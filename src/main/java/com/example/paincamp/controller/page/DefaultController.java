package com.example.paincamp.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션 지정 : 해당 클래스가 컨트롤러임을 지정
@RequestMapping("")
public class DefaultController {
    @GetMapping({"/test"})
    public String index() {
        return "test";
    }
}