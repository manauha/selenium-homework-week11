package testsuite;

/*
Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’
2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration completed’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class RegisterTest extends BaseTest {

    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public  void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //find Register link and verify that user should navigate successfully
       // driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.linkText("Register")).click();

        String expectedMessage = "Register";
        WebElement actualMsg = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualMessage = actualMsg.getText();

        //Verify the Register
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){

        //find Register link and verify that user should navigate successfully
        driver.findElement(By.linkText("Register")).click();

        //User should select one radio button
        driver.findElement(By.xpath("//input[@id='gender-male']"));

        //Enter first name
        driver.findElement(By.name("FirstName")).sendKeys("Robin");

        //Enter value in last name filed
        driver.findElement(By.id("LastName")).sendKeys("Smith");

        //Select date of birth
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("03");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2005");

        //Enter email in Email field
        final String randomEmail = randomEmail();
        driver.findElement(By.id("Email")).sendKeys(randomEmail);

        //Enter password and confirm password
        driver.findElement(By.name("Password")).sendKeys("Paper2005");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Paper2005");

        //user should click Register button
        driver.findElement(By.id("register-button")).click();

        String expectedMessage = "Your registration completed";
        WebElement message = driver.findElement(By.className("result"));
        String actualMessage = message.getText();
        System.out.println(actualMessage);

        //Verify the text  Your registration completed
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    public static String randomEmail(){

        return "random-" + UUID.randomUUID().toString() + "@test.com";
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
