package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathi\\eclipse-workspace\\Day5\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	WebElement text = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement txt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement tx = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement t = driver.findElement(By.xpath("//a[text()=' -5000 ']"));
	WebElement a = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	WebElement b = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	WebElement c = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	actions.dragAndDrop(text,a).perform();
	actions.dragAndDrop(txt, b).perform();
	actions.dragAndDrop(tx, c).perform();
	actions.dragAndDrop(t,d).perform();
}
}
