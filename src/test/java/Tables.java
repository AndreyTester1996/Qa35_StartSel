import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
    WebDriver wd;

    @Test
    public void wschoolTables(){

        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows   "+ listRows.size());
        Assert.assertEquals(listRows.size(),7);

        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());

    }





}
