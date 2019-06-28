package com.learn.cuController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.cuModel.ContactUsModel;
import com.learn.cuService.ContactUsService;

@RestController
public class ContactUsController {
	@Autowired
	ContactUsService cs;
	
	@RequestMapping(method=RequestMethod.POST, value="/issue")
	public String issuePost(@RequestBody ContactUsModel cm) {
		String ret=cs.postIssue(cm);
		return ret;
	}

}
