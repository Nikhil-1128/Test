package Test.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
     	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
    		WebDriver driver=new ChromeDriver();
    		driver.get("https://www.makemytrip.com/");
    }
}
