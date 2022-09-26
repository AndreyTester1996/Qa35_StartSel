import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){
    wd = new ChromeDriver();
    //wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
    wd.close();
    }
}
