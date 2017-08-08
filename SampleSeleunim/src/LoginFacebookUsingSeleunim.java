import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginFacebookUsingSeleunim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/maha/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Your User Name");
		driver.findElement(By.id("pass")).sendKeys("Your Password");
		driver.findElement(By.id("u_0_t")).click();
	}

}
