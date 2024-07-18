package day02_driverMethodlari_WebElement_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("Webdriver.chrome.driver","Kurulum Dosyalari/chromedriver.exe");
        /*
                9. satirin gorevi
                bilgisayarinizda fiziki olarak kullandigimiz chrome versiyonuna uygun
                selenium.dev sitesinden indirdigimiz ve kopya browser olusturmamizi saglayan
                chromedriver.exe dosyasini class imiza tanitmak

                Selenium 4.0.0 versiyonu ile kutuphanelerine tum guncel browserlara ait driverlari yukledi
                Boylece bir class olusturdugumuzda
                BIZ ISTERSEK, kendi driver'imizi 9. satiri kullanarak tanitabilir
                veya ISTERSEK 9. satiri atlayip Selenium'un kendi driver'larini kullanabiliriz
         */
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        driver.navigate().to("https://www.wisequarter.com");

        // 25. satir ile 23. satir islev acisindan aynidir
        Thread.sleep(2000);

        // tekrar testotomasyonuna donun (geri gel)
        driver.navigate().back();
        Thread.sleep(2000);

        // bir daha wisequarter'a gidelim (ileri git)
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayi yenile
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.quit();



    }
}
