package com.stubhub.moco.dao.impl;

import java.util.ArrayList;
import java.util.logging.Level;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.stubhub.moco.dao.AbstractBaseMongoTemplate;
import com.stubhub.moco.dao.ConfigItemDao;
import com.stubhub.moco.model.ConfigItem;
import com.stubhub.moco.util.LogUtil;

/**
 * @author fuxie
 * @date 2014-6-19 ÏÂÎç12:54:28 
 */
public class ConfigItemDaoImpl extends AbstractBaseMongoTemplate implements ConfigItemDao{

	/* (non-Javadoc)
	 * @see com.stubhub.moco.dao.ConfigItemDao#findAll()
	 */
	public ArrayList<ConfigItem> findAll() {
		LogUtil.getInstance().log(Level.INFO, "ConfigItemDaoImpl' findAll is called");
		
		return (ArrayList<ConfigItem>) mongoTemplate.findAll(ConfigItem.class);
	}

	/* (non-Javadoc)
	 * @see com.stubhub.moco.dao.ConfigItemDao#findByAttr(java.lang.String, java.lang.String)
	 */
	public ArrayList<ConfigItem> findByAttr(String attr, String value) {
		LogUtil.getInstance().log(Level.INFO, "ConfigItemDaoImpl's findByAttr is called");
		
		Criteria criteria = Criteria.where(attr).is(value);
		Query query = new Query(criteria);
		
		return (ArrayList<ConfigItem>) mongoTemplate.find(query, ConfigItem.class);
	}

	/* (non-Javadoc)
	 * @see com.stubhub.moco.dao.ConfigItemDao#createNewItem(com.stubhub.moco.model.ConfigItem)
	 */
	public void createNewItem(ConfigItem item) {
		LogUtil.getInstance().log(Level.INFO, "ConfigItemDaoImpl's createNewItem is called");
		
		mongoTemplate.insert(item);
	}

	/* (non-Javadoc)
	 * @see com.stubhub.moco.dao.ConfigItemDao#delete(com.stubhub.moco.model.ConfigItem)
	 */
	public void delete(ConfigItem item) {
		LogUtil.getInstance().log(Level.INFO, "ConfigItemDaoImpl's delete is called");
		
		mongoTemplate.remove(item);
	}

	/* (non-Javadoc)
	 * @see com.stubhub.moco.dao.ConfigItemDao#delete(java.lang.String)
	 */
	public void delete(String id) {
		LogUtil.getInstance().log(Level.INFO, "ConfigItemDaoImpl's deletebyID is called");
		
		Criteria criteria = Criteria.where("id").is(id);
		Query query = new Query(criteria);
		
		mongoTemplate.remove(query, ConfigItem.class);
	}
	
	/* (non-Javadoc)
	 * @see com.stubhub.moco.dao.ConfigItemDao#update(com.stubhub.moco.model.ConfigItem)
	 */
	public void update(ConfigItem item) {
		LogUtil.getInstance().log(Level.INFO, "ConfigItemDaoImpl's update is called" + item.getId());
		
		Criteria criteria = Criteria.where("id").is(item.getId());
		Query query = new Query(criteria);
		
		Update update = Update.update("content", item.getContent()).set("date", item.getDate());
		
		mongoTemplate.updateFirst(query, update, ConfigItem.class);
	}



}
