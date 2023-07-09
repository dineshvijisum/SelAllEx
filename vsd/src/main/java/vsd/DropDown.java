package vsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement selectDropDown= driver.findElement(By.className("ui-selectonemenu"));
	
		selectDropDown.sendKeys("selenium");
		
		Select byIndex=new Select(selectDropDown);
		byIndex.selectByIndex(3);
		
		//Mult Select Drop Down
		WebElement multDropDown= driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button"));
		
		multDropDown.click();
		
		
		
		/*
		 * Select multDropdown1=new Select(multDropDown);
		 * multDropdown1.selectByIndex(0); multDropdown1.selectByIndex(1);
		 */
	}

}
