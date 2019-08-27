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

public class EditProfile {
	
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
    public void editprofile() throws InterruptedException {
    
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
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("TT01AP0012");
          Thread.sleep(5000);   
          
          TouchAction t2nd = new TouchAction(appiumDriver);
          t2nd.press(PointOption.point(708, 533))
  	       .waitAction(waitOptions(ofMillis(1000)))
  		   .moveTo(PointOption.point(28, 533)).release().perform();
          
          Thread.sleep(5000);
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/profilewicon")).click();
       
       wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Customer Profile"));
       //Veh Num
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/vehicleNumberEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("TT01AP0012");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_done"))).click();
       
       // Veh name
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/vehicleNameEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("tata-nano");
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
       
       // Veh cat
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/vehiclecatEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("Suv");
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
       // mobile
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/mobilenoEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/mobilenoEdit")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/mobilenoEdit")).sendKeys("9704021909");
       Thread.sleep(1000);
       appiumDriver.navigate().back();		
       
       //Cx name
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customernameEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customernameEdit")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customernameEdit")).sendKeys("Shiva Kumar M");
       Thread.sleep(1000);
       appiumDriver.navigate().back();		
       // drag code
       TouchAction editp = new TouchAction(appiumDriver);
       editp.press(PointOption.point(596, 1040))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(596, 295)).release().perform();
       //KMS
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/kmdrivenEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/kmdrivenEdit")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/kmdrivenEdit")).sendKeys("7410");
       //tech
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/technicianEdit")).click();
       Thread.sleep(1000);
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("demo");
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click(); 
       //super
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/superwisorEdit")).click();
       Thread.sleep(1000);
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("kalyan");
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
       appiumDriver.navigate().back();	
       //email
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/emailidEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/emailidEdit")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/emailidEdit")).sendKeys("mail@mail.com");
       appiumDriver.navigate().back();	
       //Address
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customeraddressEdit")).click();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customeraddressEdit")).clear();
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customeraddressEdit")).sendKeys("Address");
       appiumDriver.navigate().back();	
       //Submit
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/submit")).click();
       Thread.sleep(2000);
       
       //appiumDriver.findElement(By.name("Done")).click();
     appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/skip")).click();

  
}
}
