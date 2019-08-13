package tests;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Registration {

    public static WebDriverWait wait;
    public static AppiumDriver<MobileElement> appiumDriver;
   

    @BeforeClass
    public static void beforeclass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus 4 Android 5.1");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("fullReset", false);

        capabilities.setCapability("appPackage", "project.labs.avviotech.com.rampg");
        capabilities.setCapability("appActivity", "project.labs.avviotech.com.rampg.SplashActivity");
        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        System.out.println(((AndroidDriver<MobileElement>) appiumDriver).currentActivity());

        wait = new WebDriverWait(appiumDriver,500);

    }

    @Test
    public void registartion() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/exc"))).click();
        System.out.println("Loaded");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/countryCode"))).clear();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/countryCode"))).sendKeys("91");
        System.out.println("stdcode");
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/mobileNumber").sendKeys("9121223603"+"\n");
        wait = new WebDriverWait(appiumDriver, 100);
        System.out.println("number");    
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/login")).click();
        System.out.println("login");
        wait = new WebDriverWait(appiumDriver, 500);
        System.out.println("otp");
                
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/titletext"))).click();
        
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/customerReg")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Enter Vehicle Number"))).click();
        /* vehicle number*/
        
        //appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/inputSearch").sendKeys("AP05TS4444");
        
        
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_done"))).click();
       
        /*Vehicle model*/
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/addnewVehicleName"))).click();
        appiumDriver.findElement(By.id("project.labs.avviotech.com.rampg:id/addnewVehicleName")).click();
        
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/inputSearch").sendKeys("Audi");
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_done"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_done"))).click();
        wait = new WebDriverWait(appiumDriver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/vehiclemodel"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/inputSearch").sendKeys("A3");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_done"))).click();
        /*Add New Vehicle*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/vehiclevarriant"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/inputSearch"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_done"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/save"))).click();
        /*Vehicle Name*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/vehicleNameEdit"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/inputSearch"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/tv_item").sendKeys("Audi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/inputSearch"))).click();
        /* Add New Category*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/addnewVehicleCateg"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/vehicle_category").sendKeys("Test Category");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_item"))).click();
        /*Mobile Number*/
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/mobilenoEdit").sendKeys("9090909090");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        /*Customer Name*/
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/customernameEdit").sendKeys("Tester1");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        /*Add New Customer Source*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/addnewcustomersource"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/companyname").sendKeys("RentalBikes");
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/gstnumber").sendKeys("GSTRB4545");
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/emailid").sendKeys("rentalbikes@gmail.com");
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/contactno").sendKeys("7897897890");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/address").sendKeys("Hyderabad");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/save"))).click();
        /*Customer Source*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/customersourceEdit"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/inputSearch"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_item"))).click();
        /*Kilometer Driven*/
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/kmdrivenEdit").sendKeys("9520");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        /*Add New Technician*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/addnewtechnician"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/workshopid").sendKeys("TestRamp");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/emailidEdit").sendKeys("tr@gmail.com");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/fname").sendKeys("Owner");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/lname").sendKeys("Ramp");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/password").sendKeys("Workshop123");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/expirydate"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/date_picker_header_year"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/next"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/month_view/android.view.View"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/contactno").sendKeys("8885557772");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/save"))).click();
        /*Technician*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/technicianEdit"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/inputSearch"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_item"))).click();
        /*Add New Supervisor*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/addnewsuperwisor"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/workshopid").sendKeys("TestRamp");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/emailidEdit").sendKeys("tr@gmail.com");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/fname").sendKeys("Owner");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/lname").sendKeys("Ramp");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/password").sendKeys("Workshop123");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/expirydate"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/date_picker_header_year"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/next"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/month_view/android.view.View"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1"))).click();
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/contactno").sendKeys("8885557773");
        appiumDriver.navigate().back();
        wait = new WebDriverWait(appiumDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/save"))).click();
        /*Supervisor*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/superwisorEdit"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/inputSearch"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/tv_item"))).click();
        /*Email ID */
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/emailidEdit").sendKeys("test@gmail.com");
        /*Address*/
        appiumDriver.findElementById("project.labs.avviotech.com.rampg:id/customeraddressEdit").sendKeys("Kovvur");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/submit"))).click();
        /*TakePics*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/takepicture"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera:id/shutter_button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.camera:id/done_button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/activity_main_rfab"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/rfab__content_label_list_icon_iv"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/rfab__content_label_list_label_tv"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/activity_main_rfab"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/save"))).click();
        /*SharePic To WhatsApp*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/shareimage"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/what"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.whatsapp:id/contactpicker_row_name"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/what"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.whatsapp:id/send"))).click();
        /*SharePic To Email*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/ema"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/text1"))).click();
        /*Take Pics Skip*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("project.labs.avviotech.com.rampg:id/skip"))).click();

    }
}


