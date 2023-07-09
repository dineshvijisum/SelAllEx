package vsd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//iframe  Click

public class FramesExamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node09ffagvmo91o217n1m8tgvsta7221969.node0");
		//Click Me (Inside frame)
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		//Click Me (Inside Nested frame)
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
		//How many frames in this page?
		driver.switchTo().defaultContent();
		List<WebElement> toframe= driver.findElements(By.tagName("iframe"));
		int totalsize= toframe.size();
		System.out.println(totalsize);

	}

}
