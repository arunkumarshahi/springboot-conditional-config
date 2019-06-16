package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

public class JdbcUserDAO implements UserDAO {

	public JdbcUserDAO() {
		
	}
	@Override
	public List<String> getAllUserNames() {
		String[] users = new String[] { "jdbc1", "jdbc2", "jdbc3" };
		return Arrays.asList(users);
	}

}
