package com.imusic.springbootdemo.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.imusic.springbootdemo.entity.User;

@Controller
public class HomeController {

	@Autowired
	private User user;
	@RequestMapping(value="/springboot/index")
	public String index(){
		System.out.println(user);
		return "index";
	}
}
