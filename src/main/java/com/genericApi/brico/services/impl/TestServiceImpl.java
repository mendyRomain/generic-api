package com.genericApi.brico.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genericApi.brico.entities.Test;
import com.genericApi.brico.repository.TestRepository;
import com.genericApi.brico.services.ITestService;

@Service
public class TestServiceImpl implements ITestService{

	@Autowired
	TestRepository testRepo;
	
	public List<Test> getTest() {
		
		return testRepo.findAll();
	}

}
