package siriSeconMaven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class framesTest {

 @Test (groups= {"qaframe"})
 public static void frameExmaple() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/frames");

		WebElement frame1 = driver.findElement(By.id("frame1"));

		driver.switchTo().frame(frame1);

		String text = driver.findElement(By.id("sampleHeading")).getText();

		System.out.println("1stFramText:" + text);

		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.id("frame2"));

		driver.switchTo().frame(frame2);

		String text2 = driver.findElement(By.id("sampleHeading")).getText();

		System.out.println("2ndFramText:" + text2);

		driver.switchTo().defaultContent();
		
	}
	
 @Test(enabled=true)
	public  void nestedframeExmaple() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/nestedframes");

		WebElement frame1 = driver.findElement(By.id("frame1"));

		driver.switchTo().frame(frame1);
		
		String text =  driver.findElement(By.tagName("body")).getText();
		
		System.out.println("ParentFramText:" + text);
		
		int str = driver.findElements(By.tagName("iframe")).size();
		System.out.println("ParentFramText:" + str);
	
		
		
		WebElement childFrame= driver.findElement(By.tagName("iframe"));
		
	driver.switchTo().frame(childFrame);
	String text2 =  driver.findElement(By.tagName("body")).getText();
	
	System.out.println("ChildFramText:" + text2);
	
		
	}
	
 @Test	
public  void modalDialogs() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/modal-dialogs");
		
	
		driver.findElement(By.cssSelector("button[id='showSmallModal']")).click(); 
		
	    String smallText=	driver.findElement(By.xpath("//div[@class='modal-title h4']")).getText();
	    System.out.println("SmallDialogText:" +smallText);
	    
	   
	    
	    String smallText2= driver.findElement(By.cssSelector("div[class='modal-body']")).getText();
	    

	   System.out.println("SmallDialogText:" +smallText2);
		
	   driver.findElement(By.cssSelector("button#closeSmallModal.btn.btn-primary")).click();
		
	   driver.findElement(By.cssSelector("button[id='showLargeModal']")).click(); 
		
	   String LargeText=	driver.findElement(By.xpath("//div[@class='modal-title h4']")).getText();
	    System.out.println("LArgeDialogText:" +LargeText);
	   String largeText= driver.findElement(By.cssSelector("div[class='modal-body']")).getText();
	   
	   System.out.println("LargeDialogText:" +largeText);
		
	   driver.findElement(By.cssSelector("button#closeLargeModal.btn.btn-primary")).click();
		
	}


}

