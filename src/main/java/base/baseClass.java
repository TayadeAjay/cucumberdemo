package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {

	public static WebDriver driver;
	public Properties prop;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/base/data.properties");

		// Read the file-

		prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("please choose valid browser to run your scripts");
		}

	}

	public void launchBrowser() throws IOException {

		initializeDriver();

		String url = prop.getProperty("url");
		driver.get(url);

	}

	/*
	 * public void quitBrowser() throws IOException {
	 * 
	 * driver.quit();
	 * 
	 * }
	 */

}
