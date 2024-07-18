package day02_driverMethodlari_WebElement_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C06_locatorsVeFindElementsMethodu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver,chrome,driver","Kurulum Dosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // test otomasyonu ana sayfasina gidin
        driver.get("https://www.testotomasyonu.com");

        // arama sayfasina "phone" yazip aratin
        driver.findElement(By.id("global-search")).sendKeys("phone" + Keys.ENTER);
        /*
            WebElement aramaKutusu = driver.findElement(By.id("global-search"));
            aramaKutusu.sendKeys("phone");
            aramaKutusu.submit();

            // 23. satir ile ayni islev
         */
        // arama sonucunda 3'den fazla urun bulunabildigini test edin

        // 1. yontem arama sonuc yazisi olan "4 product found" yazisindaki 4'u
        // sayi olarak kaydedip, 3'den buyuk oldugunu test edelim

        WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(aramaSonucElementi); // [[ChromeDriver: chrome on windows (1ea1f5a373048621220eb6c0ba682b24)] -> class name: product-count-text]
        System.out.println(aramaSonucElementi.getText()); // 4 Products Found

        String aramaSonucYazisi = aramaSonucElementi.getText(); // 4 Products Found
        aramaSonucYazisi = aramaSonucYazisi.replaceAll("\\D",""); // 4
        int actualAramaSonucYazisi = Integer.parseInt(aramaSonucYazisi); // 4
        int expectedMinSonucSayisi = 3;

        if (actualAramaSonucYazisi > expectedMinSonucSayisi){
            System.out.println("arama sonuc sayisi testi PASSED");
        }else System.out.println("arama sonuc sayisi testi FAILED");

        // 2. yontem bulunan urunleri bir liste olarak kaydedip
        // listenin size'inin 3'den buyuk oldugunu test edebiliriz




        // sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();

    }
}
