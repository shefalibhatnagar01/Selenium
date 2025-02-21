package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//FOR OPENING THE DROPDOWN
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);//to avoid the synchronisation issues
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//this will throw an error"element not found" if index not used 
		//another way to handle thisi without the use of index
		//we will use parent to child relationship xpath 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
