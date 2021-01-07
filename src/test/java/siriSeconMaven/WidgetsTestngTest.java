package siriSeconMaven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WidgetsTestngTest {
	
	@Test
	public void widgetsExmaple() throws IOException

	{


		System.setProperty("webdriver.gecko.driver", "//Users//Saketh//Desktop//work//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		Properties pop = new Properties();
	
		FileInputStream fis = new FileInputStream("//Users//Saketh//mavenSecondjava//src//test//java//siriSeconMaven//data.properties");
		pop.load(fis);

		// driver.get("https://demoqa.com/accordian");

		driver.get(pop.getProperty("url"));

		driver.findElement(By.id(pop.getProperty("heading1"))).click();

		String Content1 = driver.findElement(By.id(pop.getProperty("Content1"))).getText();

		System.out.println(Content1);

		driver.findElement(By.id(pop.getProperty("heading1"))).click();

		System.out.println("******************");

		driver.findElement(By.id(pop.getProperty("heading2"))).click();

		String Content2 = driver.findElement(By.id(pop.getProperty("Content2"))).getText();

		System.out.println(Content2);
		driver.findElement(By.id(pop.getProperty("heading2"))).click();

		System.out.println("******************");

		driver.findElement(By.id(pop.getProperty("heading3"))).click();

		String Content3 = driver.findElement(By.id(pop.getProperty("Content3"))).getText();

		System.out.println(Content3);
		driver.findElement(By.id(pop.getProperty("heading3"))).click();

		driver.quit();

	}

}
