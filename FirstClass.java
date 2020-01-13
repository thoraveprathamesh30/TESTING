import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException, IOException,WebDriverException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	//			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	//	capabilities.setCapability("marionette",true);
		WebDriver driver = new ChromeDriver();		
		
		
			/*		CODE FOR SEARCHING
			 ------------------------------------
		 	driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("search")).sendKeys("kapil Sharma Show");
			driver.findElement(By.id("search-icon-legacy")).click();
			------------------------------------------
			
			*/

			/*		CODE FOR CHECKBOX	
			 ------------------------------------
			driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=957f2379-f8ef-441c-9cc5-d589a8cdd73a");
			WebElement ckbox = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[3]/div[1]/label/div[1]"));
		    ckbox.click();
		    ------------------------------------------
			
			*/
		
			/*		CODE FOR RADIO BUTTON
			 ------------------------------------
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement radiob= driver.findElement(By.id("u_0_7"));	
			
			radiob.click();
			
			------------------------------------------
				
				*/

			/*		CODE FOR BUTTON
			 ------------------------------------
			driver.get("https://www.facebook.com/");
			WebElement butt=driver.findElement(By.id("u_0_13"));
			butt.click();
			------------------------------------------
			
			*/		


				/*		CODE FOR DROPDOWN
				 ------------------------------------
		
				driver.get("https://www.facebook.com/");
		
				driver.manage().window().maximize();
				
				WebElement droplist=driver.findElement(By.id("day"));
				
				Select country=new Select(droplist);
				
				country.selectByVisibleText("26");
				------------------------------------------
				
				*/		
		
		
				/*		CODE FOR CSS
			 	------------------------------------
			
					driver.get("https://www.facebook.com/");
					
					driver.findElement(By.cssSelector("#u_0_m")).sendKeys("Rajesh");
					
				------------------------------------------
					
					*/							
			
		 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.CopyFile(src,new File("C://Selenium//Error.png"));
		
				
				
					
	}

}

