package com.sqa.td.imdb;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class IMDBElementTest extends IMDBTest
{

	@Test
	public void latestNewsTest()
	{
		WebElement element = getDriver().findElement(
				By.cssSelector("#main div.article:nth-child(17) .ninja_left> div:nth-child(1) .pri_image"));
	}

	@Test
	public void newOnTVTonightTest()
	{
		WebElement element = getDriver().findElement(By.cssSelector("#tnw div.primary-content .headlines"));
	}
}
