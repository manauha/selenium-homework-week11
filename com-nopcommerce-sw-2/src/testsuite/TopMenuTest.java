package testsuite;

/*
1. userShouldNavigateToComputerPageSuccessfully
* click on the ‘Computers’ Tab
* Verify the text ‘Computers’
2. userShouldNavigateToElectronicsPageSuccessfully
* click on the ‘Electronics’ Tab
* Verify the text ‘Electronics’
3. userShouldNavigateToApparelPageSuccessfully
* click on the ‘Apparel’ Tab
* Verify the text ‘Apparel’
4. userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’
5. userShouldNavigateToBooksPageSuccessfully
* click on the ‘Books’ Tab
* Verify the text ‘Books’
6. userShouldNavigateToJewelryPageSuccessfully
* click on the ‘Jewelry’ Tab
* Verify the text ‘Jewelry’
7. userShouldNavigateToGiftCardsPageSuccessfully
* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’
*/

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        // click on the ‘Computers’ Tab
        WebElement computerLink = driver.findElement(By.linkText("Computers"));
        computerLink.click();

        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//h1"));
        String actualMessage = message.getText();

        //System.out.println(actualMessage);
        //Verify the text ‘Computers’
        Assert.assertEquals(expectedMessage, actualMessage);

        //driver.quit();

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        // click on the ‘Electronics’ Tab
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));
        electronicsLink.click();

        String expectedMsg = "Electronics";
        WebElement msg = driver.findElement(By.xpath("//h1"));
        String actualMsg = msg.getText();

        //System.out.println(actualMsg);
        //Verify the text ‘Electronics’
        Assert.assertEquals(expectedMsg, actualMsg);

        //driver.quit();

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        // click on the ‘Apparel’ Tab
        WebElement apparelLink = driver.findElement(By.linkText("Apparel"));
        apparelLink.click();

        String expectedMsg1 = "Apparel";
        WebElement msg1 = driver.findElement(By.linkText("Apparel"));
        String actualMsg1 = msg1.getText();

        //System.out.println(actualMsg1);
        //Verify the text ‘Apparel’
        Assert.assertEquals(expectedMsg1, actualMsg1);

        //driver.quit();

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        // click on the ‘Digital downloads’ Tab
        WebElement digitalDownloadLink = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadLink.click();

        String expectedMsg2 = "Digital downloads";
        WebElement msg2 = driver.findElement(By.linkText("Digital downloads"));
        String actualMsg2 = msg2.getText();

        //System.out.println(actualMsg2);
        // Verify the text ‘Digital downloads’
        Assert.assertEquals(expectedMsg2, actualMsg2);

       // driver.quit();

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        // click on the ‘Books’ Tab
        WebElement booksLink = driver.findElement(By.linkText("Books"));
        booksLink.click();

        String expectedMsg3 = "Books";
        WebElement msg3 = driver.findElement(By.linkText("Books"));
        String actualMsg3 = msg3.getText();

        //System.out.println(actualMsg3);
        // Verify the text ‘Books’
        Assert.assertEquals(expectedMsg3, actualMsg3);

        //driver.quit();

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        // click on the ‘Jewelry’ Tab
        WebElement jewelryLink = driver.findElement(By.linkText("Jewelry"));
        jewelryLink.click();

        String expectedMsg4 = "Jewelry";
        WebElement msg4 = driver.findElement(By.linkText("Jewelry"));
        String actualMsg4 = msg4.getText();

        // System.out.println(actualMsg4);
        // Verify the text ‘Jewelry’
        Assert.assertEquals(expectedMsg4, actualMsg4);

        //driver.quit();

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        //click on the ‘Gift Cards’ Tab
        WebElement giftCardsLink = driver.findElement(By.linkText("Gift Cards"));
        giftCardsLink.click();

        String expectedMsg5 = "Gift Cards";
        WebElement msg5 = driver.findElement(By.linkText("Gift Cards"));
        String actualMsg5 = msg5.getText();

        //System.out.println(actualMsg5);
        //Verify the text ‘Gift Cards’
        Assert.assertEquals(expectedMsg5, actualMsg5);

       // driver.quit();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}