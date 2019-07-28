package com.learn.cuController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping("/getContactDetail")
	public @ResponseBody List<ContactUsModel> getContactDetails() {
		System.out.println("in controller");
		List<ContactUsModel> list=cs.getAllDetails();
		System.out.println(list.size());
		return list;
	}

}
