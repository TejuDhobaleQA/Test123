package practice;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import graphql.org.antlr.v4.runtime.misc.Utils;

public class UseUtil extends Utils {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejashri\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//ChromeBrowser();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
//		String timedate= new SimpleDateFormat("dd-MM-yyyy__hh-mm-ss").format(new Date());
//	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    File dest=new File("C:\\Users\\Tejashri\\Desktop\\Selenium\\SS\\"+timedate+".jpg");
//	    FileHandler.copy(src, dest);
	
	}

	

}
