//import java.util.concurrent.TimeUnit;
//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import java.io.*;

public class cornerstoneLogin {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "/Users/shuchivasisht/Documents/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://piiq.csod.com/login");
		
		driver.findElement(By.id("input_0")).sendKeys("shuchi.advani@hotmail.com");
		driver.findElement(By.id("input_1")).sendKeys("Hello123!@#");
		driver.findElement(By.id("submitBtn")).click();


	}
}
