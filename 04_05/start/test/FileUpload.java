import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/workspace/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
/*
        WebElement chooseButton = driver.findElement(By.cssSelector("button=['btn.btn-secondary.btn-choose']"));
        chooseButton.click();
        Thread.sleep(2000);
*/
        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("file-to-upload.png");
        Thread.sleep(2000);
        driver.quit();
    }
}
