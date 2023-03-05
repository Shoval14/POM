package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {

    public SignUpPage (WebDriver driver){
        super(driver);
    }

    //**Web Element**
    By loginButton = By.cssSelector( "[class='text-link theme']");
    By firstNameFiled = By.cssSelector("[placeholder='שם פרטי']");
    By emailFiled = By.cssSelector("[placeholder='מייל']");
    By passwordFiled = By.cssSelector("[placeholder='סיסמה']");
    By facebookButton = By.cssSelector("[class='social-btn facebook']");
    By googleButton = By.cssSelector("[class='social-btn google']");
    By agreementCheckBox = By.cssSelector("[action='register'] div:nth-of-type(5) .fill");
    By approvalCheckBox = By.cssSelector("[action='register'] div:nth-of-type(6) .fill");
    By endSignupButton = By.cssSelector("[gtm='הרשמה ל-BUYME'] .label");


    //click login
    public SignUpPage clickLogin(){
        click(loginButton);
        return this;}

    // write text to first name
    public SignUpPage setFirstNameFiled ( String firstName){
        writeText(firstNameFiled , firstName);
        return this;}

    // write text to email
    public SignUpPage setEmailFiled ( String email){
        writeText(emailFiled , email);
        return this;}

    // write text to password
    public SignUpPage setPasswordFiled ( String password){
        writeText(passwordFiled , password);
        return this;}

    //Click on facebook:
    public SignUpPage clickFacebook(){
        click(facebookButton);
        return this;}

    //Click on Google :
    public SignUpPage clickGoogle(){
        click(googleButton);
        return this;}

    //Click on agreement Check Box
    public SignUpPage clickAgreementCheckBox(){
        click(agreementCheckBox);
        return this;}

    //Click on approval Check Box
    public SignUpPage clickApprovalCheckBox(){
        click(approvalCheckBox);
        return this;}

    //Click on
    public SignUpPage clickEndSignup(){
        click(endSignupButton);
        return this;}






}
