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


public class ReadynInvoice {
	
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
    public void readyInvoice() throws InterruptedException {
    
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
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/serviceQueue")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/home_icon"))).isDisplayed();
        Thread.sleep(5000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("2538");
        Thread.sleep(5000);   
        TouchAction tred = new TouchAction(appiumDriver);
        tred.press(PointOption.point(708, 533))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(28, 533)).release().perform();
        Thread.sleep(5000); 
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/readywicon")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/common_alert_header"), "Mark the vehicle ready"));
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/yes_wo_sms")).click();
        Thread.sleep(10000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("2538");
        Thread.sleep(5000);  
        TouchAction tred1 = new TouchAction(appiumDriver);
        tred1.press(PointOption.point(708, 533))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(28, 533)).release().perform();
        Thread.sleep(5000); 
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/invoicewicon")).click();
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.textToBe(By.xpath("//[@class='android.widget.TextView'] and [@index=0]"), "Select Bill Type"));
    
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/radioButton1")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/sgstradio")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/saveins")).click();
        appiumDriver.navigate().back();
        
    }
    }
        
