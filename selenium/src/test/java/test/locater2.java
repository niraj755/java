package test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locater2 {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		
	/*	driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ABCD",Keys.ENTER);
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		java.util.List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : options) {
			   System.out.println(element.getText());
			  } */
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		WebElement passwordTextBox = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton));
		passwordTextBox.sendKeys("ABCD");

	}

}
