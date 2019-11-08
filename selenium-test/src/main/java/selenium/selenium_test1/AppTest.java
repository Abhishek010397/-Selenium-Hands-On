package selenium.selenium_test1;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {
	 public static void main( String[] args )
	    {   
	    	
	    	 System.setProperty("webdriver.chrome.driver", "I:\\abhi\\chromedriver.exe");
	         try {
	             ChromeOptions options = new ChromeOptions();
	             options.addArguments("--disable-notifications");
	             WebDriver driver = new ChromeDriver(options);
	             driver.get("https://www.oracle.com/technetwork/java/javase/downloads/index.html");
	             driver.findElement(By.xpath("//a[contains(text(),'Java Card')]")).click();
	         } catch (Exception e) {
	             // TODO Auto-generated catch block
	             System.out.println(e);
	         }
	    }
	}


