package introduction;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		String[] itemsneeded= {"Cucumber","Brocolli"};
		driver.get(" https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		
		for(int i=0;i<products.size();i++) {
			String[] name= products.get(i).getText().split("-");
			String formattedname=name[0].trim();
			//format it to get actual name
			List itemsneededlist=Arrays.asList(itemsneeded);
			if(itemsneededlist.contains(formattedname)) {
				j++;
				//Click add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j== itemsneeded.length) {
					break;
				}
				
				
			}
			}
		
		
		
	}

}
