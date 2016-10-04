package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Opentapswrapper extends GenericWrappers{
	
	@Parameters({"url","username","password"})
	
	@BeforeMethod(groups="Regression")
	public void login(String URL,String uname,String pswd){
		invokeApp("chrome",URL);
		enterById("username",uname);	
		enterById("password",pswd);				
		clickByClassName("decorativeSubmit");				
		clickByLink("CRM/SFA");
		
		//System.out.println("browser is launched" + URL);			
	  // System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("http://demo1.opentaps.org");
		//driver.manage().window().maximize();
		//driver.findElementById("username").sendKeys("DemoCSR");
		//driver.findElementById("password").sendKeys("crmsfa");
		//driver.findElementByClassName("decorativeSubmit").click();
	}
	@AfterMethod(groups="Regression")
	public void close(){
		System.out.println("browser is closed");
		//driver.quit();
//		driver.close();
	}
	

}
