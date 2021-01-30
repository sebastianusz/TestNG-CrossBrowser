// Author: Jakub Wirkus

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AppTest {

    private WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setup(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }

    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.close();
        }
    }

    @Test(priority=1)
    public void test() {
        String url = "https://www.morele.net/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
