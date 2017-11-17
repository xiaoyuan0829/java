package com.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class ViewServiceImpl implements ViewService {

	public String helloService() {
		return "index";
	}

}
