import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTTest {
	ChromeDriver dr;
	public HomePage openBrowser()
	{
		System.out.println("just for git class");
		System.out.println("oni bai");
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.get("http://www.facebook.com");
		return new HomePage(dr);
	}

}
