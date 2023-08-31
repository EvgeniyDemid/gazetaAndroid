package mobile.tests;

import io.qameta.allure.Description;
import mobile.enams.MenuElements;
import mobile.pages.Footer;
import mobile.pages.MainPage;
import mobile.pages.MenuElement;
import mobile.pages.NewsDay;
import org.junit.jupiter.api.Test;

public class MainePageTests extends TestBase {
	MainPage mainPage = new MainPage();
	Footer footer = new Footer();
	NewsDay newsDay = new NewsDay();
	MenuElement menuElement = new MenuElement();

	@Test
	@Description("Проверить элементы меню")
	public void menuTest() {
		mainPage.clickMenu();
		for (MenuElements element : MenuElements.values()) {
			mainPage.checkElementMenu(element);
		}
	}

	@Test
	@Description("Проверить главный экран")
	public void checkMainPage() {
		mainPage.checkTitle();
		mainPage.checkLeftMenu();
		mainPage.checkMenuIsVisible();
	}
	@Test
	@Description("Проверить элементы футтера")
	public void checkFooter(){
		footer.checkFavorite();
		footer.checkRefresh();
		footer.checkBack();
		footer.checkShare();
		footer.checkForward();
	}
	@Test
	@Description("Переход на страницу политики")
	public void checkNewsDay(){
		mainPage.clickMenu();
		menuElement.clickNewDay();
		newsDay.checkTitle();
	}
}
