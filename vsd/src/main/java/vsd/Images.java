package vsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0i21fxryfykyy18y968d0w2kj8222124.node0");
		
		WebElement brokenimage=driver.findElement(By.xpath(""));
		brokenimage.click();
		
		//naturalWidth=0 is broken image
		
		if(brokenimage.getAttribute("naturalWidth").equals(0)) {
			System.out.println("Broken Image");
		}else {
			System.out.println("Not Broken");
		}

	}

}
