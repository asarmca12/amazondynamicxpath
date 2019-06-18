package org.xpathh;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynxpth {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\ProjectWorkspace\\Dynamic\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
try {
 WebElement butt=driver.findElement(By.xpath("//button[text()='✕']"));
 butt.isDisplayed();
 butt.click();
}
catch (Exception e) {
	System.out.println("pop up is not displyed");
}
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile",Keys.ENTER);

Thread.sleep(3000);

  List<WebElement>mobilname=driver.findElements(By.xpath("//div[@id='container']/div/div[3]/div[2]/div/div[2]/div[2]//a/div[contains(text(),GB'])"));
  for(int i=0;i<mobilname.size();i++) {
	  String  name=mobilname.get(i).getText();
	  System.out.println(name);
  }
  
}
}