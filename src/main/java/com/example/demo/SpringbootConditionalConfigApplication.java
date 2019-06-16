package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.UserDAO;

@SpringBootApplication
public class SpringbootConditionalConfigApplication implements CommandLineRunner {
	static Logger logger = LoggerFactory.getLogger(SpringbootConditionalConfigApplication.class);
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private UserDAO userDAO;

	@Override
	public void run(String... args) throws Exception {
		if (userDAO != null) {
			System.out.println("Registered userDAO == " + userDAO);
			List<String> userList = userDAO.getAllUserNames();
			String[] beans = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);
			if (userList != null)
				System.out.println("Registered bean == " + userList);
		}

	}

	public static void main(String[] args) {
		logger.info("**** SpringApplication called ");
		SpringApplication.run(SpringbootConditionalConfigApplication.class, args);

	}

}
