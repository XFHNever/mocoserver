package com.stubhub.moco.action;

import java.util.Date;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;

import com.stubhub.moco.model.ConfigItem;
import com.stubhub.moco.service.ConfigItemService;
import com.stubhub.moco.util.LogUtil;

/**
 * @author fuxie
 * @date 2014-6-19 ÏÂÎç01:46:04 
 */
@SuppressWarnings("serial")
public class CreateItemAction extends BaseAction{
	private String content;
	private Date date;
	
	@Autowired
	private ConfigItemService configItemService;
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		date = new Date();
		
		
		ConfigItem configItem = new ConfigItem(content, date);
		LogUtil.getInstance().log(Level.INFO, "date: " + date + ",configItem: " + configItem + ",configServer:" + configItemService);
		configItemService.createNewItem(configItem);
		
		LogUtil.getInstance().log(Level.INFO, "CreateItemAction is called!");
		return "success";
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


	public ConfigItemService getConfigItemService() {
		return configItemService;
	}


	public void setConfigItemService(ConfigItemService configItemService) {
		this.configItemService = configItemService;
	}
	
}
