package com.possenti.springsecurity.demo.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CrmUser {

	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String userName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String password;
	
	// constructor, getters/setters omitted for brevity
	
	
}