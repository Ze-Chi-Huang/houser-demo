package com.house.demo.restcontroller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.house.demo.model.HelloWorld;

@RestController
@RequestMapping(value = "/api/hello")
public class HelloWorldApi {
	
	@Autowired
	HttpSession session;
	
	@GetMapping(value = "/hello")
	@CrossOrigin
	public ResponseEntity<Object> getHello(){
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setHello("你好");
		helloWorld.setName("Jacky");
		
		return new ResponseEntity<Object>(helloWorld, HttpStatus.OK);
	}
	
	@GetMapping(value = "/hello2")
	public ResponseEntity<Object> getHello2(){
		
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setHello("你好");
		helloWorld.setName("Jacky");
		
		HelloWorld helloWorld2 = new HelloWorld();
		helloWorld2.setHello("你好2");
		helloWorld2.setName("Jacky2");
		
		
		List<HelloWorld> list = new ArrayList<HelloWorld>();
		list.add(helloWorld);
		list.add(helloWorld2);
		
		return new ResponseEntity<Object>(list, HttpStatus.OK);
	}
}
