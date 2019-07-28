package com.learn.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.model.LoginSignup;

@Service
//@Component("myService")
public class LoginSignupService {
	
//	@Autowired
//	LoginSignup signup;
	
	List<LoginSignup> list= Arrays.asList(
			new LoginSignup(1, "a1", "a2", "a3"),
			new LoginSignup(2, "as", "zx", "qw"));
	
	public LoginSignup login(Integer no) {
		return list.get(no);
	}

}
