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

public class SCtaxhsn {
	
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
    public void insstate() throws InterruptedException {
    
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
 
        TouchAction ttax = new TouchAction(appiumDriver);
        ttax.press(PointOption.point(517, 1087))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(517, 304)).release().perform();
        Thread.sleep(5000);
        
        appiumDriver.findElement(By.xpath("//*[@text='Manage Tax Rates / HSN Code']")).click();
        
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Manage Tax Rates / Code"));
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
 
        TouchAction ttax1 = new TouchAction(appiumDriver);
        ttax1.press(PointOption.point(517, 1087))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(517, 304)).release().perform();
        Thread.sleep(5000);
        
        appiumDriver.findElement(By.xpath("//*[@text='Manage Tax Rates / HSN Code']")).click();
        
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Manage Tax Rates / Code"));
        System.out.println("Displayed");
        //add
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addNew")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/h1"), "Add New Record"));
        Thread.sleep(2000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/close")).click();
        Thread.sleep(2000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addNew")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/h1"), "Add New Record"));
       
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tax_type")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Select Tax Type"));
        appiumDriver.findElement(By.xpath("//*[@text='Spares']")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tax_category")).sendKeys("TestTaxcat1");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/hsn")).sendKeys("8701 44 44");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tax_value")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Select Tax Type"));
        appiumDriver.findElement(By.xpath("//*[@text='28%']")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
        Thread.sleep(2000);        
        //Search
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("TestTaxcat1");
        
        //Edit
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/editLayout")).click();

        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/h1"), "Edit Record"));
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tax_type")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Select Tax Type"));
        appiumDriver.findElement(By.xpath("//*[@text='Services']")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tax_category")).sendKeys("TestTaxcat112");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/hsn")).sendKeys("8701 09 10");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tax_value")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Select Tax Type"));
        appiumDriver.findElement(By.xpath("//*[@text='18%']")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
        Thread.sleep(2000);   
        
        //Delete
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/deleteLayout")).click();

        wait.until(ExpectedConditions.textToBe(By.id("android:id/message"), "Are you sure?"));
        appiumDriver.findElement(By.id("android:id/button2")).click();
        System.out.println("Cancelled");
        Thread.sleep(1000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/deleteLayout")).click();
        wait.until(ExpectedConditions.textToBe(By.id("android:id/message"), "Are you sure?"));
        appiumDriver.findElement(By.id("android:id/button1")).click();
        System.out.println("Deleted");
        
        
    }
    
}
