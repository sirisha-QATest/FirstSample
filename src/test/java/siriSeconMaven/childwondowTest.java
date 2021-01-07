package siriSeconMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	
	public class childwondowTest {
		

		@Test
		public void chwindow() throws InterruptedException
		{
			
	    //System.out.println(tt);
			
			System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");

			WebDriver driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    
		    Actions a = new Actions(driver);
		    
		    driver.get("http://the-internet.herokuapp.com");
		    
		    driver.findElement(By.xpath("//a[@href='/windows']")).click();
		
		     
		    driver.findElement(By.xpath("//*[@href='/windows/new']")).click();
		    Thread.sleep(1000);
		    Set<String> ids=  driver.getWindowHandles();
		    Iterator<String> its= ids.iterator();
		    
		    String parent= its.next();
		    String child= its.next();
		    
		   driver.switchTo().window(child);
		 

		    Thread.sleep(1000);
		    String str=  driver.findElement(By.xpath("//div[@class='example']/h3")).getText();             //PARENT-CHID X-PATH
		    System.out.println(str);
		    
		    driver.switchTo().window(parent);
		    Thread.sleep(1000);
		    String str2= driver.findElement(By.xpath("//div[@class='example']/h3")).getText();  
		    System.out.println(str2);
		    
		   
		    		
		}
		@Test
		public  void stu1() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");

			WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.get("https://the-internet.herokuapp.com");

			driver.findElement(By.partialLinkText("Multiple Windows")).click();

			driver.findElement(By.partialLinkText("Click Here")).click();

			
			Thread.sleep(2000);
			Set<String> ids = driver.getWindowHandles();

			int ss= ids.size();
					System.out.println(ss);
			Iterator<String> itr = ids.iterator();

			String parent_id=itr.next();

			String child_id=itr.next();

			driver.switchTo().window(child_id);

			System.out.println(driver.getTitle());

			driver.switchTo().window(parent_id);

			System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());

			driver.quit();

			}



		}


