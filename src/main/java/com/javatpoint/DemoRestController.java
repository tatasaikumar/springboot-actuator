package com.javatpoint;
import java.beans.JavaBean;

import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoRestController 
{
	@GetMapping("/hello")
	public String hello() 
	{
	return "Hello User!";
	}
	
	/*
	 * @Bean public HttpTraceRepository http() { return new
	 * InMemoryHttpTraceRepository(); }
	 */
}
