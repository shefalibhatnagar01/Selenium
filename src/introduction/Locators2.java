package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//this line will be globally applicable  to each and every step
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Shefali");//succesfully invoked browser and typed shefali in the username textbox
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");//
		driver.findElement(By.className("signInBtn")).click();

	}

}
