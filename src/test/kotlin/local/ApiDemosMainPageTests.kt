package local

import ApiDemoPreferencePageTestsContract
import base.AndroidBaseTest
import org.testng.annotations.Ignore
import org.testng.annotations.Test
import pages.MainPage
import pages.PreferenceDependenciesPage
import pages.PreferencesPage

@Ignore
class ApiDemosMainPageTests : AndroidBaseTest(), ApiDemoPreferencePageTestsContract {

    @Test
    override fun `when Api Demos app is opened then select preference option then display Preference Screen`() {
        val mainPage = MainPage()
        val preferencesPage = PreferencesPage()
        val preferenceDependenciesPage = PreferenceDependenciesPage()

        val preferenceOption = driver?.findElement(mainPage.preferenceOption)
        preferenceOption?.click()

        val preferenceDependencies = driver?.findElement(preferencesPage.preferencesDependenciesOption)
        preferenceDependencies?.click()

        val wifiCheckBox = driver?.findElement(preferenceDependenciesPage.wifiCheckBox)
        wifiCheckBox?.click()

        val wifiSettingsOption = driver?.findElement(preferenceDependenciesPage.wifiSettingsOption)
        wifiSettingsOption?.click()

        val wifiSettingsEditText = driver?.findElement(preferenceDependenciesPage.wifiSettingsEditText)
        wifiSettingsEditText?.sendKeys("Emmanuel Wifi")

        val okButton = driver?.findElement(preferenceDependenciesPage.okButton)
        okButton?.click()

    }

}