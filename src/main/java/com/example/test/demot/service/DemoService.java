package com.example.test.demot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.test.demot.model.ChatGptRequest;
import com.example.test.demot.model.ChatRequest;
import com.example.test.demot.model.ChatgptResponse;
import com.example.test.demot.model.OpenAIConfig;

@Service
public class DemoService {
	
	private static RestTemplate restTemplate = new RestTemplate();
	
	@Value("${spring.demot.key}")
	public String key;
	
	public HttpEntity<ChatRequest> buildHttpEntity(ChatRequest request){
		System.out.println(key);
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		header.add(OpenAIConfig.AUTHORIZATION, OpenAIConfig.BEARER+key);
		
		return new HttpEntity<ChatRequest>(request,header);
		
	}
	
	public ChatgptResponse getResponse(HttpEntity<ChatRequest> reqyestentity) {
		ResponseEntity<ChatgptResponse> res = restTemplate.postForEntity(OpenAIConfig.URL, reqyestentity, ChatgptResponse.class);
		return res.getBody();
	}
	
	public ChatgptResponse callgpt(ChatGptRequest request) {
		return this.getResponse(
                this.buildHttpEntity(
                        new ChatRequest(
                        		OpenAIConfig.MODEL,
                                request.getMessage(),
                                OpenAIConfig.TEMPERATURE,
                                OpenAIConfig.MAX_TOKEN,
                                OpenAIConfig.TOP_P)));
	}

}
