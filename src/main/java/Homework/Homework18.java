package Homework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework18 extends BaseTest {
	
	@Test
	public void blog() {
		
		driver.findElements(By.xpath("//ul[@id='menu_main']/li")).get(2).click();
		
		driver.findElement(By.xpath("//ul[@id='menu_main']/li/ul/li")).click();
		
		driver.findElement(By.xpath("//h4[@class='post_title']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("My comment");
		
		driver.findElement(By.xpath("//input[@id='author']")).sendKeys("AnaMaria");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aaa.b@mail.com");
		
		driver.findElement(By.xpath("//input[@id='url']")).sendKeys("https://google.ro");
		
		driver.findElement(By.xpath("//input[@id='send_comment']")).click();
		
		assertEquals(driver.findElement(By.xpath("//div[@class='comment_not_approved']")).getText() , "Your comment is awaiting moderation." );
		
		
	}
	


}
