package pages

import io.appium.java_client.AppiumBy

class PreferenceDependenciesPage {
    val wifiCheckBox = AppiumBy.id("android:id/checkbox")
    val wifiSettingsOption = AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")
    val wifiSettingsEditText = AppiumBy.id("android:id/edit")
    val okButton = AppiumBy.id("android:id/button1")
}