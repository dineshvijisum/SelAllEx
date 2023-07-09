package vsd;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		String oldwindow= driver.getWindowHandle();
		
		driver.findElement(By.id("j_idt88:new")).click();
		
		Set<String> handles= driver.getWindowHandles();
		
		for (String newWindows : handles) {
			driver.switchTo().window(newWindows);
		}
		WebElement Email= driver.findElement(By.id("email"));
		Email.click();
		Email.sendKeys("dinesh@good.com");
		
		driver.close();
		
		
		//Mult window Close & find window open size
		driver.switchTo().window(oldwindow);
		
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		int sizefind=  driver.getWindowHandles().size();
		System.out.println(sizefind);
		
		Set<String> multwindowClose= driver.getWindowHandles();
		
		for (String multClose : multwindowClose) {
			if(!multClose.equals(oldwindow)) {
				driver.switchTo().window(multClose);
				driver.close();
			}
		}
		
		

	}

}
