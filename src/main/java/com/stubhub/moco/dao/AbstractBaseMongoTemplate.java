package com.stubhub.moco.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.mongodb.core.MongoTemplate;

public abstract class AbstractBaseMongoTemplate implements ApplicationContextAware{
	protected MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {

        MongoTemplate mongoTemplate = applicationContext.getBean("mongoTemplate", MongoTemplate.class);

        setMongoTemplate(mongoTemplate);
    }

}
