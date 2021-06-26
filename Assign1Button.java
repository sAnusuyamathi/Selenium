package week2.Day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver objChrome= new ChromeDriver();
	       objChrome.manage().window().maximize();
	       objChrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       objChrome.get("http://www.leafground.com/home.html");
	       objChrome.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/img[@alt='Buttons']")).click();
	       
	       String pageTitle = objChrome.getTitle();
	       if(pageTitle.equals("TestLeaf - Interact with Buttons")) {
	    	   System.out.println("Navigated to Buttons page");
	       }
	       
	       //click button to travel to home page
	       objChrome.findElement(By.id("home")).click();
	       String pageTitle1 = objChrome.getTitle();
	       System.out.println(pageTitle);
	       if(pageTitle.contains("TestLeaf")) {
	    	   System.out.println("clicked button to travel to home page");
	    	   objChrome.navigate().back();
	       }
	       
	       //find the position of x,y
	       System.out.println("Location:"+objChrome.findElement(By.id("position")).getLocation());
	       
	       //color
			String attribute = objChrome.findElement(By.id("color")).getAttribute("style");
			System.out.println(attribute);
						
			//size()
			System.out.println(objChrome.findElement(By.id("size")).getSize());
			objChrome.quit();
	       }
	}


