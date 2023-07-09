package vsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0i21fxryfykyy18y968d0w2kj8222124.node0");
		
		WebElement name= driver.findElement(By.id("form:drop_content"));
		String toolTip= name.getAttribute("title");
	}

}
