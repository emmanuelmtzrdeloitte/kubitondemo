package local

import ApiDemosTestContract
import base.AndroidBaseTest
import pages.MainPage
import org.testng.Assert
import org.testng.annotations.Test

class ApiDemosTests : AndroidBaseTest(), ApiDemosTestContract {

    @Test
    override fun `when Api Demos app is opened accessibility option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.accessibilityOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened animation option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.animationOption).isDisplayed)

    }

    @Test
    override fun `when Api Demos app is opened app option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.appOption).isDisplayed)

    }

    @Test
    override fun `when Api Demos app is opened content option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.contentOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened graphics option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.graphicsOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened media option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.mediaOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened nfc option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.nfcOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened os option should be displayed`() {
       val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.osOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened preference should be displayed`() {
       val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.preferenceOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened text option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.textOption).isDisplayed)
    }

    @Test
    override fun `when Api Demos app is opened views option should be displayed`() {
        val mainPage = MainPage()

        Assert.assertTrue(getDriver().findElement(mainPage.viewsOption).isDisplayed)
    }

}