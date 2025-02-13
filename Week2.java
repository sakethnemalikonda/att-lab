package cseb5x0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.mercurytravels.co.in/");
        Actions actions=new Actions(driver);
        WebElement CustomerLogin=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
        actions.moveToElement(CustomerLogin).build().perform();
        WebElement Register=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
        Register.click();
        Thread.sleep(2000);
        WebElement FirstName=driver.findElement(By.name("first_name"));
        FirstName.sendKeys("Saketh");
        Thread.sleep(2000);
        WebElement LastName=driver.findElement(By.name("last_name"));
        LastName.sendKeys("Nemalikonda");
        Thread.sleep(2000);
        WebElement EmailAddress=driver.findElement(By.id("acc_user_email"));
        EmailAddress.sendKeys("sakethnemalikonda@gmail.com");
        Thread.sleep(2000);
        WebElement Set_a_Password=driver.findElement(By.id("acc_user_password"));
        Set_a_Password.sendKeys("12345");
        Thread.sleep(2000);
        WebElement ConfirmPassword=driver.findElement(By.id("acc_user_passconf"));
        ConfirmPassword.sendKeys("12345");
        Thread.sleep(2000);
        WebElement MobileNumber=driver.findElement(By.id("acc_mobile_no"));
        MobileNumber.sendKeys("8121058116");
        Thread.sleep(2000);
        WebElement Reg_Button=driver.findElement(By.xpath("//*[@id=\"modalUserLogin\"]/div/div/div[2]/form/button"));
        Reg_Button.click();
        Thread.sleep(2000);
        driver.close();
	}

}
