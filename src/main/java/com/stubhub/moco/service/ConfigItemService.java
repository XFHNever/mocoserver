package com.stubhub.moco.service;

import java.util.ArrayList;

import com.stubhub.moco.model.ConfigItem;

/**
 * @author fuxie
 * @date 2014-6-19 ÏÂÎç03:50:57 
 */
public interface ConfigItemService {
	/**
	* @Title: createNewItem 
	* @Description: create a new ConfigItem
	* @param item  ConfigItem
	 */
	public void createNewItem(ConfigItem item);
	
	/**
	* @Title: getAll 
	* @Description: get a list of all configItems
	* @return ArrayList<ConfigItem>   
	 */
	public ArrayList<ConfigItem> getAll();
	
	/**
	* @Title: modifyConfigItem 
	* @Description: update a ConfigItem object with id not to change
	* @param item ConfigItem
	 */
	public void modifyConfigItem(ConfigItem item);
	
	/**
	* @Title: deleteConfigItem 
	* @Description: delete a ConfigItem object
	* @param item   
	 */
	public void deleteConfigItem(ConfigItem item);
	
	/**
	* @Title: deleteConfigItemById 
	* @Description: delete a ConfigItem object by id
	* @param @param id   
	 */
	public void deleteConfigItemById(String id);
}
