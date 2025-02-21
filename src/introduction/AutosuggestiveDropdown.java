package introduction;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		//since there is a slight delay in showing the options so we will put sleep method
		Thread.sleep(2000);//not a good practice
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));//this a parent child traversal in css selector locator we wwill get all the options from the autogesstive dropdown menu
		//return type of find element is list<WebElement>
		//List<> is a generic interface, meaning it can hold objects of a specified type.represents an ordered collection (also known as a sequence). It allows duplicate elements and provides various methods for adding, removing, and accessing elements.
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		

	}

}
