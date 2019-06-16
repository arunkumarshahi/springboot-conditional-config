package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.JdbcUserDAO;
import com.example.demo.model.MongoDBDatabaseTypeCondition;
import com.example.demo.model.MongoUserDAO;
import com.example.demo.model.MySQLDatabaseTypeCondition;
import com.example.demo.model.UserDAO;
//@Configuration
@SpringBootApplication
public class EmployeeDataSourceConfig {
	static Logger logger = LoggerFactory.getLogger(SpringbootConditionalConfigApplication.class);
	@Bean(name = "userDAO")
	@Conditional(MySQLDatabaseTypeCondition.class)
	public UserDAO jdbcUserDAO() {
		UserDAO u = new JdbcUserDAO();
		logger.info("jdbcUserDAO = ", u.getAllUserNames().toString());
		return u;
	}
	@Bean(name = "userDAO")
	@Conditional(MongoDBDatabaseTypeCondition.class)
	public UserDAO mongoUserDAO() {
		UserDAO u = new MongoUserDAO();
		logger.info("mongoUserDAO = ", u.getAllUserNames().toString());
		return u;
	}
}
