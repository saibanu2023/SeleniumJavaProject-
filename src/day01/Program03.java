package day01;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03 {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
		screenshot("firstName");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Java");
		screenshot("lastName");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Chennai");
		screenshot("adress");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		screenshot("gender");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		


		

	}
	
public static void screenshot(String fileName) throws IOException

{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des = new File("./screenshot/"+fileName+".img");
	FileUtils.copyFile(src, des);
	
		
	}
}

