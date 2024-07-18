package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","Kurulum Dosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin
        driver.findElement(By.id("sub-btn")).click();

        //3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButonu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/button"));

        if (removeButonu.isDisplayed()){
            System.out.println("Remove butonu testi PASSED");
        }else System.out.println("Remove butonu testi FAILED");

        //4- Remove tusuna basin
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/button")).click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement yaziVarMi = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h2"));
        if (yaziVarMi.isDisplayed()){
            System.out.println("'Add/Remove Elements' testi PASSED");
        }else System.out.println("'Add/Remove Elements' testi FAILED");

        //6- sayfayi kapat
        Thread.sleep(2000);
        driver.quit();


    }
}
