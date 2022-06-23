package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.sql.Date;

import org.openqa.selenium.WebDriver;

public class Photo {

	public void getPhoto(WebDriver driver,String name) throws IOException {
		Date d=new Date();
		String date=d.toString().replaceAll(" : ", " - ");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(AutoConstant.photoPath+date+name+"");
		FileUtils.copyFile(src, dst);
	}
}