package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaderAssinment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/login");
System.out.println("The Title is :" + driver.getTitle());// to get title of the page
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestWorld");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramachandran");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sagar");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Manage the salary informations");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramsagar@gmail.com");
//Select from drop down
WebElement Ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select dd= new Select(Ele);
dd.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();
//Thread.sleep(5000);
//driver.close();
}

}
