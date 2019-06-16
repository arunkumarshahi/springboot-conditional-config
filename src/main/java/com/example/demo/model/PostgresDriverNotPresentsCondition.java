package com.example.demo.model;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PostgresDriverNotPresentsCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		try {
            Class.forName("org.postgresql.Driver");
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        }
	}

}
