import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_launch {

	public static void main(String[] args) {
		
		//system property for IEDriver
		System.setProperty("webdriver.ie.driver","C:\\browsers\\IE\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		
		//instantiate a IEDriver class
		WebDriver driver=new InternetExplorerDriver();
		
		//launch website
		driver.get("https://www.guru99.com/");	


	}

}
