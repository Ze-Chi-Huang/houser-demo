package com.house.demo.model;

public class HelloWorld {
	
	private String name;
	private String hello;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	@Override
	public String toString() {
		return "HelloWorld [name=" + name + ", hello=" + hello + "]";
	}
	
	
}
