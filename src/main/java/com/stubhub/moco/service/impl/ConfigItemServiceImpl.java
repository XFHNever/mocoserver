package com.stubhub.moco.service.impl;

import java.util.ArrayList;

import com.stubhub.moco.dao.ConfigItemDao;
import com.stubhub.moco.model.ConfigItem;
import com.stubhub.moco.service.ConfigItemService;

/**
 * @author fuxie
 * @date 2014-6-19 ÏÂÎç03:51:30 
 */
public class ConfigItemServiceImpl implements ConfigItemService{
	private ConfigItemDao configItemDao;
	/* (non-Javadoc)
	 * @see com.stubhub.moco.service.ConfigItemService#createNewItem(com.stubhub.moco.model.ConfigItem)
	 */
	public void createNewItem(ConfigItem item) {
		configItemDao.createNewItem(item);
	}

	/* (non-Javadoc)
	 * @see com.stubhub.moco.service.ConfigItemService#getAll()
	 */
	public ArrayList<ConfigItem> getAll() {
		return configItemDao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.stubhub.moco.service.ConfigItemService#modifyConfigItem(com.stubhub.moco.model.ConfigItem)
	 */
	public void modifyConfigItem(ConfigItem item) {
		configItemDao.update(item);
	}

	/* (non-Javadoc)
	 * @see com.stubhub.moco.service.ConfigItemService#deleteConfigItem(com.stubhub.moco.model.ConfigItem)
	 */
	public void deleteConfigItem(ConfigItem item) {
		configItemDao.delete(item);
	}
	
	/* (non-Javadoc)
	 * @see com.stubhub.moco.service.ConfigItemService#deleteConfigItemById(java.lang.String)
	 */
	public void deleteConfigItemById(String id) {
		configItemDao.delete(id);
	}

	public ConfigItemDao getConfigItemDao() {
		return configItemDao;
	}

	public void setConfigItemDao(ConfigItemDao configItemDao) {
		this.configItemDao = configItemDao;
	}


}
