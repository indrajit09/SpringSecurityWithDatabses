package com.marlabs.SpringBoot_Security_Rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@RequestMapping("/login")
    public String userValidation() {
        return "User: Successfully logged in !";
    }
}