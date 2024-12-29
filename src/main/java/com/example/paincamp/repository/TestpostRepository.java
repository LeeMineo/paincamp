package com.example.paincamp.repository;

import com.example.paincamp.domain.Testpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestpostRepository extends JpaRepository<Testpost, Long>{
}
