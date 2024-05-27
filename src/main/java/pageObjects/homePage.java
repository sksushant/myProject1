package pageObjects;
import functionLibrary.commonFunctions;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class homePage extends commonFunctions{
    public homePage(){PageFactory.initElements(driver,this);}


    public void appointmentClick() throws InterruptedException {
        driver.findElement(By.id("btn-make-appointment")).click();
        Thread.sleep(8000);
    }
    public void loginPageValidation() throws InterruptedException {
        String captureText1= driver.findElement(By.xpath("//p[@class='lead']")).getText();
        System.out.println(captureText1);
        Assert.assertEquals(captureText1, "Please login to make appointment.");
        Thread.sleep(2000);
    }
    public void homePageValidation() throws InterruptedException {
        waitForElement(driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']")));
        String captureText2= driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']")).getText();
        System.out.println(captureText2);
        Assert.assertEquals(captureText2, "Make Appointment");
        Thread.sleep(5000);
    }
    public void enterAppointmentDetails() throws InterruptedException {
        //facility field
        WebElement facilityDropDown = driver.findElement(By.id("combo_facility"));
        Select dropDown= new Select(facilityDropDown);
        //dropDown.selectByVisibleText("Hongkong CURA Healthcare Center");
        //dropDown.selectByValue("Seoul CURA Healthcare Center");
        dropDown.selectByIndex(1);
        Thread.sleep(5000);

        //Apply for hospital readmission
        driver.findElement(By.id("chk_hospotal_readmission")).click();
        Thread.sleep(5000);

        //Health Care Program
        driver.findElement(By.id("radio_program_medicaid")).click();
        Thread.sleep(5000);

        //Visit Date
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-calendar']")).click();
        //driver.findElement(By.xpath("//div[@class='input-group-addon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[@class='day'])[15]")).click();

        //Comment
        driver.findElement(By.id("txt_comment")).sendKeys("Test comment");

        //Book Appointment button
        driver.findElement(By.id("btn-book-appointment")).click();

    }
    public void validateAppointmentConfirmation(){
        String captureText3= driver.findElement(By.xpath("//h2[text()='Appointment Confirmation']")).getText();
        System.out.println(captureText3);
        Assert.assertEquals(captureText3, "Appointment Confirmation");
    }
    public void logOut(){
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }






}
