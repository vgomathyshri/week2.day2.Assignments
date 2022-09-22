package selenium.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
	
//Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            //( A normal click will do for this step) 	
		 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gomathi Shri");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Venugopalan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gomathy_hp@yahoo.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("gomathy_hp@yahoo.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Rishabh@16");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd1 = new Select(day);
		dd1.selectByValue("19");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dd2 = new Select(month);
		dd2.selectByVisibleText("Feb");

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd3 = new Select(year);
		dd3.selectByValue("1984");
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		
		
		
		
	}
		
		
		
		

}

