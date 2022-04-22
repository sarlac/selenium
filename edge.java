
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:\\browsers\\edge\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://facebook.com");	


	}

}
