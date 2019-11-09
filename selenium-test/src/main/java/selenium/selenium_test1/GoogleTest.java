package selenium.selenium_test1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void test()
    {   
		 
	     System.setProperty("webdriver.chrome.driver", "I:\\abhi\\chromedriver.exe");
	     ChromeOptions options = new ChromeOptions();
	     options.addArguments("--disable-notifications");
	     WebDriver driver = new ChromeDriver(options);
		 driver.get("https://www.google.com");
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");
	     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).submit();
	     driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[10]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]")).click();
	     Boolean logoPresent = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/a[1]/i[1]")).isDisplayed();
	     Assert.assertTrue(logoPresent);
	     if(logoPresent)
	     {
	    	 System.out.println("present");
	     }
	     else
	     {
	    	 System.out.println("Null");
	     }
	     
    }    
}

