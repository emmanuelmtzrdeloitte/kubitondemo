package pages

import io.appium.java_client.AppiumBy

class MainPage {

    val accessibilityOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]")
    val animationOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")
    val appOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]")
    val contentOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Content\"]")
    val graphicsOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]")
    val mediaOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Media\"]")
    val nfcOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"NFC\"]")
    val osOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"OS\"]")
    val preferenceOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")
    val textOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Text\"]")
    val viewsOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")



}