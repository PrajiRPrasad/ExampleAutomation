
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginLogoutFirefoxTest
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praji.Rv\\Downloads\\chromedriver_win32\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("https://plus.godigit.com/DigitPlus/#/login");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("35327650");
			oBrowser.findElement(By.name("password")).sendKeys("Digit@707$");
			oBrowser.findElement(By.xpath("/html/body/app-root/app-login/div[3]/section[1]/div/div/section/div/div/div/form/button")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	


public class Agentportaldemo {
	public static void main(String[] args) {
		LoginLogoutFirefoxTest.launchBrowser();
		LoginLogoutFirefoxTest.navigate();
		LoginLogoutFirefoxTest.login();
		//LoginLogoutFirefoxTest.minimizeFlyOutWindow();
		//LoginLogoutFirefoxTest.logout();
		LoginLogoutFirefoxTest.closeApplication();

	}
}
}
