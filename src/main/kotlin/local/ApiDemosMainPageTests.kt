package local

import ApiDemoPreferencePageTestsContract
import ApiDemosMainPageTestContract
import base.AndroidBaseTest
import io.appium.java_client.AppiumBy
import pages.MainPage
import org.testng.annotations.Test
import pages.PreferenceDependenciesPage
import pages.PreferencesPage

class ApiDemosMainPageTests : AndroidBaseTest(), ApiDemoPreferencePageTestsContract {

    @Test
    override fun `when Api Demos app is opened then select preference option then display Preference Screen`() {
        val mainPage = MainPage()
        val preferencesPage = PreferencesPage()
        val preferenceDependenciesPage = PreferenceDependenciesPage()

        val preferenceOption = getDriver().findElement(mainPage.preferenceOption)
        preferenceOption.click()

        val preferenceDependencies = getDriver().findElement(preferencesPage.preferencesDependenciesOption)
        preferenceDependencies.click()

        val wifiCheckBox = getDriver().findElement(preferenceDependenciesPage.wifiCheckBox)
        wifiCheckBox.click()

        val wifiSettingsOption = getDriver().findElement(preferenceDependenciesPage.wifiSettingsOption)
        wifiSettingsOption.click()

        val wifiSettingsEditText = getDriver().findElement(preferenceDependenciesPage.wifiSettingsEditText)
        wifiSettingsEditText.sendKeys("Emmanuel Wifi")

        val okButton = getDriver().findElement(preferenceDependenciesPage.okButton)
        okButton.click()

    }

}