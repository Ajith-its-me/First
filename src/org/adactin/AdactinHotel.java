package org.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mathi\\eclipse-workspace\\Day5\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_J);
	robot.keyRelease(KeyEvent.VK_J);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_D);
	robot.keyRelease(KeyEvent.VK_D);
	robot.keyPress(KeyEvent.VK_K);
	robot.keyRelease(KeyEvent.VK_K);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
}
}
