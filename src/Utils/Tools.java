package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActualList){

    for(int i=0; i<menuExpectedList.size();i++)
            Assert.assertEquals(menuExpectedList.get(i), menuActualList.get(i).getText(), "Karşılaştırma Sonucu");
    }

    public static void successMessageValidation()
    {
        WebElement greenWordVerify=GenelWebDriver.driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(greenWordVerify.getText().toLowerCase().contains("success"));
    }
}
