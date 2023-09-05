package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Confirmation {

	private final SelenideElement allowButton = $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));

	@Step("Нажать allow при запуске приложения")
	public void clickAllow() {
		allowButton.shouldBe(visible).click();
	}
}
