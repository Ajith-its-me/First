package org.split;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Split {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mathi\\eclipse-workspace\\Day5\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.t-mobile.com/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	
	
	WebElement l1= driver.findElement(By.xpath("(//button[@aria-label='Close dialog'])[1]"));
	Thread.sleep(8000);
	l1.click();
	
	
	Thread.sleep(8000);
	WebElement l2 = driver.findElement(By.xpath("(//li[@class='unav-headerNav__item'])[2]"));
	Actions drag=new Actions(driver);
	drag.moveToElement(l2).perform();
	
	
	WebElement str= driver.findElement(By.xpath("//a[text()='5G phones']"));
	Thread.sleep(5000);
	Actions drop=new Actions(driver);
	str.click();
	WebElement textlogin = driver.findElement(By.xpath("(//a[text()='Do Not Sell My Personal Information'])[2]"));
	 String text=textlogin.getText();
	 System.out.println(text);
}
}
