package mobile.tests;

import mobile.enams.MenuElements;
import mobile.component.Footer;
import mobile.pages.MainPage;
import mobile.component.MenuElement;
import mobile.pages.NewsDayPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainePageTests extends TestBase {

	private final MainPage mainPage = new MainPage();
	private final Footer footer = new Footer();
	private final NewsDayPage newsDayPage = new NewsDayPage();
	private final MenuElement menuElement = new MenuElement();

	@Test
	@DisplayName("Проверить элементы главного меню")
	public void checkElementMenu() {
		mainPage.clickMenu();
		for (MenuElements element : MenuElements.values()) {
			mainPage.checkElementMenu(element);
		}
	}

	@Test
	@DisplayName("Проверить главный экран")
	public void checkMainPage() {
		mainPage.checkTitle();
		mainPage.checkLeftMenu();
		mainPage.checkMenuIsVisible();
	}

	@Test
	@DisplayName("Проверить элементы футтера")
	public void checkFooter() {
		footer.checkFavorite();
		footer.checkRefresh();
		footer.checkBack();
		footer.checkShare();
		footer.checkForward();
	}

	@Test
	@DisplayName("Переход на страницу политики")
	public void checkNewsDay() {
		mainPage.clickMenu();
		menuElement.clickNewDay();
		newsDayPage.checkTitle();
	}
}
