package seleniumimportant;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotexample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

			  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	          WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			  driver.get ("https://www.google.com/");
				 driver.findElement(By.name("q")).sendKeys("carl"+Keys.ENTER);
				 
				/*TakesScreenshot screenshot=(TakesScreenshot) driver;
				File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
				File destinationFile= new File("D://sample.png");
				FileHandler.copy(sourceFile, destinationFile);*/
				 
				 Robot robot=new Robot();
				 @SuppressWarnings("unused")
				Dimension screenshot= Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rectangle=new Rectangle(screenshot);
				@SuppressWarnings("unused")
				BufferedImage sourcefile=robot.createScreenCapture(rectangle);
				File destinationfile=new File("D://sample1.png");
				ImageIO.write(sourcefile, "png", destinationfile);

	}
}
