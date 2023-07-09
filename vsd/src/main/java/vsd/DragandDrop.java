package vsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0i21fxryfykyy18y968d0w2kj8222124.node0");
		
		WebElement from= driver.findElement(By.id("form:drop_content"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"form:restrictPanel1\"]/div"));
		
		Actions action=new Actions(driver);
		
		//action.dragAndDrop(from, to).build().perform();
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		
		//
		WebElement from1= driver.findElement(By.id("form:drop_content"));
		WebElement to1=driver.findElement(By.xpath("//*[@id=\"form:restrictPanel1\"]/div"));
		
		Actions action1=new Actions(driver);
		
		//action.dragAndDrop(from, to).build().perform();
		action.clickAndHold(from).moveToElement(to, 194, -34).release(to).build().perform();
		action.clickAndHold(from1);
	}

}
