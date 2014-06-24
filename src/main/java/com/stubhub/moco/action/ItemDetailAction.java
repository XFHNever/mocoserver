package com.stubhub.moco.action;

import java.util.Date;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;

import com.stubhub.moco.model.ConfigItem;
import com.stubhub.moco.util.LogUtil;

/**
 * @author fuxie
 * @date 2014-6-20 ÏÂÎç03:05:29 
 */
@SuppressWarnings("serial")
public class ItemDetailAction extends BaseAction {

	private ConfigItem configItem = null;
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public String execute() throws Exception {
		String id = request().getParameter("itemid");
		String content = request().getParameter("itemcontent");
		String date = request().getParameter("itemdate");
		
		configItem = new ConfigItem(id, content, new Date(date));
		
		LogUtil.getInstance().log(Level.INFO, "ItemDetailAction is called!");
		
		return "success";
	}
	public ConfigItem getConfigItem() {
		return configItem;
	}
	public void setConfigItem(ConfigItem configItem) {
		this.configItem = configItem;
	}
}
