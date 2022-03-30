package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_demo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 //Find elements 
		
		driver.get("https://www.google.com/");
		WebElement Searchbox = driver.findElement(By.name("q"));
		Searchbox.sendKeys("selenium"+ Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		// Get all the elements available with tag name 'select'
		driver.get("https://trytestingthis.netlify.app/");
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		
		for (WebElement element : elements) {
            System.out.println("Paragraph text:" + element.getText());
        } 
		
		// How to get element from element:
		
		driver.get("http://www.google.com");
		WebElement searchForm = driver.findElement(By.tagName("form"));
		WebElement searchBox = searchForm.findElement(By.name("q"));
		searchBox.sendKeys("selenium" + Keys.ENTER); 
		
		//How to get active element:
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		// Get attribute of current active element
		String attr = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(attr); 

		//How to get element tagname, text, css:

		driver.get("http://www.google.com");
		
		WebElement SearchBox = driver.findElement(By.name("q"));
		String tagname = SearchBox.getTagName();
		String text = SearchBox.getText();
		String getcss = SearchBox.getCssValue("font");
		System.out.println(tagname+ "|" +text+" | " +getcss); 
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		System.out.println(checkbox.isEnabled()); 
		System.out.println(checkbox.isSelected());
		
		driver.close();
		driver.quit();
		
	}

}
