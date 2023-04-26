package com.example.test.demot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Choice {
	
	private Integer index;
    private Message message;
   @JsonProperty("finish_reason")
    private String finishReason;

}
