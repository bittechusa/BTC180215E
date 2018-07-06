import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	ChromeDriver dr;
	HomePage(ChromeDriver x)
	{
		dr=x;
	}
	public void typeUserId()
	{
		 dr.findElement(By.id("email")).sendKeys("hfhf");
	}
	public void typePass()
	{
		dr.findElement(By.id("pass")).sendKeys("hghj");
	}

}
