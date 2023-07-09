package steps;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pages.Login;

public class LoginSteps {
	
	String[][] data=null;

	WebDriver driver;
	
	@DataProvider(name="logindata")
	public static String[][] dataProvider() throws BiffException, IOException {
		
         data=loginjxl();
         return data;

	}
	
	public static String[][] loginjxl() throws BiffException, IOException {
		FileInputStream excelLoginData=new FileInputStream("/home/mac/Downloads/jxl.xls");
		Workbook workbook= Workbook.getWorkbook(excelLoginData);
		Sheet sheet= workbook.getSheet(1);
		int getRow=sheet.getRows();
		int getCol=sheet.getColumns();
		
String testdata[][]=new String[getRow-1][getCol];
		
		for(int i=1;i<getRow;i++) {
			for(int j=0;j<getCol;j++) {
				testdata[i-1][j]=sheet.getCell(j,i).getContents();
			}
		}
		return testdata;
		
		
	}

	@Given("User navigate to the Boocart application")
	public void userNavigateToTheBoocartApplication() {
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/112/chromedriver_linux64 (1)/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
	}

	@And("User clicks on the login button")
	public void userClicksOnTheLoginButton() {
		driver.findElement
		(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]/span[1]")).click();


	}
  
	@Test(dataProvider = "logindata")
	
	@Given("User enter the username as ortoni")
	
	public void userEnterTheUsernameAsOrtoni(String uname,String pname) {
	WebElement uname1=	driver.findElement(By.id("mat-input-0"));
	uname1.sendKeys(uname);
	WebElement pname1= driver.findElement(By.id("mat-input-1"));
    pname1.sendKeys(pname);

	}

	@Given("User enter the password as Pass{int}")
	
	public void userEnterThePasswordAsPass() {
	System.out.println("Hi");	
		
	}

	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		driver.findElement
		(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-card-actions/button/span[1]")).click();


	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
     System.out.println("hi How are you");

	}

}


