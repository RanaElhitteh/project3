import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAndCheckoutProcess {
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	
	public void Setup ( ) {
		
			
	}
	
	
	@Test
	public void Log_in () {
	driver.get("https://www.google.com");
		
		
	}
	

}
