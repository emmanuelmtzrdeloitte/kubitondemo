package page;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class MainPage {

    public static final By preferenceOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Preference\"]");
    public static final By preferenceDependenciesOption = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Preference\"]");

}
