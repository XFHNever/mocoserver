package com.stubhub.moco.action;

import java.util.Date;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;

import com.stubhub.moco.model.ConfigItem;
import com.stubhub.moco.service.ConfigItemService;
import com.stubhub.moco.util.LogUtil;

/**
 * @author fuxie
 * @date 2014-6-20 ÏÂÎç02:55:05 
 */
@SuppressWarnings("serial")
public class ModifyItemAction extends BaseAction{
	private String id = null;
	private String content = null;
	
	@Autowired
	private ConfigItemService configItemService = null;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		ConfigItem configItem = new ConfigItem(id, content, new Date());
		configItemService.modifyConfigItem(configItem);
		
		LogUtil.getInstance().log(Level.INFO, "ModifyItemAction is called!" + content);
		
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
