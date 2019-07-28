package com.learn.agentInterface.controller;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.learn.agentInterface.model.ContactUs;
import com.learn.agentInterface.model.DashboardData;
import com.learn.agentInterface.model.LoginSign;
import com.netflix.discovery.EurekaClient;

@RestController
public class AgentInterfaceController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EurekaClient eurekaClient;
	
	@GetMapping("/allData/{mobileNo}")
	public LoginSign allData(@PathVariable Integer mobileNo){
		String url ="http://LoginSign/login/"+ mobileNo;
		System.out.println("url "+url);
		LoginSign cs= restTemplate.getForObject(url, LoginSign.class);
		System.out.println(cs.getName());
		System.out.println("in agent");
		return cs;
	}
	
	@GetMapping("/allContact")
	public JsonArray getAllContactUs(){
		//JSONArray arr;
		//ContactUs om;
		
		String url ="http://localhost:8000/getContactDetail/";
		System.out.println("in method");
		//System.out.println(restTemplate.getForObject(url, ContactUs.class));
		JsonArray jsonArray = new JsonParser().parse(restTemplate.getForObject(url, String.class)).getAsJsonArray();
		System.out.println(jsonArray);
	//	List<ContactUs> om=  (List<ContactUs>) restTemplate.getForObject(url, ContactUs.class);
//		JsonObject jsonObject = new JsonParser().parse(restTemplate.getForObject(url, String.class)).getAsJsonObject();
//		System.out.println(jsonObject);
		return jsonArray;
	}
	

}
