package base;

import config.KobitonConfig;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver = null;

    @BeforeClass
    protected void init() throws MalformedURLException, URISyntaxException {
        URL serverURL = KobitonConfig.getServerURL();
        DesiredCapabilities capabilities = KobitonConfig.getAndroidDesiredCapabilities();
        driver = new AndroidDriver(serverURL, capabilities);
    }

    @AfterClass
    protected void tearDown() {
        driver.quit();
    }

}
