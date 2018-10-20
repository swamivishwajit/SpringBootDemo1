package com.vishwajitswami.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Vishwajit
 *
 */
@RestController
public class HomeController {
	
	@GetMapping(value="/")
	public String hellowMessage(){
		return "Hello Welcome to Swami Vishwajit Tutorials!";
	}

}
