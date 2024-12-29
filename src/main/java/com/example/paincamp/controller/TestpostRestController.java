package com.example.paincamp.controller;

import com.example.paincamp.domain.Testpost;
import com.example.paincamp.service.TestpostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/testpost")
@RestController
public class TestpostRestController {

    private final TestpostService testpostService;
    public TestpostRestController(
            TestpostService testpostService
    ) {
        this.testpostService = testpostService;
    }

    @GetMapping("/create")
    public Map<String, Object> create(@RequestParam Map<String, Object> params){
        return testpostService.createTestpost(params);
    }
    @GetMapping("/list")
    public List<Testpost> list(){
        return testpostService.listTestpost();
    }
    @GetMapping("/detail")
    public Testpost detail(@RequestParam Long id){
        return testpostService.detailTestpost(id);

    }
    @GetMapping("/update")
    public Map<String, Object> update(@RequestParam Map<String, Object> params){
        return testpostService.updateTestpost(params);
    }
    @GetMapping("/delete")
    public Map<String, Object> delete(@RequestParam Map<String, Object> params){
        return testpostService.deleteTestpost(Long.parseLong(params.get("id") + ""));
    }
}