import assertions.MainPageAssertions;
import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;
import page.PreferencePage;

public class MainPageTests extends BaseTest implements MainPageAssertions {

    @Test
    @Override
    public void assertPreferenceOptionIsDisplayed() {
        WebElement preferenceOption = driver.findElement(MainPage.preferenceOption);
        Assert.assertTrue(preferenceOption.isDisplayed());
    }

    @Override
    public void assertThatClickingPreferenceOptionOpensPreferencePage() {
        WebElement preferenceOption = driver.findElement(MainPage.preferenceOption);
        preferenceOption.click();
    }

    @Override
    public void assertThatOnPreferenceScreenPreferenceDependenciesOptionIsDisplayed() {
        WebElement preferenceOption = driver.findElement(MainPage.preferenceOption);
        preferenceOption.click();
        Assert.assertTrue(driver.findElement(PreferencePage.preferencesDependenciesOption).isDisplayed());
    }
}
