package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest {

    static String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        //click on the ‘Sign In’ link
        WebElement signInLink = driver.findElement(By.xpath("//li[contains(@class, 'header')]"));
        signInLink.click();

        //Verify the text ‘Welcome Back!'
        String exceptedText = "Welcome Back!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h2[contains(@class, 'page')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(actualText, exceptedText);
    }

    @Test
    public void verifyTheErrorMessage() {
        //Verify The ErrorMessage
        driver.findElement(By.xpath("//li[starts-with(@class, 'header')]")).click();

        //Enter invalid username
        driver.findElement(By.id("user[email]")).sendKeys("robin.smith@test.com");

        //Enter invalid password
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("Paper2005");

        // Click on Login button
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();


        //Set<String> windowHandles = driver.getWindowHandles();
        //windowHandles.removeAll(Collections.singleton(By.xpath("//div[starts-with(@style, 'visibility:')]")));


        //Implicit wait to solve the captcha/OTP
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Verify the error message ‘Invalid email or password.’
        String expectedErrorMessage = "Invalid email or password.";
        WebElement actualErrorMessageElement = driver.findElement(By.xpath("//div[@id=\"notice\"]/ul/li"));
        String actualErrorMessage = actualErrorMessageElement.getText();


        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}