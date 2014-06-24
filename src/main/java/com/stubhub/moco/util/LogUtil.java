package com.stubhub.moco.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 
 * @author fuxie
 * @date 2014-6-19 ÏÂÎç01:29:07 
 */
public class LogUtil {
	private static LogUtil logUtil;
	private static Logger logger;
	
	private LogUtil() {
		try {
			initLogger();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Logger getInstance() {
		if(logUtil == null) {
			logUtil = new LogUtil();
		}
		
		return logger;
	}
	
	private void initLogger() throws IOException {
		logger = Logger.getLogger("mocoserver.log");
		FileHandler handler = new FileHandler("C:/Users/fuxie/desktop/mocoserver.log",true);
		logger.addHandler(handler);
		logger.setLevel(Level.ALL);
		
		SimpleFormatter formatter = new SimpleFormatter();
		handler.setFormatter(formatter);
	}
}
