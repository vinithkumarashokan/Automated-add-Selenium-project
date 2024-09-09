package addproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddGitHubproject {
	static WebDriver driver;

	@Test
	public void GitHubproject() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
//Log In
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		   driver.get("https://github.com/login");
		   WebElement UserName = driver.findElement(By.xpath("(//input[@type ='text'])[1]"));
		   UserName.sendKeys("vinithkumarashokan");
		   WebElement UserPass = driver.findElement(By.xpath("(//input[@type ='password'])"));
		   UserPass.sendKeys("uyguyhjjj");
		   WebElement Login = driver.findElement(By.xpath("//input[@type ='submit']"));
		   Login.click();
		
//Create New Repository
		   driver.findElement(By.xpath("(//span[@class='Button-label'])[2]")).click();
		   driver.findElement(By.xpath("(//span[@class='Box-sc-g0xbh4-0 jGCjmr'])[1]")).click();
		   driver.findElement(By.xpath("//input[@aria-describedby='RepoNameInput-is-available RepoNameInput-message']")).sendKeys("Automated add Selenium project");
		   driver.findElement(By.xpath("//span[text()='Create repository']")).click();
		   
//Uploading File
		   driver.findElement(By.xpath("//a[@data-ga-click='Empty repo, click, Clicked create new file link']")).click();
		   driver.findElement(By.xpath("//input[@placeholder='Name your file...']")).click();
		   WebElement Tababox = driver.findElement(By.xpath("(//div[@tabindex='0'])[4]"));
		   Tababox.sendKeys("package addproject;\r\n" + 
		   		"\r\n" + 
		   		"import java.util.concurrent.TimeUnit;\r\n" + 
		   		"\r\n" + 
		   		"import org.openqa.selenium.By;\r\n" + 
		   		"import org.openqa.selenium.WebDriver;\r\n" + 
		   		"import org.openqa.selenium.WebElement;\r\n" + 
		   		"import org.openqa.selenium.chrome.ChromeDriver;\r\n" + 
		   		"import org.testng.annotations.Test;\r\n" + 
		   		"\r\n" + 
		   		"import io.github.bonigarcia.wdm.WebDriverManager;\r\n" + 
		   		"\r\n" + 
		   		"public class AddGitHubproject {\r\n" + 
		   		"	static WebDriver driver;\r\n" + 
		   		"\r\n" + 
		   		"	@Test\r\n" + 
		   		"	public void GitHubproject() {\r\n" + 
		   		"		WebDriverManager.chromedriver().setup();\r\n" + 
		   		"		WebDriver driver =new ChromeDriver();\r\n" + 
		   		"		driver.get(\"https://github.com/login\");\r\n" + 
		   		"		driver.manage().window().maximize();\r\n" + 
		   		"//Log In\r\n" + 
		   		"		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);\r\n" + 
		   		"		   driver.get(\"https://github.com/login\");\r\n" + 
		   		"		   WebElement UserName = driver.findElement(By.xpath(\"(//input[@type ='text'])[1]\"));\r\n" + 
		   		"		   UserName.sendKeys(\"vinithkumarashokan\");\r\n" + 
		   		"		   WebElement UserPass = driver.findElement(By.xpath(\"(//input[@type ='password'])\"));\r\n" + 
		   		"		   UserPass.sendKeys(\"yugyggygh\");\r\n" + 
		   		"		   WebElement Login = driver.findElement(By.xpath(\"//input[@type ='submit']\"));\r\n" + 
		   		"		   Login.click();\r\n" + 
		   		"		\r\n" + 
		   		"//Create New Repository\r\n" + 
		   		"		   driver.findElement(By.xpath(\"(//span[@class='Button-label'])[2]\")).click();\r\n" + 
		   		"		   driver.findElement(By.xpath(\"(//span[@class='Box-sc-g0xbh4-0 jGCjmr'])[1]\")).click();\r\n" + 
		   		"		   driver.findElement(By.xpath(\"//input[@aria-describedby='RepoNameInput-is-available RepoNameInput-message']\")).sendKeys(\"Automated add Selenium project\");\r\n" + 
		   		"		   driver.findElement(By.xpath(\"//span[text()='Create repository']\")).click();\r\n" + 
		   		"		   \r\n" + 
		   		"//Uploading File\r\n" + 
		   		"		   driver.findElement(By.xpath(\"//a[@data-ga-click='Empty repo, click, Clicked create new file link']\")).click();\r\n" + 
		   		"		   driver.findElement(By.xpath(\"//input[@placeholder='Name your file...']\")).click();\r\n" + 
		   		"		   WebElement Tababox = driver.findElement(By.xpath(\"(//div[@tabindex='0'])[4]\"));\r\n" + 
		   		"		   Tababox.sendKeys(\"\");\r\n" + 
		   		"		");
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
