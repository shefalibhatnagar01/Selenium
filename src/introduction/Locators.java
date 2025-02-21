package introduction;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) {
		//implicit wait-erroe message will wait for the specified amount of time every millisecond it kkeeps on monitoring for the message to be displayed on the page . if this wait condition will be provided by you then it will not monitor evry sec or msec
		//css selector and xpath are generic locators
		// xpath= //Tagname[@attribute value]
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//this line will be globally applicable  to each and every step
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Shefali");//succesfully invoked browser and typed shefali in the username textbox
		driver.findElement(By.name("inputPassword")).sendKeys("shifu");//
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//showing error due to timeout issues
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shefali Bhatnagar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("bhatnagarshefali03@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("shefali@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		//Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("shefali");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
