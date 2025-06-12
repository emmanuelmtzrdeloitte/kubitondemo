package kobiton

import ApiDemosMainPageTestContract
import io.appium.java_client.android.AndroidDriver
import base.KobitonAndroidTestBase
import pages.MainPage
import org.testng.Assert
import org.testng.annotations.Test

class ApiDemosMainPageKobitonTests : KobitonAndroidTestBase() , ApiDemosMainPageTestContract {

    @Test
    override
    fun `when Api Demos app is opened accessibility option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.accessibilityOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened animation option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.animationOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened app option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.appOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened content option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.contentOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened graphics option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.graphicsOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened media option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.mediaOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened nfc option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.nfcOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened os option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.osOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened preference should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.preferenceOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened text option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.textOption)?.isDisplayed ?: false)
    }

    @Test
    override fun `when Api Demos app is opened views option should be displayed`() {
        kobitonCapabilities?.apply {
            setCapability("appium:app","kobiton-store:654582")
        }
        driver = AndroidDriver(kobitonURL, kobitonCapabilities)
        val mainPage = MainPage()

        Assert.assertTrue(driver?.findElement(mainPage.viewsOption)?.isDisplayed ?: false)
    }

}