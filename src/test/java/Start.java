import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){
    wd = new ChromeDriver();
    //wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
    WebElement element = wd.findElement(By.tagName("h1"));
    element.click();
    List<WebElement> list = wd.findElements(By.tagName("h1"));
    WebElement element1 = list.get(1);
    element1.click();

    wd.findElement(By.id("root"));
    wd.findElement(By.className("container"));




    wd.close();
    }
}
