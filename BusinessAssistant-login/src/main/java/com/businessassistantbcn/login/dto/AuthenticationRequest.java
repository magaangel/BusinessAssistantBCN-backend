package com.businessassistantbcn.login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // default constructor needed for JSON Parsing
@AllArgsConstructor
@Getter @Setter
public class AuthenticationRequest {
	
	private String email;
	private String password;
	
}