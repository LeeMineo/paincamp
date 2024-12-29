package com.example.paincamp.service;


import com.example.paincamp.domain.Testpost;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface TestpostService {
    Map<String, Object> createTestpost(Map<String, Object> params);
    List<Testpost> listTestpost();
    Testpost detailTestpost(Long id);
    Map<String, Object> updateTestpost(Map<String, Object> params);
    Map<String, Object> deleteTestpost(Long id);

}

