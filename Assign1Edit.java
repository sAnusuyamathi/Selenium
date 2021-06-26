package week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver objChrome= new ChromeDriver();
       objChrome.manage().window().maximize();
       
       objChrome.get("http://www.leafground.com/home.html");
       objChrome.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='Edit']")).click();
       
       //Verify that you are on Edit Page
       if(objChrome.getTitle().contains("Interact with Edit")) {
       System.out.println("Navigated to Edit Page to perform validation");
       }
       
       objChrome.findElement(By.id("email")).sendKeys("xyz@gmail.com");
       
       //Verify that entered value is displayed or not
       String strEmail = objChrome.findElement(By.id("email")).getAttribute("value");
       if(strEmail.contains("xyz@gmail.com")) {
    	   System.out.println("User entered the mail id");
       }
       
       //Perform Append
		String strAppend = objChrome.findElement(By.xpath("//label[contains(text(),'Append')]/following::input[1]")).getAttribute("value");
		if(strAppend!="") {
		objChrome.findElement(By.xpath("//label[contains(text(),'Append')]/following::input[1]")).sendKeys("User" + Keys.TAB);
		System.out.println("Performed Appending");
		}
		
		//Print the default text entered
		System.out.println("Default text entered:"+objChrome.findElement(By.xpath("//label[contains(text(),'default text')]/following::input[1]")).getAttribute("value"));
		
//		Clear the text
		System.out.println("Clear box-Text: "+objChrome.findElement(By.xpath("//label[contains(text(),'Clear')]/following::input[1]")).getAttribute("value"));
		objChrome.findElement(By.xpath("//label[contains(text(),'Clear')]/following::input[1]")).clear();
		if(objChrome.findElement(By.xpath("//label[contains(text(),'Clear')]/following::input[1]")).getAttribute("value")=="");
		{
			System.out.println("Cleared the text");
		}
		
//		Verify the text box is enabled or not
		boolean enabledBox = objChrome.findElement(By.xpath("//label[contains(text(),'Confirm')]/following::input[1]")).isEnabled();
		if(!(enabledBox));
		{
			System.out.println("The Edit is not enabled");
		}
		
       objChrome.quit();
	}

}
