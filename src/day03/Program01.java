package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program01 {

	public static void main(String[] args) { 
		WebDriver driver;
		driver = new EdgeDriver ();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement src1 = driver.findElement(By.xpath("//li[@id='credit2']"));
				
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='bank']"));
	
