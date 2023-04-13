package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Program1 {
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		// TODO Auto-generated method stub
		System.out.println(driver.getWindowHandles());//1
		driver.findElement(By.id("towtabsearchtwxtbox")).sendKeys("Java"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']"+"//span[contains(text(),'Core Java:An Integrated')])[1]")).click();
		//
		System.out.println(driver.getWindowHandles());//2
		
		driver.findElement(By.xpath("(//div[@data-comonent-type='s-search-result,]"+"//span[contains(text(),'Core Java:An integrated')])[1]")).click();
		//
		System.out.println(driver.getWindowHandles());//3
		for(String id:driver.getWindowHandles()) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("Core-Java-Integrated-Approach"));
			{
				Select qty=new
						Select(driver.findElement(By.name("quantity")));
				qty.selectByValue("6");
				driver.findElement(By.id("add-to-cart-button")).click();
			}
			
				if(driver.getTitle().contains("Beginning Programming with Java"));
			{
				driver.findElement(By.id("add-to-cart-button")).click();
						
			}
		
	}
	}

}
