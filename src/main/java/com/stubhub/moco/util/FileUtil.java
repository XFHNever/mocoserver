package com.stubhub.moco.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;


public class FileUtil {
	/**
	* @Title: writeToFile 
	* @Description: write content to file
	* @param  fileName String
	* @param  content  String  
	 */
	public static void writeToFile(String fileName, String content) {
		FileWriter writer = null;
		
		try {	
			writer = new FileWriter(fileName);
			writer.write("[\n");
			writer.write(content);
			writer.write("\n]");
			
			LogUtil.getInstance().log(Level.INFO, "FileUtil-writeToFile");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void updateFile(String fileName, String content) {
		FileWriter writer = null;
			
		try {	
			writer = new FileWriter(fileName);
			writer.write(content);
			
			LogUtil.getInstance().log(Level.INFO, "FileUtil-updateFile: " + content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String readFromFile(String fileName) {
		String result = "";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(new File(fileName)));
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {  
               result = result + tempString + "\n";
            } 
			LogUtil.getInstance().log(Level.INFO, "FileUtil-readFromFile" + result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static boolean deleteFromFile(String fileName,String content) {
		boolean result = false;
		
		String existString =  readFromFile(fileName);
		
		LogUtil.getInstance().log(Level.INFO, "content:" + content);
		
		if(existString.contains(content)) {
			existString = existString.replace(",\n" + content, "");
			result = true;
			LogUtil.getInstance().log(Level.INFO, "replaceString" + existString);
			
			updateFile(fileName, existString);
		}
		
		
		LogUtil.getInstance().log(Level.INFO, "FileUtil-deleteFromFile" + result);
		return result;
	}
}
