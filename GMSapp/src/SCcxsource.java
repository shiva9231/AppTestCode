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

public class SCcxsource {

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
    public void sccxSource() throws InterruptedException {
    
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
        appiumDriver.findElement(By.xpath("//*[@text='System Configuration']")).click();
        Thread.sleep(1000);
        appiumDriver.findElement(By.xpath("//*[@text='Manage Customer Source']")).click();

        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Manage Customer Source"));
        System.out.println("Displayed");
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/menuIcon")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/home_icon")).click();
        Thread.sleep(1000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/home_icon")).click();
        System.out.println("Home");
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Home"));
        System.out.println("main page");  
        Thread.sleep(3000);
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/menuIcon")).click();
        Thread.sleep(2000);
        appiumDriver.findElement(By.xpath("//*[@text='System Configuration']")).click();
        Thread.sleep(1000);
        appiumDriver.findElement(By.xpath("//*[@text='Manage Customer Source']")).click();

        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Manage Customer Source"));
       //Add
  
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addNew")).click();
        wait.until(ExpectedConditions.textToBe(By.className("android.widget.TextView"), "Add New Record"));
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/companyname")).sendKeys("BlueBird");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/gstnumber")).sendKeys("GST5214521a");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/emailid")).sendKeys("shiva@mail.com");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactno")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactno")).sendKeys("9992221114");
        appiumDriver.navigate().back();
        
        TouchAction sccxs = new TouchAction(appiumDriver);
        sccxs.press(PointOption.point(339, 958))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(339, 350)).release().perform();
                Thread.sleep(5000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactperson")).sendKeys("Owner Name");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/address")).sendKeys("Address of Vendor");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/city")).sendKeys("Vendor's City");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/state")).sendKeys("Telangana");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/smsr")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Sms Reminder"));
        appiumDriver.findElement(By.xpath("//*[@text='Yes']")).click();
        Thread.sleep(2000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
       Thread.sleep(3000);
       
   
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("BlueBird");
       Thread.sleep(2000);
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/editLayout")).click();
       
       wait.until(ExpectedConditions.textToBe(By.className("android.widget.TextView"), "Add New Record"));
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/companyname")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/companyname")).sendKeys("BlueBird1");
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/gstnumber")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/gstnumber")).sendKeys("GST5214521a1");
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/emailid")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/emailid")).sendKeys("shiva1@mail.com");
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactno")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactno")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactno")).sendKeys("9992221104");
       appiumDriver.navigate().back();
       
       TouchAction sccxs1 = new TouchAction(appiumDriver);
       sccxs1.press(PointOption.point(339, 958))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(339, 350)).release().perform();
               Thread.sleep(5000);
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactperson")).click();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactperson")).clear();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/contactperson")).sendKeys("Owner Name1");
               appiumDriver.navigate().back();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/address")).click();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/address")).clear();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/address")).sendKeys("Address of Vendor1");
               appiumDriver.navigate().back();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/city")).click();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/city")).clear();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/city")).sendKeys("Vendor's City1");
               appiumDriver.navigate().back();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/state")).click();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/state")).clear();
               appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/state")).sendKeys("Telangana1");
               appiumDriver.navigate().back();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/smsr")).click();
       wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Sms Reminder"));
       appiumDriver.findElement(By.xpath("//*[@text='Yes']")).click();
       Thread.sleep(2000);
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
      Thread.sleep(3000);
    
    }
    
}
