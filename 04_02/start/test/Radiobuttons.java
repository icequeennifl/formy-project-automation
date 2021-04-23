import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/workspace/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(3000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(3000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(3000);

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        Thread.sleep(3000);

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();
        Thread.sleep(3000);

        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox3.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
