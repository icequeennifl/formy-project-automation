import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/workspace/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();
        Thread.sleep(2000);

        WebElement dropdownMenuOptions1 = driver.findElement(By.id("autocomplete"));
        dropdownMenuOptions1.click();
        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.id("logo"));
        logo.click();
        Thread.sleep(2000);

        WebElement dropDownPage = driver.findElement(By.linkText("Dropdown"));
        dropDownPage.click();
        Thread.sleep(3000);

        WebElement dropdownMenu1 = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu1.click();

        WebElement dropdownMenuOptions2 = driver.findElement(By.linkText("Modal"));
        dropdownMenuOptions2.click();
        Thread.sleep(2000);

        driver.quit();

    }
}
