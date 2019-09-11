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


public class InsDet {

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
    public void insdetail() throws InterruptedException {
    
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
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("TT01AP0018");
 Thread.sleep(5000);   
          
          TouchAction insd = new TouchAction(appiumDriver);
          insd.press(PointOption.point(708, 533))
  	       .waitAction(waitOptions(ofMillis(1000)))
  		   .moveTo(PointOption.point(28, 533)).release().perform();
          
          Thread.sleep(5000);
          
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/insurancewicon")).click();
          wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Insurance"));
          //policy number
        
         
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/policynoEdit")).sendKeys("22ws541");
          Thread.sleep(1000);
          
          //claim
          insd.tap(PointOption.point(386, 429)).perform();
          Thread.sleep(2000);
       
         insd.tap(PointOption.point(400, 628)).perform();
         Thread.sleep(2000);
       
          System.out.println("222");
          
          //ClaimType
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/claimTypeEdit")).click();
          insd.tap(PointOption.point(353, 667)).perform();
          Thread.sleep(1000);
          //ProvideName
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/providerEdit")).click();
          wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Provider Name"));
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("kotak");
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
          Thread.sleep(1000);
          appiumDriver.navigate().back();
          //Expirydate
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/insedateEdit")).click();
          appiumDriver.findElement(By.id("android:id/date_picker_year")).click();
          appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='2021']")).click();
          appiumDriver.findElement(By.xpath("//android.view.View[@content-desc='30 September 2021']")).click();
          appiumDriver.findElement(By.id("android:id/button1")).click();
         Thread.sleep(2000);
          
         insd.longPress(PointOption.point(517, 1160)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(517, 55)).release().perform();
         System.out.println("1st");
         insd.longPress(PointOption.point(517, 1160)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(517, 55)).release().perform();
          System.out.println("2nd");
          insd.longPress(PointOption.point(517, 1160)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(517, 55)).release().perform();
          Thread.sleep(5000);
         
          
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/pilicyexcessedit")).click();
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/pilicyexcessedit")).sendKeys("1000");
          appiumDriver.navigate().back();
          //submit
          insd.tap(PointOption.point(353, 1110)).perform();
          wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/common_alert_ok"), "OK"));
          appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/common_alert_ok")).click();

    }
    
}
          
          
          