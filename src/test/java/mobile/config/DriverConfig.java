package mobile.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/common.properties"})
public interface DriverConfig extends Config {

	@Key("platformVersion")
	String platformVersion();

	@Key("deviceName")
	String deviceName();

	@Key("appPackage")
	String appPackage();

	@Key("appActivity")
	String appActivity();

	@Key("appiumServerUrl")
	String appiumServerUrl();

	@Key("appUrl")
	String appUrl();

	@Key("appPath")
	String appPath();
}
