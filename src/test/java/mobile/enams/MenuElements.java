package mobile.enams;

public enum MenuElements {
	MAIN("Главная"),
	NEWS_DAY("Новости дня"),
	AUTHOR("Authors"),
	POLICE("Политика"),
	BUSINESS("Бизнес"),
	SOCIETY("Бизнес");

	private final String value;

	MenuElements(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
