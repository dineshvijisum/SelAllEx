package vsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://qa.creaudit.com/");

		
		 WebElement radbtn=driver.findElement(By.xpath(
		  "//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]")); 
		 radbtn.click();
		  
		 
	}

}
