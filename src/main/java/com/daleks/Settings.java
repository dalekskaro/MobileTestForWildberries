package com.daleks;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Settings implements WebDriverProvider {
    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setCapability(MobileCapabilityType.VERSION, "10");
        capabilities.setCapability("automationName", "UIAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus 5 API 29");
        capabilities.setCapability("app", "C:\\Users\\Ira\\Downloads\\Wildberries.apk");
        capabilities.setCapability("appActivity","ru.wildberries.SplashActivity");
        capabilities.setCapability("appPackage","com.wildberries.ru");
        capabilities.setCapability("fullReset","True");

        try {
            return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}