package selenium.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundsCheckbox {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
//		//Basic Checkbox
//		driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
//		
//		//Notification
//		driver.findElement(By.xpath("//h5[text()='Notification']/following::div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')][1]")).click();
//		WebElement notifyEleChk = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
//		String notifyText = notifyEleChk.getText();
//		String str1 = "Checked";
//		if(notifyText.equals(str1))
//		{
//			System.out.println("Nottification Checked");
//		}
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//h5[text()='Notification']/following::div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')][1]")).click();
//		Thread.sleep(3000);
//		WebElement notifyEleUnChk = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
//		
//		String notifyUnChk = notifyEleUnChk.getText();
//		String Str2 = "Unchecked";
//		if (notifyUnChk.equals(Str2)) {
//			System.out.println("Nottification Unchecked");
//
//		}
//				
//		
//		//TriState
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]")).click();
//		String triState1 = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following::p")).getText();
//		System.out.println(triState1);
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]")).click();
//		String triState2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following::p")).getText();
//		System.out.println(triState2);
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]")).click();
//		String triState3 = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following::p")).getText();
//		System.out.println(triState3);
//		
//		
//		//Choose Favorite language
//		driver.findElement(By.xpath("//label[text()='Java']")).click();
//		driver.findElement(By.xpath("//label[text()='Python']")).click();
//		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
//
//		
//		//Toggle Switch
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[@class='ui-toggleswitch-slider']")).click();
//		String toggletext = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
//		String txt = "Checked";
//		if (toggletext.equals(txt)) {
//			System.out.println("toggle message checked");
//		}		
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[@class='ui-toggleswitch-slider']")).click();		
//		String toggleOff = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
//		//System.out.println(toggleOff);
//		String text1 = "Unchecked";
//		if (toggleOff.equals(text1)) {
//			System.out.println("toggle message unchecked");
//		} 
	
			
		
		//Select Multiple dropdown checkbox
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']/ul")).click();
		Thread.sleep(5000);
		WebElement miami = driver.findElement(By.xpath("(//label[text() ='Miami'])[2]"));
		//WebElement miami = driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::input[@value='Miami']"));
//		WebElement miami = driver.findElement(By.xpath("(//li[@data-item-value='Miami'])[1]"));
		driver.executeScript("arguments[0].click()", miami);
		WebElement barcelona = driver.findElement(By.xpath("(//label[text() ='Barcelona'])[2]"));
		driver.executeScript("arguments[0].click()", barcelona);
		
		
		//is disabled checkbox
		boolean checkboxenabled = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']/input[@aria-label='Disabled']")).isEnabled();
		System.out.println(checkboxenabled);
		if (checkboxenabled == false) {
			System.out.println("print checkbox is disabled");
		}
		
		
	}
}
	




