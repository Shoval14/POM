package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Tests.BaseTest.extent;
import static Tests.BaseTest.myTests;


public class SignUpTest extends BaseTest{
    static WebDriver driver;

    @Before
    public void openBrowser () {
        driver.get("https://buyme.co.il");
        driver.manage().window().maximize();
    }

@Test
public void test01_emailFiled(){

        loginPage.clickLoginSignUp();
        loginPage.clickSignUp();
        signUpPage.setEmailFiled("shoval245.com");
        signUpPage.clickEndSignup();
    String invalidEmail;
    driver.findElement(By.cssSelector("[class='parsley-type']"));
    Assert.assertEquals("pleas enter a valid email","" );




}





















        @After
        public void afterTest() {
            extent.endTest(myTests);
        }

}
