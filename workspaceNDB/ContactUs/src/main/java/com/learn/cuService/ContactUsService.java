package com.learn.cuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.cuEntity.ContactUsEntity;
import com.learn.cuModel.ContactUsModel;
import com.learn.cuRepo.ContactUsRepo;

@Service
public class ContactUsService {
	@Autowired
	ContactUsRepo repo;

	public String postIssue(ContactUsModel cm) {
		// TODO Auto-generated method stub
		ContactUsEntity contactUsEntity=new ContactUsEntity();
		contactUsEntity.setMobileNumber(cm.getMobileNumber());
		contactUsEntity.setMessageIssue(cm.getMessageIssue());
		repo.save(contactUsEntity);
		return "Message saved in db";
	}

}
