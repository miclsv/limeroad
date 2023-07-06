package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class TestBaseClass {

protected static WebDriver driver;
protected static WebDriverWait wait;

public static void screenCapture()
{
	try {
		String filename = java.time.LocalDateTime.now().toString().replace(':','-');
		Path src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE).toPath();
		Path des = Paths.get("C:\\Users\\Michael\\JavaSelenium-workspace\\com.mvn\\Captured\\Nykaa"+filename+".png");
		Files.copy(src,des);
		} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void wait(int sec)
{
	
	try {
		Thread.sleep(1000*sec);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

public static void getDriver(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}
}
	
public static void goToURL(String URL)
{
	driver.get(URL);
	driver.manage().window().maximize();
}

public static void setValue(WebElement element,String value)
{
	((JavascriptExecutor)driver).executeScript("arguments[0].value='arguments[1]';", element,value);
}

public static void clickJS(WebElement element)
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
}

public static void scrollClick(WebElement element)
{
	scrollToElement(element);
	clickJS(element);
}

public static void scrollTo(int hor,int ver)
{
	((JavascriptExecutor)driver).executeScript("window.scrollTo(arguments[0],arguments[1]);",hor,ver);
}

public static void scrollBy(int hor,int ver)
{
	((JavascriptExecutor)driver).executeScript("window.scrollBy(arguments[0],arguments[1]);",hor,ver);
}
public static void scrollTop()
{

	((JavascriptExecutor)driver).executeScript("document.documentElement.scrollTop = 0;");
	
}

public static void scrollBottom()
{
	
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0, document.body.scrollHeight);");
	
}

public static void scrollUp() {

	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100);");
}

public static void scrollUp(int n)
{
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-(arguments[0]*100));",n);
}



public static void scrollDown() {

	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100);");
}

public static void scrollDown(int n) {

	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,(arguments[0]*100));",n);
}
public static void scrollToElement(WebElement element)
{
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
}


public static void screenShot()
	{
		File captured = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		fileCopy(captured);
	}

	public static void fileCopy(File captured) 
	{
		try {
			
			String filename = java.time.LocalDateTime.now().toString().replace(':','-');
			
			Path dest = Paths.get("C:\\Users\\Michael\\JavaSelenium-workspace\\JSM\\ScreenShots\\"+filename+".png");
			
			Files.copy( Paths.get(captured.getPath()),dest);
		} 
		catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File copy failed");
		}
		
	}

	static public Alert alert()
	{
		return driver.switchTo().alert();
	}
	
	static public String alertHandle(boolean ok)
	{
		String msg = driver.switchTo().alert().getText();
		
		if (ok) {
			
			driver.switchTo().alert().accept();
				}
		else
		{
			driver.switchTo().alert().dismiss();
		}
	
	return msg;	
	}


static public void alertHandle(String val)

{
	
	driver.switchTo().alert().sendKeys(val);
	driver.switchTo().alert().accept();
	
}

static public String alertGetMsg()
{
	return driver.switchTo().alert().getText();
}


static public void clickElement(WebElement element) {

	element.click();
}

static public void inputValues( String value,WebElement element)
{
	element.sendKeys(value);
}


public static void explicitWait(int sec,String toBe,WebElement element)
{
	wait = new WebDriverWait(driver,sec);
	if(toBe.equalsIgnoreCase("visible"))
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	else if (toBe.equalsIgnoreCase("clickable"))
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	else 
	{
		wait.until(ExpectedConditions.textToBePresentInElement(element, toBe));
		
	}
}

public static void textMatches(int sec,Pattern p , By by)
{
	wait = new WebDriverWait(driver,sec);
	wait.until(ExpectedConditions.textMatches(by, p));
}



public static void explicitWaitBy(int sec,String toBe,By by)
{
	wait = new WebDriverWait(driver,sec);
	
	if(toBe.equalsIgnoreCase("visible"))
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));	
	}
	
	else if (toBe.equalsIgnoreCase("clickable"))
	{
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	else 
	{
		wait.until(ExpectedConditions.textToBe(by,toBe));
	}
	
	
	}

public static boolean isStale(int sec,WebElement element)
{
	
	return wait.until(ExpectedConditions.stalenessOf(element));
}

}
