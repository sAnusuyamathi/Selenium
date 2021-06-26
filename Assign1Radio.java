package week2.Day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Complete all 3 activities in Radio button Page: http://leafground.com/pages/radio.html
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver objChrome= new ChromeDriver();
	       objChrome.manage().window().maximize();
	       objChrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       objChrome.get("http://www.leafground.com/home.html");
	       objChrome.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='Radio Button']")).click();
	       
	       //Verify radio button html
	       if(objChrome.getCurrentUrl().contains("radio")) {
	    	   System.out.println("Radio button page is launched");
	    	    }
	       else {
	    	   System.out.println("Radio button page is not launched");
	       }
	       
	       objChrome.findElement(By.xpath("//label[text()='Are you enjoying the classes?']/following::input[@id='yes']")).click();
	       
	objChrome.quit();
	
	}

}
