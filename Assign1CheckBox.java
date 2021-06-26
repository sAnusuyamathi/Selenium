package week2.Day2.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver objChrome= new ChromeDriver();
	       objChrome.manage().window().maximize();
	       objChrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       objChrome.get("http://www.leafground.com/home.html");
	       objChrome.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='Checkbox']")).click();
	       
	       objChrome.findElement(By.xpath("//div[text()='Java']/input")).click();
	       objChrome.findElement(By.xpath("//div[text()='VB']/input")).click();
	       objChrome.findElement(By.xpath("//div[text()='C']/input")).click();
	       
	       //confirm selenium is checked
	       boolean flag = objChrome.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
	       if(flag) {
	    	   System.out.println("Check box is selected");
	       }else {
	    	   System.out.println("Check box isnot selected");
	       }
	       
	       List<WebElement> findElements = objChrome.findElements(By.xpath("//div[contains(text(),'Selected')]/input"));
	       System.out.println(findElements.size());
	       for (WebElement eachelem : findElements) {
			if(eachelem.isSelected()) {
				System.out.println("Element is auto selected with index :"+findElements.indexOf(eachelem));
				eachelem.click();
			}else {
				System.out.println("Element isnot auto selected with index :"+findElements.indexOf(eachelem));
			}
		}
	       List<WebElement> findElements2 = objChrome.findElements(By.xpath("//div[contains(text(),'Option')]/input"));
	       for (WebElement eachelem : findElements2) {
	    	   eachelem.click();
			
		}	
	
	objChrome.quit();
	}
	

}
