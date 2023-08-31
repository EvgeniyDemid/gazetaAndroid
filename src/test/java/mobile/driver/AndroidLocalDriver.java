package mobile.driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;
import static io.appium.java_client.remote.MobilePlatform.ANDROID;
import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class AndroidLocalDriver implements WebDriverProvider {
	@Nonnull
	@Override
	public WebDriver createDriver(@Nonnull Capabilities capabilities) {
		UiAutomator2Options options = new UiAutomator2Options();
		options.merge(capabilities);

		options.setAutomationName(ANDROID_UIAUTOMATOR2)
				.setPlatformName(ANDROID)
				.setPlatformVersion("14.0")
				.setDeviceName("Pixel 3 XL API 34")
				.setApp(getAppPath())
				.setAppPackage("ru.ideast.gazeta")
				.setAppActivity("ru.ideast.gazeta.MainActivity");

		return new AndroidDriver(getAppiumServerUrl(), options);
	}

	public static URL getAppiumServerUrl() {
		try {
			return new URL("http://localhost:4723/wd/hub");
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	private String getAppPath() {
		String appUrl = "https://d.apkpure.com/b/APK/ru.ideast.gazeta?version=latest";
		String appPath = "src/test/resources/Gazeta.Ru_3.4.2_Apkpure.apk";

		File app = new File(appPath);
		if (!app.exists()) {
			try (InputStream in = new URL(appUrl).openStream()) {
				copyInputStreamToFile(in, app);
			} catch (IOException e) {
				throw new AssertionError("Failed to download application", e);
			}
		}
		return app.getAbsolutePath();
	}
}
