package vsd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node0alesoy8sgf2k722s2dt9lqsf227956.node0");
		
	WebElement homePage=	driver.findElement(By.partialLinkText("Go to Dashboard"));
		homePage.click();
		
		driver.navigate().back();
		
		WebElement wheretogo=driver.findElement(By.partialLinkText("Find the URL"));
		
          String naivgat=wheretogo.getAttribute("href");
          
          System.out.println(naivgat);
          
          WebElement brokenLink=driver.findElement(By.linkText("Broken?"));
          
          brokenLink.click();
          String title=driver.getTitle();
          
          if(title.contains("404")) {
        	  System.out.println("Broken");
          }
          
          driver.navigate().back();
          
          List<WebElement> totalLink=driver.findElements(By.tagName("a"));
          
          int lincount=totalLink.size();
          System.out.println(lincount);
          
       String dublicate="https://www.leafground.com/dashboard.xhtml";
	    List<WebElement> hrefDublicate=  driver.findElements(By.tagName("href"));
	    for (WebElement webElement : hrefDublicate) {
	    	if(webElement.getTagName()) {
	    		System.out.println("Dublicate");
		}
	    
	    	
	    }

}}
