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

public class Coupon {
	
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
    public void coupon() throws InterruptedException {
    
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
          
        
        TouchAction tcoup = new TouchAction(appiumDriver);
        tcoup.press(PointOption.point(708, 533))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(28, 533)).release().perform();
        
        Thread.sleep(5000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/couponsicon")).click();
        
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Add New/Manage Coupons"));
     
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addNew")).click();
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/close")).click();
        System.out.println("closed");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addNew")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/eff_date")).click();
        
        appiumDriver.findElement(By.xpath("//android.view.View[@content-desc='27 August 2019 selected']")).click();
        appiumDriver.findElement(By.id("android:id/button1")).click();
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/exp_date")).click();
      // //android.view.View[@content-desc="27 August 2019 selected"]
        appiumDriver.findElement(By.xpath("//android.view.View[@content-desc='31 August 2019']")).click();
        appiumDriver.findElement(By.id("android:id/button1")).click();
        
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/discountvalue")).sendKeys("150");
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/qty")).sendKeys("1");
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/couponname")).sendKeys("Free check");
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/coupontext")).sendKeys("Check");;
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/submit")).click();
        
        Thread.sleep(5000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/apply_layout")).click();
        Thread.sleep(1000);
        
        
        
        
    }
   }