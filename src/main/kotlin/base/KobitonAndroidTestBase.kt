package org.granjamartinez.base

import io.appium.java_client.android.AndroidDriver
import org.granjamartinez.kobiton.KobitonConfigs
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import java.net.URL

open class KobitonAndroidTestBase {

    protected var driver: AndroidDriver? = null
    protected var kobitonURL: URL? = null
    protected var kobitonCapabilities: DesiredCapabilities? = null

    @BeforeClass
    fun setupDriver() {
        val kobitonConfigs = KobitonConfigs()
        kobitonURL = kobitonConfigs.serverURL()
        kobitonCapabilities = kobitonConfigs.pixel8Capabilities()
    }

    @AfterClass
    fun teardownDriver() {
        driver?.close()
    }

}