package com.example.test.demot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Message {
	
	 private String role;
	 private String content;

}
