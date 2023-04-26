package com.example.test.demot.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
//@Data
public class OpenAIConfig {
	
	public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";
    //public static final String API_KEY = "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";
    public static final String MODEL = "text-davinci-003";
    public static final Integer MAX_TOKEN = 300;
    public static final Double TEMPERATURE = 0.0;
    public static final Double TOP_P = 1.0;
    public static final String MEDIA_TYPE = "application/json; charset=UTF-8";
    public static final String URL = "https://api.openai.com/v1/completions";
}
