package com.flight.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.flight.service.entity.LoginEntity;
import com.flight.service.model.Login;
import com.flight.service.repository.LoginRepository;

public class LoginServiceImpl {
	 @Autowired
	    private LoginRepository loginRepository;

	    @GetMapping("/login")
	    public String userIsValid(Login login) {
	        LoginEntity loginEntity = this.loginRepository.findByUsernameAndPassword(login.getUsername(), login.getPassword());
	        if(loginEntity != null) {
	            return "addpassenger";
	        }
	        return "error404";
	    }
}
