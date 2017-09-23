/**
 * File Name: RocheTest.java<br>
 * Dam, Trung-Hieu<br>
 * Created: Sep 22, 2017
 */
package com.sqa.td.roche;

import org.openqa.selenium.*;
import org.testng.annotations.*;

import com.sqa.td.core.*;
import com.sqa.td.helpers.*;

/**
 * RocheTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Dam, Trung-Hieu
 * @version 1.0.0
 * @since 1.0
 */
public class RocheTest extends BasicTest
{

	public RocheTest()
	{
		super("http://www.roche.com");
	}

	@Test
	public void locatedMenu()
	{
		WebElement element = getDriver().findElement(By.cssSelector("#offcanvas-nav-trigger"));
		element.click();
		WebElement element2 =
				getDriver().findElement(By.cssSelector("#roche-nav-e5e642cb-6fc3-49d9-8c4a-52066b47b2e7>a"));
		element2.click();
		WebElement element3 = getDriver().findElement(
				By.cssSelector("#navigation div:nth-child(7) section:nth-child(2) article:nth-child(2) .internal"));
		element3.click();
		AutoBasics.takeScreenshot("screenshots/", "test2", getDriver(), getLog());
	}

	@Test
	public void locateGlobalLogo()
	{
		WebElement element = getDriver().findElement(By.cssSelector("#global-logo"));
		element.click();
	}

	@Test
	public void locateLanguageButton()
	{
		WebElement element = getDriver().findElement(By.cssSelector(".lang-button.f0.right"));
		element.click();
	}

	@Test
	public void locateSearchButton()
	{
		WebElement element = getDriver().findElement(By.cssSelector(".search-button.f0.left.icon-search"));
		element.click();
		WebElement element2 = getDriver().findElement(By.cssSelector(".search"));
		element2.sendKeys("careers");
		element2.sendKeys(Keys.RETURN);
		AutoBasics.takeScreenshot("screenshots/", "test", getDriver(), getLog());
	}
}
