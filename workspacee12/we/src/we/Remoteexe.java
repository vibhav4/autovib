package we;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remoteexe {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
//		Selenium selenium = new DefaultSelenium(�localhost�, 4444, �*firefox�, �http://www.google.com�);
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/vibhavsharma/Downloads/chromedriver_win32 (1)/chromedriver.exe");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setBrowserName("chrome");
	    
		
	    
	    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		
	    driver.get("http://www.google.com");
	    
//	    driver.quit();

	}

}
