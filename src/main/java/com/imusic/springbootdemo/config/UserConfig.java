package com.imusic.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imusic.springbootdemo.entity.User;

@Configuration

public class UserConfig {

	@Bean
	public User user(){
		return new User(1,"xx",26);
	}
}
