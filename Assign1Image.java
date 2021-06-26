package week2.Day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver objChrome= new ChromeDriver();
	       objChrome.manage().window().maximize();
	       objChrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       objChrome.get("http://www.leafground.com/home.html");
	       objChrome.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='Image']")).click();
	       objChrome.findElement(By.xpath("//label[contains(text(),'home page')]/following::img[1]")).click();
	       if (objChrome.getTitle().contains("TestLeaf")){
	    	   System.out.println("In Home Page from link");
	    	   objChrome.navigate().back();
	       } else {
	    		   System.out.println("Not in Home Page");
	    	   }
	       Thread.sleep(500);
	       
			String attr = objChrome.findElement(By.xpath("//label[contains(text(),'Broken')]/following::img[1]")).getAttribute("src");
			objChrome.navigate().to(attr);
//			System.out.println(objChrome.getCurrentUrl());
			if(objChrome.getTitle().contains("404")) {
				System.out.println("Broken Image");
				 objChrome.navigate().back();
			}
			objChrome.findElement(By.xpath("//label[contains(text(),'Keyboard')]/following::img[1]")).click();
			
	}

}
