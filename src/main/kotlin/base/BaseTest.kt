package base

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.appium.java_client.service.local.AppiumDriverLocalService
import io.appium.java_client.service.local.AppiumServiceBuilder
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeTest
import java.io.File
import java.net.URI
import java.time.Duration

open class BaseTest<Driver : AppiumDriver> {

    private var driver: AppiumDriver? = null
    private var service: AppiumDriverLocalService? = null

    @BeforeTest
    fun setupAppium() {
        service = AppiumServiceBuilder().apply {
            withAppiumJS(File("//usr//local//lib//node_modules//appium/build//lib//main.js"))
            withIPAddress("127.0.0.1")
            usingPort(4723)
        }.build()

        service?.let {
            it.start()
            val options = UiAutomator2Options().apply {
                setDeviceName("Pixel_8_Pro_API_31")
                setApp(javaClass.classLoader.getResource("ApiDemos-debug.apk")?.toURI()?.path)
            }

            driver = AndroidDriver(URI("http://127.0.0.1:4723").toURL(), options)
            driver?.manage()?.timeouts()?.implicitlyWait(Duration.ofSeconds(10))
        }
    }

    fun getDriver(): Driver {
        return driver as Driver
    }

    @AfterClass
    fun tearDownAppium() {
        driver?.quit()
        service?.stop()
    }

}