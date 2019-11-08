package selenium.selenium_test1;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class TestTng {
	@Test
	public void test3()
	{
		System.out.println("This is 2 test");
		
	}
	@Test
	public void test()
    {   
	     System.out.println("Before test text");
	     System.setProperty("webdriver.chrome.driver", "I:\\abhi\\chromedriver.exe");
	     ChromeOptions options = new ChromeOptions();
	     options.addArguments("--disable-notifications");
	     WebDriver driver = new ChromeDriver(options);
		 driver.get("https://www.google.com");
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Intellepaat");
    	 
    }
	@BeforeMethod
		public void test4()
		{
			System.out.println("test4");
		}
	@BeforeTest
	public void test2()
	{
		
        try {
            
            System.out.println("This is a test");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
	}
}

