package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub2
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elangovan");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Keerthu");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non-IT to IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Course");    
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthuruby428@gmail.com");    
        WebElement states = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select drop2=new Select(states);          
        drop2.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}	

}
