package config;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class KobitonConfig {

    private static final String SERVER_URL = "api.kobiton.com/wd/hub";
    public static final String USERNAME = "is.emmanuel.deloitte";
    public static final String ACCESS_KEY = "b4202a39-ac70-4a72-98c9-f84b0e338516";

    public static URL getServerURL() throws URISyntaxException, MalformedURLException {
        return new URI("https://"+USERNAME+":"+ACCESS_KEY+"@"+SERVER_URL).toURL();
    }

    public static DesiredCapabilities getAndroidDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("kobiton:sessionName", "Automation test session");
        desiredCapabilities.setCapability("kobiton:sessionDescription", "");
        desiredCapabilities.setCapability("kobiton:deviceOrientation", "portrait");
        desiredCapabilities.setCapability("kobiton:captureScreenshots", true);
        desiredCapabilities.setCapability("kobiton:useConfiguration", "");
        desiredCapabilities.setCapability("appium:autoWebview", true);
        desiredCapabilities.setCapability("browserName", "chrome");
        desiredCapabilities.setCapability("kobiton:deviceGroup", "KOBITON");
        desiredCapabilities.setCapability("appium:deviceName", "Pixel *");
        desiredCapabilities.setCapability("appium:platformVersion", "15");
        desiredCapabilities.setCapability("appium:username", USERNAME);
        desiredCapabilities.setCapability("appium:accessKey", ACCESS_KEY);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:app","kobiton-store:654582");
        desiredCapabilities.setCapability("kobiton:retainDurationInSeconds", 0);
        return desiredCapabilities;
    }

}
