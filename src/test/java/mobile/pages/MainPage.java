package mobile.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import mobile.enams.MenuElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

	private final SelenideElement menuButton = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")),
			title = $(AppiumBy.className("android.widget.ImageView")),
			leftMenuButton = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView"));
	private final ElementsCollection menuElements = $$(AppiumBy.className("android.widget.TextView"));

	@Step("Нажать на кнопку меню")
	public void clickMenu() {
		menuButton.click();
	}

	@Step("Проверить элементы меню")
	public void checkElementMenu(MenuElements element) {
		menuElements
				.shouldBe(CollectionCondition.sizeGreaterThan(0))
				.find(text(element.getValue()));
	}

	@Step("Проверить заголовок {name}")
	public void checkTitle() {
		title.should(visible);
	}

	@Step("Проверить отображение левого меню")
	public void checkLeftMenu() {
		leftMenuButton.should(visible);
	}

	@Step("Проверить отображение правого меню")
	public void checkMenuIsVisible() {
		menuButton.should(visible);
	}
}

