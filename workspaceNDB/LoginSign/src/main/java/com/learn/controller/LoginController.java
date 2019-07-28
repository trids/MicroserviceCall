package com.learn.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.SignUpEntity;
import com.learn.model.LoginSignup;
import com.learn.repository.LoginSignUpRepo;
import com.learn.service.LoginSignupService;


@RestController
public class LoginController {
	
	@Autowired
	LoginSignupService ls;
	
	@Autowired
	@Qualifier("repo")
	LoginSignUpRepo lr;
	
//	@Autowired
//	LoginSignup lm;
	

	@GetMapping(value="/login/{mobileNo}")
	public Optional<SignUpEntity> getLoginDetails( @PathVariable Integer mobileNo) {
		System.out.println("here");
		
		return lr.findById(mobileNo);
		//return ls.login(mobileNo);
	}
	
	@GetMapping(value="/login")
	public Integer getLoginDetails() {
		System.out.println("here");
		
		return (int) lr.count();
		//return ls.login(mobileNo);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/signUp", produces="application/json")
	public String signUpDetails(@RequestBody LoginSignup su) {
		System.out.println("---1----");
		SignUpEntity se=new SignUpEntity();
		se.setEmailId(su.getEmailId());
		se.setMobileNumber(su.getMobileNumber());
		se.setName(su.getName());
		se.setPassword(su.getPassword());
		System.out.println("inside post");
		lr.save(se);
		return se.getName()+" is added";
	}
}
