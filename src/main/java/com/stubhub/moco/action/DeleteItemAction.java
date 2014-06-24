package com.stubhub.moco.action;


import java.util.logging.Level;


import org.springframework.beans.factory.annotation.Autowired;

import com.stubhub.moco.service.ConfigItemService;
import com.stubhub.moco.util.LogUtil;

/**
 * @author fuxie
 * @date 2014-6-20 ÏÂÎç02:32:14 
 */
@SuppressWarnings("serial")
public class DeleteItemAction extends BaseAction{
	@Autowired
	private ConfigItemService configItemService = null;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		String id = request().getParameter("itemid");
		
		LogUtil.getInstance().log(Level.INFO, "DeleteAction is called");
	
		configItemService.deleteConfigItemById(id);
		return "success";
	}

	public ConfigItemService getConfigItemService() {
		return configItemService;
	}

	public void setConfigItemService(ConfigItemService configItemService) {
		this.configItemService = configItemService;
	}
}
