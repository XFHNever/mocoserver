package com.stubhub.moco.util;

import java.util.ArrayList;

import com.stubhub.moco.model.ConfigItem;

/**
 * @author fuxie
 * @date 2014-6-19 обнГ03:44:28 
 */
public class ConfigItemUtil {
	
	/**
	* @Title: ConfigItemToString 
	* @Description: convert ArrayList<ConfigItem> to String
	* @param items ArrayList<ConfigItem> 
	* @return String   
	 */
	public static String configItemToString(ArrayList<ConfigItem> items) {
		String result  = "";
		int size = items.size();
		
		if(size > 0) {
			for(int i = 0; i < size-1; i++) {
				result = result + items.get(i).getContent() + ",\n";
			}
			result = result + items.get(size-1).getContent();
		}
		
		return result;
	}
}
