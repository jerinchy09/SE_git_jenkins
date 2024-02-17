package selenium_jenkins_maven.selenium_jenkins_maven;

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
    public void selenium_webdriver()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
    }
}
