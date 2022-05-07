package wee3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {


public static void main(String args[])
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com");
driver.findElement(By.name("searchVal")).sendKeys("Bags", Keys.ENTER);
driver.findElement(By.xpath("//label[@for='Men']")).click();
driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
String totalItem = driver.findElement(By.xpath("//div[@class='length']")).getText();
 System.out.println("the items found:" +totalItem);
 List<WebElement> listItem = (List<WebElement>) driver.findElement(By.xpath("//div[@class='brands']"));
 System.out.println(" Size :" + listItem.size());
 List<WebElement> bagNameList = (List<WebElement>) driver.findElement(By.xpath("//div[@class='name']"));

 for(int i=0; i<listItem.size(); i++)
 {

	 System.out.println("Brands:" +listItem.get(i).getText());
	 System.out.println("name:" +listItem.get(i).getText());
	 System.out.println(" ");

	 
 }

}
}

