package com.genericApi.brico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genericApi.brico.entities.Test;
import com.genericApi.brico.services.ITestService;

@RestController
@CrossOrigin("*")
public class TestController {

	@Autowired
	ITestService testService;
	
	@GetMapping("/test")
	public ResponseEntity<List<Test>> getTest(){
		List<Test> listTest =testService.getTest();
		return new ResponseEntity<>(listTest, HttpStatus.BAD_REQUEST);
	}
}
