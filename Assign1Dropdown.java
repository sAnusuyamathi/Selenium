package week2.Day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5) Complete all the 5 (except 4th) activities in DropDown Page: http://leafground.com/pages/Dropdown.html
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver objChrome= new ChromeDriver();
	       objChrome.manage().window().maximize();
	       objChrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       objChrome.get("http://www.leafground.com/home.html");
	       objChrome.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='Drop down']")).click();
	       
	       //Verify Drop down page is displayed
	       if(objChrome.getCurrentUrl().contains("Dropdown")) {
	    	   System.out.println("Drop down page is launched");
	    	    }
	       else {
	    	   System.out.println("Drop down page is not launched");
	       }
	       
	       //By index
	       WebElement objDD1 = objChrome.findElement(By.id("dropdown1"));
	       Select dd1 = new Select(objDD1);
	       dd1.selectByIndex(1);
	       
	       //By TExt
	       WebElement objDD2 = objChrome.findElement(By.name("dropdown2"));
	       Select dd2 = new Select(objDD2);
	       dd2.selectByVisibleText("Appium");
	       
	       //By Value
	       WebElement objDD3 = objChrome.findElement(By.id("dropdown3"));
	       Select dd3 = new Select(objDD3);
	       dd3.selectByValue("3");
	       
	       //Using Keyboard
	       WebElement objDD4 = objChrome.findElement(By.xpath("//select[@class='dropdown']/following::select[1]"));
	       objDD4.sendKeys("Loadrunner");
	       
	       //select
	       WebElement objDD5 = objChrome.findElement(By.xpath("//select[@class='dropdown']/following::select[2]"));
	       Select dd5 = new Select(objDD5);
	       objDD5.sendKeys(Keys.ARROW_DOWN);
	       objDD5.sendKeys(Keys.ARROW_DOWN);
	       System.out.println(objDD5.getAttribute("value"));
//	       if(objDD5.isSelected()) {
//	    	   System.out.println("chosen by keyboard");
//	    	 
//	       }
//	       if(dd5.isMultiple()) {
//	    	   if(objDD5.isSelected())
//	    		   dd5.selectByIndex(3);
//	    	   else
//	    		   System.out.println("Drop down is not auto selected");
//	       }
	       
	       objChrome.quit();  
	       
	       
	}

}
