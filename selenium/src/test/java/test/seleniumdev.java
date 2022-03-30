package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class seleniumdev {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		        driver.get("https://google.com");
		        
		        driver.getTitle(); // => "Google"

		        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		        
		        WebElement searchBox = driver.findElement(By.name("q"));
		        WebElement searchButton = driver.findElement(By.name("btnK"));
		        
		        searchBox.sendKeys("Selenium");
		        searchButton.click();
		        
		        searchBox = driver.findElement(By.name("q"));
		        searchBox.getAttribute("value"); // => "Selenium"
		        
		        driver.quit();
		    }
}
	


