import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import io.appium.java_client.touch.offset.PointOption;
import static java.time.Duration.ofMillis;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reports {

	public static WebDriverWait wait;
    public static AppiumDriver<MobileElement> appiumDriver;
    String path;
   

    @BeforeClass
    public static void beforeclass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus 4 Android 5.1");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("noReset", true);

        capabilities.setCapability("appPackage", "project.labs.avviotech.com.rampg");
      // capabilities.setCapability("appActivity", "project.labs.avviotech.com.rampg.SplashActivity");
      capabilities.setCapability("appActivity", "project.labs.avviotech.com.rampg.HomeActivity");
        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println(((AndroidDriver<MobileElement>) appiumDriver).currentActivity());
        wait = new WebDriverWait(appiumDriver,500);

}
    @Test
    public void reports() throws InterruptedException {
    
    	/*
   	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/exc"))).click();
       System.out.println("Loaded");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/countryCode"))).clear();
       
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/countryCode"))).sendKeys("91");
       System.out.println("stdcode");
       appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/mobileNumber").sendKeys("9704021908"+"\n");
       wait = new WebDriverWait(appiumDriver, 100);
       System.out.println("number");    
       
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/login")).click();
       System.out.println("login");
       wait = new WebDriverWait(appiumDriver, 600);
       System.out.println("otp");
      */
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/titletext"))).click();
        System.out.println("main page");  
        Thread.sleep(5000);

        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/menuIcon")).click();
        Thread.sleep(2000);
        appiumDriver.findElement(By.xpath("//*[@text='Reports']")).click();
        Thread.sleep(1000);
        
        TouchAction trvpr = new TouchAction(appiumDriver);
        trvpr.press(PointOption.point(410, 993))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(410, 394)).release().perform();
        Thread.sleep(5000);
        
        //Vendor Purchase report
        appiumDriver.findElement(By.xpath("//*[@text='Vendor Purchase Report']")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Update Purchase Report"));
        
        
        //Business reports
        appiumDriver.findElement(By.xpath("//*[@text='Business Reports']")).click();
        
        //Day-book 
        appiumDriver.findElement(By.xpath("//*[@text='By Day Book Reports']")).click();
        
        //Insurance
        appiumDriver.findElement(By.xpath("//*[@text='By Insurance Claim']")).click();
        
        //payment
        appiumDriver.findElement(By.xpath("//*[@text='By Payment Reports']")).click();
        
        //spare&services
        appiumDriver.findElement(By.xpath("//*[@text='By Spares & Services']")).click();
        
        //In and out
        appiumDriver.findElement(By.xpath("//*[@text='By Stock In/Out Reports']")).click();
        
        //tech&sup
        appiumDriver.findElement(By.xpath("//*[@text='By Tech & Super']")).click();
        
        //GST
        appiumDriver.findElement(By.xpath("//*[@text='GST Filing Reports']")).click();
        
        //By invoice
        appiumDriver.findElement(By.xpath("//*[@text='Report By Invoices']")).click();
        
        //spare quotation
        appiumDriver.findElement(By.xpath("//*[@text='Spare Quotation Reports']")).click();
        
        //transfer
        appiumDriver.findElement(By.xpath("//*[@text='Spares Transfer']")).click();
        
    }
}