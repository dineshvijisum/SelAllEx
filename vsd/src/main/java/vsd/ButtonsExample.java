package vsd;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/button.xhtml");
 
		//Position
		WebElement buttonPosition=driver.findElement(By.id("j_idt88:j_idt94"));
		buttonPosition.click();
		WebElement buttonPosition1=driver.findElement(By.id("j_idt88:j_idt94"));
		Point positionBut=buttonPosition1.getLocation();
		int xaxis=positionBut.getX();
		int yaxis=positionBut.getY();
		System.out.println("X axis"+xaxis + "Yaxis"+yaxis);
		
		//CSS color
		WebElement colorEx=driver.findElement(By.id("j_idt88:j_idt96"));
		String color1= colorEx.getCssValue("background");
		
	System.out.println(color1);
		
		//Size 
	WebElement size=driver.findElement(By.id("j_idt88:j_idt96"));
	
		int height= size.getSize().getHeight();
		int width=size.getSize().getWidth();
		
		System.out.println("Height is "+height+"Width Is "+width);
		
	}

}
