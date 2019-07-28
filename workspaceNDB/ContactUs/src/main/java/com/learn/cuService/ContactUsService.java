package com.learn.cuService;

import java.util.ArrayList;
import java.util.List;

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

	public List<ContactUsModel> getAllDetails() {
		// TODO Auto-generated method stub
		System.out.println("in service");
		ContactUsModel model;
		List<ContactUsEntity> list1=repo.findAll();
		List<ContactUsModel> list = new ArrayList<ContactUsModel>();
//		list1.stream().map(ce -> {
//			model= new ContactUsModel();
//			model.setMessageIssue(ce.getMessageIssue());
//			System.out.println(ce.getMobileNumber());
//			model.setMobileNumber(ce.getMobileNumber());
//		});
		
		for(ContactUsEntity ce: list1) {
			model= new ContactUsModel();
			model.setMessageIssue(ce.getMessageIssue());
			System.out.println(ce.getMobileNumber());
			model.setMobileNumber(ce.getMobileNumber());
			list.add(model);
		}
		
		return list;
	}

}
