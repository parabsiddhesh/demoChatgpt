package com.example.test.demot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.demot.model.ChatGptRequest;
import com.example.test.demot.model.ChatgptResponse;
import com.example.test.demot.service.DemoService;

@RestController
@RequestMapping("/api")
public class DemoController {

	@Autowired
	DemoService demoService;

	@PostMapping("/getResp")
	public ChatgptResponse getRes(@RequestBody ChatGptRequest req) {
		return demoService.callgpt(req);
	}

	@GetMapping("/messages")
	public String getMessage() {
		return "Hello from Docker!";
	}

}
