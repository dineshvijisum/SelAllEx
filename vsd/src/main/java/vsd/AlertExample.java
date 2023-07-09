package vsd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node034zmp5cikomvzao4xtvxckoc214302.node0");
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node034zmp5cikomvzao4xtvxckoc214302.node0");
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node034zmp5cikomvzao4xtvxckoc214302.node0");
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		
		Alert alert2=driver.switchTo().alert();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[1]/a")).click();
		
		
		
		

	}

}
