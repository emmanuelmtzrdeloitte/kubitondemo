package base

import io.appium.java_client.service.local.AppiumDriverLocalService
import io.appium.java_client.service.local.AppiumServiceBuilder
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeTest
import java.io.File

open class BaseTest {

    protected var service: AppiumDriverLocalService? = null

    @BeforeTest
    open fun setupAppium() {
        service = AppiumServiceBuilder().apply {
            withAppiumJS(File("//usr//local//lib//node_modules//appium/build//lib//main.js"))
            withIPAddress("127.0.0.1")
            usingPort(4723)
        }.build()
    }

    @AfterClass
    open fun tearDownAppium() {
        service?.stop()
    }

}