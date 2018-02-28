import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = initChromeDriver();
        webDriver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        Thread.sleep(2000);

        WebElement fieldLogin = webDriver.findElement(By.id("email"));
        WebElement fieldPasswort = webDriver.findElement(By.id("passwd"));
        WebElement buttonEnter = webDriver.findElement(By.name("submitLogin"));
        fieldLogin.sendKeys("webinar.test@gmail.com");
        fieldPasswort.sendKeys("Xcg7299bnSmMuRLp9ITw");
        Thread.sleep(2000);
        buttonEnter.click();
        Thread.sleep(3000);

        WebElement buttonUser = webDriver.findElement(By.cssSelector(".employee_avatar_small"));
        buttonUser.click();
        Thread.sleep(3000);
        WebElement buttonExit = webDriver.findElement(By.id("header_logout"));
        buttonExit.click();

        Thread.sleep(5000);
        webDriver.quit();

    }

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
