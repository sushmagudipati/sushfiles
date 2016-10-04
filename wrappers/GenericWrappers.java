package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrappers implements Wrappers{
	// Declare Driver Class
	RemoteWebDriver driver;
	int i=1;
	
	
	public void invokeApp(String browser, String Url) {
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		}else{
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Url);
		System.out.println("The application is launched");
		takeSnap();
	}

	
	public void enterById(String idValue, String data) {
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("The value is entered");
		takeSnap();
		
		
	}

	
	public void enterByName(String nameValue, String data) {
		driver.findElementByName(nameValue).clear();
		driver.findElementByName(nameValue).sendKeys(data);
		System.out.println("The value is entered");
		takeSnap();
	}
	public void enterByLink(String nameValue) {
		driver.findElementByLinkText(nameValue).clear();
		driver.findElementByLinkText(nameValue).sendKeys(nameValue);
		System.out.println("The value is entered");
		takeSnap();
	}

	
	public void enterByXpath(String xpathValue, String data) {
		driver.findElementByXPath((xpathValue)).clear();
		driver.findElementByXPath(xpathValue).sendKeys(data);
		System.out.println("The value is entered");
		takeSnap();
		// TODO Auto-generated method stub
		
	}

	
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	
	public void verifyTextContainsByXpath(String xpath, String text) {
		String actualText = driver.findElementByXPath(xpath).getText();
		if(actualText.contains(text)){
			System.out.println("The verification is Success");
		}else{
			System.out.println("The verification is fail");
		}
		takeSnap();
	}

	
	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	
	public void clickById(String id, String string) {
		// TODO Auto-generated method stub
		
	}

	
	public void clickByClassName(String classVal) {
		driver.findElementByClassName(classVal).click();
		System.out.println(" Click is successful");
		takeSnap();
		
		
	}

	
	public void clickByName(String name, String string) {
		// TODO Auto-generated method stub
		
	}

	
	public void clickByLink(String link) {
		driver.findElementByLinkText(link).click();
		System.out.println(" Click is successful");
		takeSnap();
		
		
	}

	
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTextByClassName(String nameValue) {
		driver.findElementByName(nameValue).clear();
		System.out.println("The value is entered");
		takeSnap(); 
		return null;
		
	}
	public void closeBrowser() {
		
		
	}


	
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
	}

	
	public void selectIndexById(String id, String value) {
		// TODO Auto-generated method stub
		
	}

	
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	}

	
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
	}

	
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);		
		try {
			FileUtils.copyFile(src, new File("./snaps/snap"+i+".jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
		
	}

	
	public void quitBrowser() {
		
		driver.quit();
		System.out.println("All browsers closed");
	}


	public void clickById(String id) {
		// TODO Auto-generated method stub
		
	}


	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
