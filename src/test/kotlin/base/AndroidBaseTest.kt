package base

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import org.testng.annotations.BeforeClass
import java.net.URI
import java.time.Duration

open class AndroidBaseTest : BaseTest() {

    protected var driver: AppiumDriver? = null

    @BeforeClass
    override fun setupAppium() {
        super.setupAppium()

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

    override fun tearDownAppium() {
        super.tearDownAppium()
        driver?.close()
    }

}