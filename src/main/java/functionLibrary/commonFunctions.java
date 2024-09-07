package functionLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class commonFunctions {
    public static WebDriver driver;

    public void openBrowser(){

        //WebDriver driver = new ChromeDriver();
        ChromeOptions option= new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void launchCURAApp() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/ ");
        Thread.sleep(5000);
    }
    public void launchGoogle() throws InterruptedException {
        driver.get("https://www.google.com/search?q=titan+stock&oq=titan+stock&gs_lcrp=EgZjaHJvbWUqCggAEAAYsQMYgAQyCggAEAAYsQMYgAQyDQgBEAAYgwEYsQMYgAQyBwgCEAAYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEAAYgAQyBwgGEAAYgAQyBwgHEAAYgAQyBwgIEAAYgAQyBwgJEAAYgATSAQgzMDE0ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
        Thread.sleep(5000);
    }
    public void maximizeBrowser(){
        driver.manage().window().maximize();

    }
    public void waitForElement(WebElement element){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void dropDownByText(WebElement dropDownText, String text){
        Select dropDown= new Select(dropDownText);
        dropDown.selectByVisibleText(text);

    }

    public void closeBrowser(){
        driver.close();
    }

}
