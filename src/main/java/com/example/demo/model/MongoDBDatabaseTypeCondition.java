package com.example.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.example.demo.SpringbootConditionalConfigApplication;

public class MongoDBDatabaseTypeCondition implements Condition {
	 Logger logger = LoggerFactory.getLogger(SpringbootConditionalConfigApplication.class);
	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
		String enabledDBType = System.getProperty("dbType");
		logger.info("enabledDBType === "+enabledDBType);
		return (enabledDBType != null && enabledDBType.equalsIgnoreCase("MONGODB"));
	}
}