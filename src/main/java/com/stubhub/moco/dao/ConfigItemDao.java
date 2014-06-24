package com.stubhub.moco.dao;

import java.util.ArrayList;

import com.stubhub.moco.model.ConfigItem;

/**
 * @author fuxie
 * @date 2014-6-19 ÏÂÎç12:54:06 
 */
public interface ConfigItemDao {
	/**
	* @Title: findAll 
	* @Description: get a list of all configItems from database. 
	* @return ArrayList<ConfigItem>  
	 */
	public ArrayList<ConfigItem> findAll();
	
	/**
	* @Title: findByAttr 
	* @Description: find a single ConfigItem Object through the value of attribute from database.
	* @param attr  an attribute of ConfigItem
	* @param value a variable value of ConfigItem's attribute  
	* @return ArrayList<ConfigItem>
	 */
	public ArrayList<ConfigItem> findByAttr(String attr, String value);

	/**
	* @Title: createNewItem 
	* @Description: create a new ConfigItem and save to database
	* @param item   ConfigItem
	 */
	public void createNewItem(ConfigItem item);

	/**
	* @Title: delete 
	* @Description: delete a ConfigItem object in database
	* @param item  ConfigItem 
	 */
	public void delete(ConfigItem item);
	
	/**
	* @Title: delete 
	* @Description: delete a configItem Object by id
	* @param @param id   
	 */
	public void delete(String id);
	
	/**
	* @Title: update 
	* @Description: update a ConfigItem object with id not to change  in database
	* @param item ConfigItem  
	 */
	public void update(ConfigItem item);
}
