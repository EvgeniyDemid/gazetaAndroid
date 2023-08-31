package mobile.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import mobile.driver.AndroidLocalDriver;
import mobile.helpers.Attach;
import mobile.pages.Confirmation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
	Confirmation confirmation = new Confirmation();

	@BeforeAll
	static void beforeAll() {
		Configuration.browser = AndroidLocalDriver.class.getName();
		Configuration.browserSize = null;
		Configuration.timeout = 15000;
	}

	@BeforeEach
	void addListener() {
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
		open();
		confirmation.clickAllow();
	}

	@AfterEach
	void afterEach() {
		Attach.screenshotAs("Last screenshot");
		Attach.pageSource();
		closeWebDriver();
	}
}
