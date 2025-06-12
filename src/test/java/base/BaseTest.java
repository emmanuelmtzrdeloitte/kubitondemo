package base;

import config.KobitonConfig;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class BaseTest {

    protected AndroidDriver driver = null;

    @BeforeClass
    void init() throws MalformedURLException, URISyntaxException {
        driver = new AndroidDriver(KobitonConfig.getServerURL(), KobitonConfig.getAndroidDesiredCapabilities());
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

}
