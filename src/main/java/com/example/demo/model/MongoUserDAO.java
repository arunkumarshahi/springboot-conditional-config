package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

public class MongoUserDAO implements UserDAO {
	public MongoUserDAO() {

	}

	@Override
	public List<String> getAllUserNames() {
		String[] users = new String[] { "mongo1", "mongo2", "mongo3" };
		return Arrays.asList(users);
	}

}
