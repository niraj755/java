package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//send key
		/* driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		//Keydown()
		Actions actionprovider = new Actions(driver);
		Action downkey = actionprovider.keyDown(Keys.CONTROL).sendKeys("a").build();
		downkey.perform();
		*/
		//keyUp()
		driver.get("https://www.google.com/");
		Actions action1 = new Actions(driver);
		WebElement search1 = driver.findElement(By.name("q"));
		action1.keyDown(Keys.SHIFT).sendKeys(search1,"selenium")
		.keyUp(Keys.SHIFT).sendKeys(" selenium").perform();
		Thread.sleep(2000);
		
		search1.clear();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}


}
