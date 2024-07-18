package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // Her actigimiz class'da ilk isimiz WebDriver objesi olusturmak olmalidir

        System.setProperty("webdriver.chrome.driver","Kurulum Dosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle()); // Test Otomasyonu - Test Otomasyonu

        System.out.println(driver.getCurrentUrl()); // https://www.testotomasyonu.com/

        System.out.println(driver.getPageSource()); // HTML sayfanin tum kaynak kodlarini getirir

        System.out.println(driver.getWindowHandle()); // D8F9B86E43C6BC0A0A6A6A3DC5937E04 // 27F2DF14DE2D1C986DCEFED4C58C47F9
        // Selenium WebDriver actigi her browser icin benzersiz bir handle degeri uretir
        // Eger testimiz calisirken driver objesi ile birden fazla window acildi ise
        // bu windowlar arasinda gecisi windowHandle degerleri ile yapabiliriz

        System.out.println(driver.getWindowHandles()); // [7252C1A6E8706FD12CD97298755C39D1]
        // Eger driver birden fazla window acti ise
        // acik olan tum window'larin windowHandleDegerlerini bize verir


        Thread.sleep(3000);
        driver.quit();

    }
}
