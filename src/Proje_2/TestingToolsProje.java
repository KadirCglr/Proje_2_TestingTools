package Proje_2;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TestingToolsProje extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demowebshop.tricentis.com/");
        Actions aksiyonlar = new Actions(driver);


        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Action aksiyon = aksiyonlar.moveToElement(register).click().build();
        MyFunc.Bekle(1);
        aksiyon.perform();

        WebElement element = driver.findElement(By.id("gender-male"));
        Action aksiyon1 = aksiyonlar.moveToElement(element).click().build();
        MyFunc.Bekle(1);
        aksiyon1.perform();

        WebElement firtsName = driver.findElement(By.id("FirstName"));
        Action aksiyon2 = aksiyonlar.moveToElement(firtsName).click().sendKeys("Kadir").build();
        MyFunc.Bekle(1);
        aksiyon2.perform();

        WebElement lastsName = driver.findElement(By.id("LastName"));
        Action aksiyon3 = aksiyonlar.moveToElement(lastsName).click().sendKeys("Caglar").build();
        MyFunc.Bekle(1);
        aksiyon3.perform();

        WebElement Email = driver.findElement(By.id("Email"));
        Action aksiyon4 = aksiyonlar.moveToElement(Email).click().sendKeys("kcaglar23@gmail.com").build();
        MyFunc.Bekle(1);
        aksiyon4.perform();

        WebElement password = driver.findElement(By.id("Password"));
        Action aksiyon5 = aksiyonlar.moveToElement(password).click().sendKeys("Abc12345").build();
        MyFunc.Bekle(1);
        aksiyon5.perform();

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        Action aksiyon6 = aksiyonlar.moveToElement(confirmPassword).click().sendKeys("Abc12345").build();
        MyFunc.Bekle(1);
        aksiyon6.perform();

        WebElement register2 = driver.findElement(By.id("register-button"));
        Action aksiyon7 = aksiyonlar.moveToElement(register2).click().build();
        MyFunc.Bekle(1);
        aksiyon7.perform();

        MyFunc.Bekle(1);
        WebElement dogrulama = driver.findElement(By.xpath("//div[@class='result']"));

        MyFunc.Bekle(1);
        Assert.assertTrue(dogrulama.getText().contains("Your registration completed"));


    }

    @Test
    public void Test2() {

        Actions aksiyonlar = new Actions(driver);

        WebElement logOut = driver.findElement(By.xpath("//a[@href='/logout']"));
        Action aksiyon8 = aksiyonlar.moveToElement(logOut).click().build();
        MyFunc.Bekle(1);
        aksiyon8.perform();


        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Action aksiyon = aksiyonlar.moveToElement(register).click().build();
        MyFunc.Bekle(1);
        aksiyon.perform();

        WebElement element = driver.findElement(By.id("gender-male"));
        Action aksiyon1 = aksiyonlar.moveToElement(element).click().build();
        MyFunc.Bekle(1);
        aksiyon1.perform();

        WebElement firtsName = driver.findElement(By.id("FirstName"));
        Action aksiyon2 = aksiyonlar.moveToElement(firtsName).click().sendKeys("Kadir").build();
        MyFunc.Bekle(1);
        aksiyon2.perform();

        WebElement lastsName = driver.findElement(By.id("LastName"));
        Action aksiyon3 = aksiyonlar.moveToElement(lastsName).click().sendKeys("Caglar").build();
        MyFunc.Bekle(1);
        aksiyon3.perform();

        WebElement Email = driver.findElement(By.id("Email"));
        Action aksiyon4 = aksiyonlar.moveToElement(Email).click().sendKeys("kcaglar23@gmail.com").build();
        MyFunc.Bekle(1);
        aksiyon4.perform();

        WebElement password = driver.findElement(By.id("Password"));
        Action aksiyon5 = aksiyonlar.moveToElement(password).click().sendKeys("Abc12345").build();
        MyFunc.Bekle(1);
        aksiyon5.perform();

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        Action aksiyon6 = aksiyonlar.moveToElement(confirmPassword).click().sendKeys("Abc12345").build();
        MyFunc.Bekle(1);
        aksiyon6.perform();

        WebElement register2 = driver.findElement(By.id("register-button"));
        Action aksiyon7 = aksiyonlar.moveToElement(register2).click().build();
        MyFunc.Bekle(1);
        aksiyon7.perform();

        MyFunc.Bekle(1);
        WebElement dogrulama2 = driver.findElement(By.xpath("//div[@class='validation-summary-errors']//li"));
        MyFunc.Bekle(1);
        Assert.assertTrue(dogrulama2.getText().contains("The specified email already exists"));


    }

    @Test
    public void Test3() {
        driver.get("https://demowebshop.tricentis.com/");

        Actions aksiyonlar = new Actions(driver);

        WebElement logIn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        Action aksiyon = aksiyonlar.moveToElement(logIn).click().build();
        MyFunc.Bekle(1);
        aksiyon.perform();

        WebElement Email = driver.findElement(By.id("Email"));
        Action aksiyon1 = aksiyonlar.moveToElement(Email).click().sendKeys("kcaglar23@gmail.com").build();
        MyFunc.Bekle(1);
        aksiyon1.perform();

        WebElement password = driver.findElement(By.id("Password"));
        Action aksiyon2 = aksiyonlar.moveToElement(password).click().sendKeys("Abc12345").build();
        MyFunc.Bekle(1);
        aksiyon2.perform();

        WebElement logIn1 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Action aksiyon3 = aksiyonlar.moveToElement(logIn1).click().build();
        MyFunc.Bekle(1);
        aksiyon3.perform();

        MyFunc.Bekle(1);
        WebElement dogrulama3 = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
        MyFunc.Bekle(1);
        Assert.assertTrue(dogrulama3.getText().contains("Welcome to our store"));

    }

    @Test
    public void Test4() {
        driver.get("https://demowebshop.tricentis.com/");

        Actions aksiyonlar = new Actions(driver);

        WebElement logOut = driver.findElement(By.xpath("//a[@href='/logout']"));
        Action aksiyon8 = aksiyonlar.moveToElement(logOut).click().build();
        MyFunc.Bekle(1);
        aksiyon8.perform();

        WebElement logIn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        Action aksiyon = aksiyonlar.moveToElement(logIn).click().build();
        MyFunc.Bekle(1);
        aksiyon.perform();

        WebElement Email = driver.findElement(By.id("Email"));
        Action aksiyon1 = aksiyonlar.moveToElement(Email).click().sendKeys("kcaglar123@gmail.com").build();
        MyFunc.Bekle(1);
        aksiyon1.perform();

        WebElement password = driver.findElement(By.id("Password"));
        Action aksiyon2 = aksiyonlar.moveToElement(password).click().sendKeys("123456").build();
        MyFunc.Bekle(1);
        aksiyon2.perform();

        WebElement logIn1 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Action aksiyon3 = aksiyonlar.moveToElement(logIn1).click().build();
        MyFunc.Bekle(1);
        aksiyon3.perform();

        MyFunc.Bekle(1);
        WebElement dogrulama3 = driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span"));
        MyFunc.Bekle(1);
        Assert.assertTrue(dogrulama3.getText().contains("Login was unsuccessful. Please correct the errors and try again."));

    }

    @Test
    public void Test5() {
        driver.get("https://demowebshop.tricentis.com/");

        Actions aksiyonlar = new Actions(driver);

        WebElement logIn = driver.findElement(By.xpath("//a[@class='ico-login']"));
        Action aksiyon = aksiyonlar.moveToElement(logIn).click().build();
        MyFunc.Bekle(1);
        aksiyon.perform();

        WebElement Email = driver.findElement(By.id("Email"));
        Action aksiyon1 = aksiyonlar.moveToElement(Email).click().sendKeys("kcaglar23@gmail.com").build();
        MyFunc.Bekle(1);
        aksiyon1.perform();

        WebElement password = driver.findElement(By.id("Password"));
        Action aksiyon2 = aksiyonlar.moveToElement(password).click().sendKeys("Abc12345").build();
        MyFunc.Bekle(1);
        aksiyon2.perform();

        WebElement logIn1 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Action aksiyon3 = aksiyonlar.moveToElement(logIn1).click().build();
        MyFunc.Bekle(1);
        aksiyon3.perform();

        WebElement computer= driver.findElement(By.xpath("//a[@href='/computers']"));
        WebElement notebook= driver.findElement(By.xpath("//a[@href='/notebooks']"));

        aksiyonlar.moveToElement(computer).build().perform();
        MyFunc.Bekle(1);

        aksiyonlar.moveToElement(notebook).click().build().perform();
        MyFunc.Bekle(1);

        WebElement addToCart = driver.findElement(By.xpath("//input[@value='Add to cart']"));
        Action aksiyon4 = aksiyonlar.moveToElement(addToCart).click().build();
        MyFunc.Bekle(1);
        aksiyon4.perform();

        MyFunc.Bekle(1);
        WebElement dogrulama4 = driver.findElement(By.xpath("//p[@class='content']"));
        MyFunc.Bekle(1);
        Assert.assertTrue(dogrulama4.getText().contains("The product has been added to your shopping cart"));

        WebElement shoppinCart= driver.findElement(By.xpath("//span[@class='cart-label']"));
        Action aksiyon5 = aksiyonlar.moveToElement(shoppinCart).click().build();
        MyFunc.Bekle(1);
        aksiyon5.perform();

        MyFunc.Bekle(1);
        WebElement dogrulama5 = driver.findElement(By.xpath("//a[@class='product-name']"));
        MyFunc.Bekle(1);
        Assert.assertTrue(dogrulama5.getText().contains("14.1-inch Laptop"));

        WebElement agree= driver.findElement(By.id("termsofservice"));
        Action aksiyon6 = aksiyonlar.moveToElement(agree).click().build();
        MyFunc.Bekle(1);
        aksiyon6.perform();

        WebElement checkout= driver.findElement(By.id("checkout"));
        Action aksiyon7 = aksiyonlar.moveToElement(checkout).click().build();
        MyFunc.Bekle(1);
        aksiyon7.perform();

        WebElement company= driver.findElement(By.id("BillingNewAddress_Company"));
        Action aksiyon8 = aksiyonlar.moveToElement(company).click().sendKeys("Techno").build();
        MyFunc.Bekle(1);
        aksiyon8.perform();

        WebElement ulke=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select day= new Select(ulke);
        day.selectByVisibleText("Turkey");

        WebElement city= driver.findElement(By.id("BillingNewAddress_City"));
        Action aksiyon9 = aksiyonlar.moveToElement(city).click().sendKeys("Samsun").build();
        MyFunc.Bekle(1);
        aksiyon9.perform();

        WebElement adress= driver.findElement(By.id("BillingNewAddress_Address1"));
        Action aksiyon10 = aksiyonlar.moveToElement(adress).click().sendKeys("SamsunCanik").build();
        MyFunc.Bekle(1);
        aksiyon10.perform();

        WebElement adress2= driver.findElement(By.id("BillingNewAddress_Address2"));
        Action aksiyon11 = aksiyonlar.moveToElement(adress2).click().sendKeys("SamsunCanik1").build();
        MyFunc.Bekle(1);
        aksiyon11.perform();

        WebElement zipCode= driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Action aksiyon12 = aksiyonlar.moveToElement(zipCode).click().sendKeys("55400").build();
        MyFunc.Bekle(1);
        aksiyon12.perform();

        WebElement phone= driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Action aksiyon13 = aksiyonlar.moveToElement(phone).click().sendKeys("1234567892").build();
        MyFunc.Bekle(1);
        aksiyon13.perform();

        WebElement faxNo= driver.findElement(By.id("BillingNewAddress_FaxNumber"));
        Action aksiyon14 = aksiyonlar.moveToElement(faxNo).click().sendKeys("0546874585").build();
        MyFunc.Bekle(1);
        aksiyon14.perform();

        WebElement continuee= driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button']"));
        Action aksiyon15 = aksiyonlar.moveToElement(continuee).click().build();
        MyFunc.Bekle(2);
        aksiyon15.perform();
        MyFunc.Bekle(2);


        WebElement continuee2= driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        Action aksiyon16 = aksiyonlar.moveToElement(continuee2).click().build();
        MyFunc.Bekle(2);
        aksiyon16.perform();

        WebElement continuee3= driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']"));
        Action aksiyon17 = aksiyonlar.moveToElement(continuee3).click().build();
        MyFunc.Bekle(1);
        aksiyon17.perform();

        WebElement continuee4= driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        Action aksiyon18 = aksiyonlar.moveToElement(continuee4).click().build();
        MyFunc.Bekle(1);
        aksiyon18.perform();

        WebElement continuee5= driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
        Action aksiyon19 = aksiyonlar.moveToElement(continuee5).click().build();
        MyFunc.Bekle(1);
        aksiyon19.perform();

        WebElement confirm= driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']"));
        Action aksiyon20 = aksiyonlar.moveToElement(confirm).click().build();
        MyFunc.Bekle(1);
        aksiyon20.perform();

        MyFunc.Bekle(1);
        WebElement dogrulama3 = driver.findElement(By.xpath("//div[@class='title']/strong"));
        MyFunc.Bekle(1);
        Assert.assertTrue(dogrulama3.getText().contains("Your order has been successfully processed!"));

        BekleKapat();


    }
}