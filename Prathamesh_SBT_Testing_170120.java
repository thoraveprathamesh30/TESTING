import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prathamesh_SBT_Testing_170120 {

	public static void main(String a[]){
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Apis Himalaya Honey");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[1]/div/span/div/div/div[2]/div[1]/a/div/div/div[1]/img")).click();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[5]/div[1]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[27]/div[1]/span/span/span/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("catch Kitchen King");
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/span/a/div/img")).click();	
		
		
		//driver.findElement(By.xpath("")).click();
		/*driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Groceries");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/span/a/div/img")).click();			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/

		
		/*driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Kitchen");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		*/
		
		/*driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Apparel");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/span/a/div/img")).click();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[27]/div[1]/span/span/span/input")).click();
		*/
		 
		/*driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Mobiles");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[1]/div/span/div/div/div[2]/div[1]/a/div/div/div[1]/img")).click();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[5]/div[1]/div[3]/div/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[27]/div[1]/span/span/span/input")).click();	
		*/
		
		
		/*driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Groceries");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		*/
		//driver.findElement(By.xpath("")).click();	

	}
	
	
	
	
}

