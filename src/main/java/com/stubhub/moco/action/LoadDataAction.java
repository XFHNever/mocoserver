package com.stubhub.moco.action;

import java.util.ArrayList;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;

import com.stubhub.moco.model.ConfigItem;
import com.stubhub.moco.service.ConfigItemService;
import com.stubhub.moco.util.LogUtil;

/**
 * @author fuxie
 * @date 2014-6-20 ÏÂÎç01:17:13 
 */
@SuppressWarnings("serial")
public class LoadDataAction extends BaseAction{
	private ArrayList<ConfigItem> items = null;
	
	@Autowired
	private ConfigItemService configItemService = null;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		LogUtil.getInstance().log(Level.INFO, "LoadDataAction");
		items = configItemService.getAll();
		return "main";
	}

	public ArrayList<ConfigItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<ConfigItem> items) {
		this.items = items;
	}

	public ConfigItemService getConfigItemService() {
		return configItemService;
	}

	public void setConfigItemService(ConfigItemService configItemService) {
		this.configItemService = configItemService;
	}
}
