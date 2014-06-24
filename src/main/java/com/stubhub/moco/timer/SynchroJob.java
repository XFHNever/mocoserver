package com.stubhub.moco.timer;

import java.util.ArrayList;
import java.util.logging.Level;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.stubhub.moco.model.ConfigItem;
import com.stubhub.moco.service.ConfigItemService;
import com.stubhub.moco.util.ConfigItemUtil;
import com.stubhub.moco.util.FileUtil;
import com.stubhub.moco.util.LogUtil;

/**
 * @author fuxie
 * @date 2014-6-19 ÏÂÎç02:28:19 
 */
public class SynchroJob extends QuartzJobBean{
	public static final String JSONPATH = "C:\\Users\\fuxie\\Desktop\\server.json";
	private ConfigItemService configItemService;
	
	/* (non-Javadoc)
	 * @see org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org.quartz.JobExecutionContext)
	 */
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		
		ArrayList<ConfigItem> configItems = configItemService.getAll();
		
		
		FileUtil.writeToFile(JSONPATH, ConfigItemUtil.configItemToString(configItems));
		
		LogUtil.getInstance().log(Level.INFO, "JobBean is writing to file and item's size = " + configItems.size());
	}

	public ConfigItemService getConfigItemService() {
		return configItemService;
	}

	public void setConfigItemService(ConfigItemService configItemService) {
		this.configItemService = configItemService;
	}
}
