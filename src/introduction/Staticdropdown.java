package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//selecting option  by the attribute->value For eg <option value="inr">inr</option>
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//Handling passenger dropdown with clickabl ebutton sin that dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//2 adults but if you want adult to be 5 times you need to click this button 3 more time. By default its 1
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();	
			i++;
		}
		
		//its not a good practice instead use while loop
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
	}

}
