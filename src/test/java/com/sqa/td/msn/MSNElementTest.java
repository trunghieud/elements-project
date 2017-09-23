package com.sqa.td.msn;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class MSNElementTest extends MSNTest
{

	@Test
	public void locateMostViewSectionTest()
	{
		WebElement element =
				getDriver().findElement(By.xpath(".//*[@id='main']/div[5]/ul/li[13]/div/ul/li[1]/a/span[1]"));
	}

	@Test
	public void locateNewsArticleTest()
	{
		WebElement element =
				getDriver().findElement(By.xpath(".//*[@id='main']/div[6]/div/div/div[2]/div/ul[1]/li/a/div/h3"));
	}

	@Test
	public void locateSportMenuBarTest()
	{
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='main']/div[9]/div/div/div[1]/ul/li[2]/a"));
	}

	@Test
	public void locateTodayWeatherTest()
	{
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='main']/div[3]/div/div/div[1]/a/div"));
	}
}
