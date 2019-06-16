package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SpringbootConditionalConfigApplication;
import com.example.demo.model.UserDAO;

@RestController
@RequestMapping(value = "/users")
public class ConditionalRestService {
	static Logger logger = LoggerFactory.getLogger(SpringbootConditionalConfigApplication.class);

	@Autowired
	private UserDAO userDAO;

	@GetMapping("")
	public List<String> listPosts() {
		return userDAO.getAllUserNames();
	}
}
