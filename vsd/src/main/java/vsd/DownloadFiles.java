package vsd;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get(
		  "https://www.leafground.com/drag.xhtml;jsessionid=node0i21fxryfykyy18y968d0w2kj8222124.node0"
		  );
		  
		  WebElement download=driver.findElement(By.id("")); 
		  download.click();
		 
		
		File filelocation=new File("/home/mac/Downloads/CRE_Report_042123_154413.xlsx");
		File[] totalFile=filelocation.listFiles();
		
		for (File file : totalFile) {
			if(file.getName().equals("Download.xls")) {
				System.out.println("File is downloaded");
				break;
			}
		}

	}

}
