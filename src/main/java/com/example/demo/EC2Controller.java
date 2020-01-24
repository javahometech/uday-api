package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EC2JsonService;

@RestController
public class EC2Controller {
	@GetMapping("/instances")
	public String instances() {
		try {
			return EC2JsonService.getInstances();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "One Instance";
	}
	
	@GetMapping("/instance/{id}")
	public Object instance(@PathVariable(name = "id") String id) {
		try {
			return EC2JsonService.getInstance(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "One Instance";
	}
}
