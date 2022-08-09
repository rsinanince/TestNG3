package Gun05;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {

    @Test
    @Parameters("mesaj")  //XML deki adı
    void ContactUs(){    //metoddaki adı

        WebElement contactUs= driver.findElement(By.linkText("Contact Us"));
        contactUs.click();

//        WebElement yourName= driver.findElement(By.id("input-name"));
//        yourName.sendKeys("sinan ince");
//
//        WebElement eMail= driver.findElement(By.id("input-email"));
//        eMail.sendKeys("deneme@deneme.com");

        WebElement enquiryArea= driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys("bir-iki-üç-dört");

        driver.manage().window().maximize();

        WebElement submitButton = driver.findElement(By.cssSelector("[value='Submit']"));
        submitButton.click();

        WebElement contactUsValidation= driver.findElement(By.cssSelector("[id='content']>h1"));
        System.out.println(contactUsValidation.getText());

        Assert.assertEquals("Contact Us",contactUsValidation.getText(),"karşılaştırma sonucu : " );

    }

}
