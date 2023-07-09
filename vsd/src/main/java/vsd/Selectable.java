package vsd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0i21fxryfykyy18y968d0w2kj8222124.node0");
		
		List<WebElement> selectable= driver.findElements(By.id("selectable element with list"));
		
		//Option1
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0))
		.click(selectable.get(1)).build().perform();
		
		//Option2
		Actions action1=new Actions(driver);
		action1.clickAndHold(selectable.get(0));
		action1.clickAndHold(selectable.get(1));
		
		//Single click only
		action1.click(selectable.get(1));

	}

}
