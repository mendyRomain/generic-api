package com.genericApi.brico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genericApi.brico.entities.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {

}
