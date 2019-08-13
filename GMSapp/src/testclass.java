
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testclass {
	
public static WebDriverWait wait;
	
    public static AppiumDriver<MobileElement> appiumDriver;
    
    @BeforeClass
    public static void BeforeClass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus 4 Android 5.1");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("noReset", true);
        
    
        capabilities.setCapability("appPackage", "project.labs.avviotech.com.rampg");
       capabilities.setCapability("appActivity", "project.labs.avviotech.com.rampg.SplashActivity");
       // capabilities.setCapability("appActivity", "project.labs.avviotech.com.rampg.HomeActivity");
        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        System.out.println(((AndroidDriver<MobileElement>) appiumDriver).currentActivity());

        wait = new WebDriverWait(appiumDriver,500);

    }
    
    @Test
    public void registartion() {
      
    //	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/exc"))).click();
        System.out.println("Loaded");
    //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/countryCode"))).clear();
        
   //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/countryCode"))).sendKeys("91");
        System.out.println("stdcode");
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/mobileNumber").sendKeys("9704021908"+"\n");
        wait = new WebDriverWait(appiumDriver, 100);
        System.out.println("number");    
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/login")).click();
        System.out.println("login");
        wait = new WebDriverWait(appiumDriver, 600);
        System.out.println("otp");
        
 //////       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/titletext"))).click();
           System.out.println("main page");  
       appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customerReg")).click();
       System.out.println("b4 w8");
        wait = new WebDriverWait(appiumDriver, 20);
        System.out.println("af");
       /////code for popup vehicle number till done
        wait = new WebDriverWait(appiumDriver,500);
//////        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/vehicleNumberEdit"))).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("TT01AP0001");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_done")).click();
        // vehicle name
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/vehicleNameEdit")).sendKeys("jeep");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        
        //code for vehicle model 
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/vehiclecatEdit")).click();
        //code for vehicle category
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/mobilenoEdit")).sendKeys("9121223603"+"\n");
        
        wait = new WebDriverWait(appiumDriver, 20);
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customernameEdit")).sendKeys("Shiva k"+"\n");
        wait = new WebDriverWait(appiumDriver, 20);
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customersourceEdit")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
       //code same as vehicle model
        wait = new WebDriverWait(appiumDriver, 20);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/kmdrivenEdit")).sendKeys("6541");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 20);
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/technicianEdit")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        //code same as vehicle model
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/superwisorEdit")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        
        
        //code same as above
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/emailidEdit")).sendKeys("shiva.shanrohi@gmail.com"+"\n");
        wait = new WebDriverWait(appiumDriver, 20);
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customeraddressEdit")).sendKeys("hyd-81");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 20);
        
        // appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/submit")).click();
      
        
    }
}

