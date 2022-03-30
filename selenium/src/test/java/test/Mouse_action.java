package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_action {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//li[text()= 'A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()= 'D']"));
		Actions action = new Actions(driver);
		//action.moveToElement(boxA);
		//action.clickAndHold();
		//action.moveToElement(boxD);
		//action.release().perform();
		action.contextClick(boxD);
		action.doubleClick(boxD);
		action.build().perform(); */
		
		Actions action = new Actions(driver);
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		action.dragAndDrop(draggable, droppable);
		action.build().perform();
		
		
		
		
	}

}
