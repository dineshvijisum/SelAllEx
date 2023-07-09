package vsd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node0alesoy8sgf2k722s2dt9lqsf227956.node0");
		
		List<WebElement> element=driver.findElements(By.xpath("list path"));
		WebElement fromEle= element.get(6);
		WebElement toEle= element.get(0);
		
		Actions action=new Actions(driver);
		action.clickAndHold(fromEle);
		action.moveToElement(toEle).release(toEle);
		action.build().perform();
 
	}

}
