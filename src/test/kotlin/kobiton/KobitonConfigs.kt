package kobiton

import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URI
import java.net.URL

class KobitonConfigs {

    companion object {
        const val SERVER_URL = "api.kobiton.com/wd/hub"
        const val USERNAME = "is.emmanuel.deloitte"
        const val ACCESS_KEY = "b4202a39-ac70-4a72-98c9-f84b0e338516"
    }

    fun serverURL(): URL {
        return URI("https://$USERNAME:$ACCESS_KEY@$SERVER_URL").toURL()
    }

    fun pixel8Capabilities(): DesiredCapabilities {
        return DesiredCapabilities().apply {
            setCapability("kobiton:sessionName", "Automation test session")
            setCapability("kobiton:sessionDescription", "")
            setCapability("kobiton:deviceOrientation", "portrait")
            setCapability("kobiton:captureScreenshots", true)
            setCapability("kobiton:useConfiguration", "")
            setCapability("appium:autoWebview", true)
            setCapability("browserName", "chrome")
            setCapability("kobiton:deviceGroup", "KOBITON")
            setCapability("appium:deviceName", "Pixel *")
            setCapability("appium:platformVersion", "15")
            setCapability("appium:username", USERNAME)
            setCapability("appium:accessKey", ACCESS_KEY)
            setCapability("platformName", "Android")
            setCapability("kobiton:retainDurationInSeconds", 0)
        }
    }

}