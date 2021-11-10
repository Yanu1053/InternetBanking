package com.internetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig(){
		File src = new File("./configarations/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getApplicationURL() {
		String URL = pro.getProperty("BaseURL");
		return URL;
	}

	public String getUsername() {
		String username = pro.getProperty("UserName");
		return username;

	}
	public String getPssword() {
		String password=pro.getProperty("Password");
		return password;
	}
	
	public String getChromepath() {
		String Chromepath=pro.getProperty("ChromePath");
		return Chromepath;
	}
	public String getfirefoxpath() {
		String Firefoxpath=pro.getProperty("FirePath");
		return Firefoxpath;
	}
	public String getIEpath() {
		String IEpath=pro.getProperty("IEPath");
		return IEpath;
	}
	
	
	
	
	
}
