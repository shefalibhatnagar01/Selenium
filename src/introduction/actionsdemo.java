package introduction;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a =new Actions(driver);
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		
		
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		//moves to specific element
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		

	}

}
