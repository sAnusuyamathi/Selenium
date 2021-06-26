package week2.Day2.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1HyperLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver objChrome= new ChromeDriver();
	       objChrome.manage().window().maximize();
	       objChrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       objChrome.get("http://www.leafground.com/home.html");
	       objChrome.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='HyperLink']")).click();
	       

//			 System.out.println(objfindElements.size());
			// loop till you get the exception as no such element
			//find where i go to without clicking me
	       
	       objChrome.findElement(By.xpath("//a[contains(text(),'Home Page')][1]")).click();
	       if (objChrome.getTitle().contains("TestLeaf")){
	    	   System.out.println("In Home Page from link");
	    	   objChrome.navigate().back();
	       } else {
	    		   System.out.println("Not in Home Page");
	    	   }
	       Thread.sleep(500);
			String strAttr1 = objChrome.findElement(By.xpath("//a[contains(text(),'supposed')]")).getAttribute("href");
			System.out.println("Without clicking on link- go to: "+strAttr1);
			objChrome.navigate().to(strAttr1);
			if(objChrome.getCurrentUrl().equals(strAttr1)) {
				System.out.println("Captured the URL without clicking on it");
				objChrome.navigate().back();
			}
			
			//Broken Page
			objChrome.findElement(By.xpath("//a[contains(text(),'broken')]")).click();
			String objBrokenPage = objChrome.getTitle();
//			objChrome.findElement(By.partialLinkText("Home Page")).equals(objChrome..findElement(By.partialLinkText("Home Page"));
			if(objBrokenPage.contains("Not Found")) {
				System.out.println("Link to the Page is Broken");
				objChrome.navigate().back();
			}
			boolean flag;
			
			//same link
//			 List<WebElement> findElements = objChrome.findElements(By.xpath("//a[text()='Go to Home Page']"));
//			 int size = findElements.size();
//			 for (WebElement eachOpt : findElements) {
//				eachOpt.click();
//				if(flag=false) {
//				String temp1 = objChrome.getCurrentUrl();
//				flag=true;
//				}
//				if(flag==true && (temp1.equals(objChrome.getCurrentUrl())){
//					System.out.println("Both URLs are same");
//				}
//			}
			String attr1 = objChrome.findElement(By.xpath("//a[text()='Go to Home Page']")).getAttribute("href");
			String attr2 =objChrome.findElement(By.xpath("//a[text()='Go to Home Page']/following::label")).getAttribute("href");
			if(attr1==attr2) {
				System.out.println("Both are referring same Link");
			}
			// get the links
			List<WebElement> objfindElements = objChrome.findElements(By.xpath("//a[text()!=\"\"]"));
			System.out.println("NO. of WebLinks: "+objfindElements.size());
	
			objChrome.quit();
	}
	
	

}
