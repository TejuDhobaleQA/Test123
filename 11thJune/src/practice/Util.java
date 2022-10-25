package practice;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Util {

	public static void takess (WebDriver driver ) throws IOException {  
		String time = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date());
		String a = RandomString.make();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Tejashri\\Desktop\\Selenium\\SS\\"+a+time+".jng");
		//FileUtils.copyFile(src, desc);
		FileHandler.copy(src, desc);
	}
	
	public static void fetchdata(String ExcelPath, String n) throws IOException {
	 
		
		//File f=new File(ExcelPath);
//		FileInputStream s=new FileInputStream(ExcelPath);
//		WorkbookFactory.create(s)
//		n=f.getName();
		
	}
	
	
}
