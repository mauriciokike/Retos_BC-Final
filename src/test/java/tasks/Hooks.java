package tasks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ResourceBundle;

public class Hooks {

    private static ChromeDriver driver;
    public static ResourceBundle rb = ResourceBundle.getBundle("variablesSearch");

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(rb.getString("URL"));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }

}