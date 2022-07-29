package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub2
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Keerthana");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Elangovan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8681021072");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Keerthu04");
		WebElement date = driver.findElement(By.id("day"));
		Select drop1=new Select(date);
		drop1.selectByIndex(4);
		WebElement month = driver.findElement(By.id("month"));
		Select drop2=new Select(month);
		drop2.selectByVisibleText("Jan");
		WebElement year = driver.findElement(By.id("year"));
		Select drop3=new Select(year);
		drop3.selectByValue("1995");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
}
