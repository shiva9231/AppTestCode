
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


public class Estimation {
	
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
    public void estimation() throws InterruptedException {
     
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
           appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("TT01AP0002");
           Thread.sleep(5000);   
           
           TouchAction ts = new TouchAction(appiumDriver);
           ts.press(PointOption.point(708, 533))
   	       .waitAction(waitOptions(ofMillis(1000)))
   		   .moveTo(PointOption.point(28, 533)).release().perform();
           
           Thread.sleep(5000);
           appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/jobcardicon")).click();
           
           System.out.println("1");
           
           jobcard();
           
           /*
           if(appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/jobcard_no")).isDisplayed())
           {
        	   System.out.println("2");
        	   appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/radioButton3")).click();
        	   appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/saveins")).click();
        	   estimate();
        	   
           } else
           {
        	   System.out.println("3");
        	   jobcard();
           }
           
    
*/
}
	private void jobcard() throws InterruptedException {
		
/*		
		// TODO Auto-generated method stub
		System.out.println("4");
		// appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/jobcardicon")).click();
		Thread.sleep(5000);
	
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/titletext"))).click();
			
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/addbtn"))).click();
		//appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addbtn")).click();
		Thread.sleep(5000);
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/compaints")).sendKeys("complaint 1");
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addtolist")).click();
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/compaints")).sendKeys("complaint 2");
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addtolist")).click();
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/compaints")).sendKeys("complaint 3"); 

		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/addInternalbtn"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/notes"))).sendKeys("Internal note test");
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/addCustomerbtn"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/notes"))).sendKeys("Customer note test");
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
		
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/jccheckbox")).click();
		Thread.sleep(2000);
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/deletebtn")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/viewjc"))).click();
		
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_heading")).isDisplayed();
		
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/delivery_datetime")).click();
		
		appiumDriver.findElement(By.xpath("//android.view.View[@content-desc='25 August 2019']")).click();
		
		appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();

		appiumDriver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='12']")).click();
		appiumDriver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='30']")).click();
		appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();

	    appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/saveprint")).click();
	    
	    //appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/yes_no_sms")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/yes_no_sms"))).click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button2"))).click();
	    Thread.sleep(10000);
	    appiumDriver.navigate().back();
	    
	    wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/titletext"), "Job Card / Estimation"));
	    
	    //spares
	    
	    TouchAction tspare = new TouchAction(appiumDriver);
        tspare.press(PointOption.point(615, 765))
	       .waitAction(waitOptions(ofMillis(1000)))
		   .moveTo(PointOption.point(26, 765)).release().perform();
      
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addbtn")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/servicename")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("12566");
        Thread.sleep(3000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).sendKeys("2");
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/spares_child")).click();
        Thread.sleep(1000);
       
        if(appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/quantity")).isDisplayed())
        {        	
        	appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/quantity")).click();
        }
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).clear();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).sendKeys("5210");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partvalue")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("8708 40");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addtolist")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/common_alert_header"), "Notification"));   
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/common_alert_ok")).click();
        Thread.sleep(2000);
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/servicename")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("741258963");
        Thread.sleep(3000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).clear();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).sendKeys("3");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/spares_child")).click();
        
        if(appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/quantity")).isDisplayed())
        {
        	appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/quantity")).click();
        }
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).clear();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).sendKeys("2210");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partvalue")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("8708 91");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        
     
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addtolist")).click();
        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/common_alert_header"), "Notification"));   
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/common_alert_ok")).click();
        Thread.sleep(2000);
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/servicename")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("14555");
        Thread.sleep(3000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).clear();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).sendKeys("1");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/spares_child")).click();
        
        if(appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/quantity")).isDisplayed())
        {
        	appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/quantity")).click();
        }
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).clear();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).sendKeys("500");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partvalue")).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("8708 92");
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
        Thread.sleep(1000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
        
        
        Thread.sleep(5000);
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/jccheckbox")).click();
		Thread.sleep(2000);
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/deletebtn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/tv_yes"))).click();
		Thread.sleep(2000);
		
		appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/printbtn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/detailed"))).click();
		Thread.sleep(10000);
		 appiumDriver.navigate().back();
		 
		 // Service
		 
		 TouchAction tservice = new TouchAction(appiumDriver);
	        tservice.press(PointOption.point(615, 765))
		       .waitAction(waitOptions(ofMillis(1000)))
			   .moveTo(PointOption.point(26, 765)).release().perform();
	        
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addbtn")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/servicename")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("general");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).clear();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).sendKeys("1");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).clear();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).sendKeys("2500");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partvalue")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("998714");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addtolist")).click();
	        
	        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/common_alert_header"), "Notification"));   
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/common_alert_ok")).click();
	        Thread.sleep(2000);
	        
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/servicename")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("ac service");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).clear();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).sendKeys("1");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).clear();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).sendKeys("5000");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partvalue")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("998714");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addtolist")).click();
	        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/common_alert_header"), "Notification"));   
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/common_alert_ok")).click();
	        Thread.sleep(2000);
	        
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/servicename")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("wash");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).clear();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partqty")).sendKeys("1");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).clear();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partprice")).sendKeys("1000");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/partvalue")).click();
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/inputSearch")).sendKeys("998714");
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/tv_item")).click();
	        
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/save")).click();
	        Thread.sleep(5000);
	        
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/jccheckbox")).click();
			Thread.sleep(2000);
			appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/deletebtn")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1"))).click();
			Thread.sleep(2000);
			
			appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/printbtn")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("project.labs.avviotech.com.rampg:id/detailed"))).click();
			Thread.sleep(10000);
			appiumDriver.navigate().back();
*/ 
	        Thread.sleep(4000);
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/closebtn")).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/home_icon"))).isDisplayed();
	        Thread.sleep(5000);
	       
	        // EDIT PROFILE
	        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/searchEdit")).sendKeys("TT01AP0002");
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
	       if(appiumDriver.findElement(By.id("android:id/alertTitle")).isDisplayed())
	       {
	      // if number or vehicle is updated
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1"))).click();
	        appiumDriver.findElement(By.name("Done")).click();
	       }else{
	        wait.until(ExpectedConditions.textToBe(By.id("project.labs.avviotech.com.rampg:id/tv_heading"), "Records Successfully Update!"));
	        appiumDriver.findElement(By.name("Done")).click();
	       }
		
	}
}


