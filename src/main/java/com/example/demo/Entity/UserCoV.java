package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class UserCoV {
	@JsonProperty("email") public String email ;
	@JsonProperty("password") public String password ;
}
