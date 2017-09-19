package com.sqa.td.helpers;

import java.io.*;
import java.util.*;
import java.util.NoSuchElementException;

import org.apache.commons.io.*;
import org.apache.log4j.*;
import org.openqa.selenium.*;

public class AutoBasics
{

	public static String getProp(String propName, String fileLocation, String fileName, Logger logger)
	{
		Properties props = new Properties();  // declare a Properties type
											  // variable props and initialize
											  // it the default constructor
		InputStream input;  // declare an InputStream type variable input
		try // try the following below
		{
			input = new FileInputStream(fileLocation + fileName); // initialize
																	 // the
																	 // input
																	 // variable
																	 // with the
																	 // FileInputStream
																	 // class
																	 // passing
																	 // the
																	 // parameter
																	 // file
																	 // location
																	 // and file
																	 // name
			props.load(input); // call the method load with the parameter of
								 // input with props
		} catch (FileNotFoundException e) // a file not found error will occur,
											 // this is how you handle it
		{
			logger.warn("Can not load config properties file because it was not found: " + fileName); // call
																										 // the
																										 // method
																										 // warn
																										 // and
																										 // output
																										 // a
																										 // string
																										 // with
																										 // the
																										 // filename
																										 // with
																										 // logger
		} catch (IOException e) // a file cannot be read error will occur, this
								 // is how you handle it
		{
			logger.warn("Can not load config properties file can not be read: " + fileName); // call
																							 // the
																							 // method
																							 // warn
																							 // and
																							 // output
																							 // a
																							 // string
																							 // with
																							 // the
																							 // filename
																							 // with
																							 // logger
		}
		return props.getProperty(propName); // return the property of prop name
	}

	public static boolean isElementPresent(WebDriver driver, By by, Logger logger)
	{
		try // try the following below
		{
			WebElement element = driver.findElement(by); // declare and assign
														 // element of type
														 // WebElement with the
														 // driver by
														 // findElement method
														 // passing the
														 // parameter by the
														 // "id" attributes
			return true; // return true if the element is present
		} catch (NoSuchElementException e) // the element not found will occur,
											 // this is how you handle it
		{
			logger.warn("Element was not found: " + by); // call the method warn
														 // and output a string
														 // with the "id"
														 // attribute with
														 // logger
			return false; // return false if the element is not present
		}
	}

	public static boolean takeScreenshot(String fileLocation, String fileName, WebDriver driver, Logger logger)
	{
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // declare
																					 // and
																					 // assign
																					 // srcFile
																					 // of
																					 // type
																					 // File.
																					 // Call
																					 // the
																					 // method
																					 // getScreenshotAs
																					 // and
																					 // the
																					 // output
																					 // will
																					 // be
																					 // in
																					 // a
																					 // temp
																					 // file
		try // try the following below
		{
			FileUtils.copyFile(srcFile, new File(fileLocation + "/" + fileName + ".png")); // the
																							 // method
																							 // copyFile
																							 // with
																							 // the
																							 // parameter
																							 // source
																							 // file
																							 // and
																							 // the
																							 // target
																							 // destination
																							 // with
																							 // FileUtils
			return true; // return true if taking the screenshot is successful
		} catch (IOException e) // the file cannot be capture will occur, this
								 // is how you handle it
		{
			logger.warn("Screenshot " + fileName + " was not captured to disk correctly."); // call
																							 // the
																							 // method
																							 // warn
																							 // and
																							 // output
																							 // a
																							 // string
																							 // with
																							 // the
																							 // filename
																							 // with
																							 // logger.
			return false; // return false if taking the screenshot is not
							 // successful
		}
	}
}
