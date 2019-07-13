package com.fuqin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fuqin.service.UserService;

@Controller
@RequestMapping("/index")
public class IndexHandler {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"tosuccess"},method=RequestMethod.GET)
	public String tosuccess(){


		int count = userService.selectcountbyorderno();
		System.out.println(count);
		
		return "success";
	}
	
	@RequestMapping("/getJson")
	@ResponseBody
	public String getJson(){
		
		return "111111";
	}
	
	
}
