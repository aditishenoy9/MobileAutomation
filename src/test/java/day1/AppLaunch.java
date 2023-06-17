package day1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppLaunch {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
/**
 * app:GeneralStore
 * package:
 * Launcher:
 */
        //3 devices, app and server

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Test");
        cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),cap);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();


    }
}
