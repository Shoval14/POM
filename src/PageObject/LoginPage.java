package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
        super(driver);
    }


    //**Web Element**
    By loginSignupButton = By.cssSelector(".notSigned span");
    By signUpButton = By.cssSelector( "[class='text-link theme']");
    By emailFiled = By.cssSelector("[placeholder='מייל']");
    By passwordFiled = By.cssSelector("[placeholder='סיסמה']");
    By rememberMeChCheckBox = By.cssSelector(".ember-view.bm-checkbox.checked [class='fill']");
    By forgotPasswordButton = By.cssSelector("[class='bm-body-2 text-link theme db']");
    By facebookButton = By.cssSelector("[class='social-btn facebook']");
    By googleButton = By.cssSelector("[class='social-btn google']");

    //click sign Up
    public LoginPage clickLoginSignUp(){
        click(loginSignupButton);
        return this;}


    //click sign Up
    public LoginPage clickSignUp(){
        click(signUpButton);
        return this;}


    // write text to email
    public LoginPage setEmailFiled ( String email){
        writeText(emailFiled , email);
        return this;}


    // write text to password
    public LoginPage setPasswordFiled ( String password){
        writeText(passwordFiled , password);
        return this;}


    //Click on remember me
    public LoginPage clickRememberMe(){
        click(rememberMeChCheckBox);
        return this;}


    //Click on forget password:
    public LoginPage clickForgetPassword(){
        click(forgotPasswordButton);
        return this;}


    //Click on facebook:
    public LoginPage clickFacebook(){
        click(facebookButton);
        return this;}


    //Click on Google :
    public LoginPage clickGoogle(){
        click(googleButton);
        return this;}














}
