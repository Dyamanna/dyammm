package faveo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import action.Login_faveo_admin;

public class TC_3_viewoption_selectAllusers extends  Login_faveo_admin {
	@Test
	public void register() throws InterruptedException, IOException
	{ 
		Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//i[@class='fa fa-user fa-stack-1x']")).click();
		Thread.sleep(10);//to click on view
		 driver.findElement(By.xpath("(//span[@class='caret'])[2]")).click();
		 Thread.sleep(5000);
		 //all users	
		 driver.findElement(By.xpath("//a[.='All users']")).click();
			 Thread.sleep(5000);
			 System.out.println("all users pass");
		
			 driver.findElement(By.xpath("//a[.='Banned users']")).click();
			 Thread.sleep(5000);
			 System.out.println("all users pass");
			 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Thread.sleep(3000);
				// Now you can do whatever you need to do with it, for example copy somewhere
				FileUtils.copyFile(scrFile, new File("c:\\Users\\yari\\git\\laxmi\\Screenshots\\1.png"));
}
}
