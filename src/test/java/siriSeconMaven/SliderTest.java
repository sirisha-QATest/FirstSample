package siriSeconMaven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTest {


	 @Test
	public static void sliderExample() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/slider");

		WebElement hover = driver.findElement(By.id("sliderContainer"));

		Actions act = new Actions(driver);

		act.moveToElement(hover, 30, 20).perform();
		
		hover.click();

	}
 @Test
	public static void MouseHover2()

	{
		System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/slider/");
		System.out.println("demoqa webpage Displayed");

		// Maximise browser window
		driver.manage().window().maximize();

		// Adding wait
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElemnt 'slider' to perform mouse hover
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		actions.moveToElement(slider, 50, 0).perform();
		slider.click();
		System.out.println("Moved slider in horizontal directions");

		// Close the main window
	//	driver.close();

	}
}
