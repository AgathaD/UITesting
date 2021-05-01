package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;


public class RegistrationPage {

    Webdriver driver;
    By fname =By.name("firstname");
    By lname =By.name("lastname");
    By email=By.name("email");
    By address=By.name("address1");
    By city=By.name("city");
    By region=By.name("zone_id");//dropdown
    By zipcode=By.name("postcode");
    By country=By.name("country_id");
    By login=By.name("loginname");
    By pass=By.id("AccountFrm_password");
    By conf=By.name("confirm");
    By news =By.id("AccountFrm_newsletter1");//radio check
    By agree=By.cssSelector("input#AccountFrm_agree");
    By submit = By.xpath("//*[@type='submit']");// and @title='Continue'

    //Set user name in textbox

    public void setFName(String fName){

        driver.findElement(fname).sendKeys(fName);

    }

    public void setLName(String lName){

        driver.findElement(lname).sendKeys(lName);

    }

    public void setLEmail(String mail){

        driver.findElement(email).sendKeys(mail);

    }

    public void setAddress(String addr){

        driver.findElement(address).sendKeys(addr);

    }

    public void setCity(String cty){

        driver.findElement(city).sendKeys(cty);

    }

    public void setRegion(Integer k){

        driver.findElement(region);
        Select dropdown=new Select(region);
        dropdown.selectByIndex(k);

    }

    public void setCode(String zip){
        driver.findElement(zipcode).sendKeys(zip);
    }
    public void setCountry(String ctry){
        driver.findElement(country).sendKeys(ctry);
    }
    public void setLogin(String Login){

        driver.findElement(login).sendKeys(Login);

    }
    public void setPassword(String Password){

        driver.findElement(pass).sendKeys(Password);

    }
    //Set password in password textbox

    public void setConfPassword(String PasswordConf){

        driver.findElement(conf).sendKeys(PasswordConf);

    }

    public void setNewsOK(){

        driver.findElement(news).click();

    }
    public void setPrivacy(){

        driver.findElement(agree).click(); // radio

    }
    //Click on login button

    public void clickContinue(){

        driver.findElement(submit).click(); // check-box
    }

    //Get the title of Login Page

    public String checkURL(){
        String URL = driver.getCurrentUrl();
        return URL;

    }

    public void Register(String fName,String lName, String mail,String addr,String cty,Integer k,String zip,String Login,
                         String Password,String PasswordConf){

        this.setFName(fName);
        this.setLName(lName);
        this.setLEmail(mail) ;
        this.setAddress(addr) ;
        this.setCity(cty) ;
        this.setRegion( k);
        this.setCode(zip) ;
        this.setLogin(Login) ;
        this.setPassword(Password);
        this.setConfPassword(PasswordConf);
        this.setNewsOK();
        this.setPrivacy();
        this.clickContinue();
    }

    }

