package com.example.paincamp.service.impl;


import com.example.paincamp.domain.Testpost;
import com.example.paincamp.repository.TestpostRepository;
import com.example.paincamp.service.TestpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestpostServiceImpl implements TestpostService {

    private final TestpostRepository testpostRepository;
    public TestpostServiceImpl(
            TestpostRepository testpostRepository
    ) {
        this.testpostRepository = testpostRepository;
    }

    @Override
    public Map<String, Object> createTestpost(Map<String, Object> params) {
        System.out.println("createTestpost");
        Testpost testpost = new Testpost();
        testpost.setId(Long.parseLong(params.get("id") + ""));
        testpost.setTitle(params.get("title").toString());
        testpost.setContent(params.get("content").toString());
        testpost.setAuthor(params.get("author").toString());
        testpostRepository.save(testpost);
        return null;
    }

    @Override
    public List<Testpost> listTestpost() {
        return testpostRepository.findAll();
    }

    @Override
    public Testpost detailTestpost(Long id) {
        return testpostRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
    }

    @Override
    public Map<String, Object> updateTestpost(Map<String, Object> params) {
        System.out.println("updateTestpost");
        Testpost testpost = testpostRepository.findById(Long.parseLong(params.get("id") + "")).orElseThrow(() -> new RuntimeException(""));

        testpost.setTitle(params.get("title").toString());
        testpost.setContent(params.get("content").toString());
        testpost.setAuthor(params.get("author").toString());
        testpostRepository.save(testpost);
        return null;
    }

    @Override
    public Map<String, Object> deleteTestpost(Long id) {
        Testpost testpost = testpostRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
        testpostRepository.delete(testpost);
        return null;
    }
}
