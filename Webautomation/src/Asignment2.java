
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
class Test3
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praji.Rv\\Downloads\\chromedriver_win32\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();

		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void CreateUser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[5]/a")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);


			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Fname");
			Thread.sleep(2000);

			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Lname");
			Thread.sleep(2000);

			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("abc@gmail.com");
			Thread.sleep(2000);

			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
			Thread.sleep(2000);

			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Password");
			Thread.sleep(2000);

			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Password");
			Thread.sleep(2000);


			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);
	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void ModifyUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Praji");
			
			Thread.sleep(4000);


			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span\r\n")).click();
			Thread.sleep(4000);

			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);

			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

			       
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
 
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}




public class Asignment2 {

	public static void main(String[] args) {
		Test3.launchBrowser();
		Test3.navigate();
		Test3.login();
		Test3.minimizeFlyOutWindow();
		Test3.CreateUser();
		Test3.ModifyUser();
		Test3.deleteUser();
		Test3.logout();

	}

}
