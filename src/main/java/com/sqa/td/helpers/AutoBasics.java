package com.sqa.td.helpers;

import java.io.*;
import java.util.*;

import org.apache.log4j.*;

public class AutoBasics
{

	public static String getProp(String propName, String fileLocation, String fileName, Logger logger)
	{
		Properties props = new Properties();
		InputStream input;
		try
		{
			input = new FileInputStream(fileLocation + fileName);
			props.load(input);
		} catch (FileNotFoundException e)
		{
			logger.warn("Can not load config properties file because it was not found: " + fileName);
		} catch (IOException e)
		{
			logger.warn("Can not load config properties file can not be read: " + fileName);
		}
		return props.getProperty(propName);
	}
}
