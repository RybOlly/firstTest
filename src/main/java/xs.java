import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xs {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.airportparkingreservations.com/lot_airport_center_lax_airport_parking_lax");

        driver.findElement(By.id("dates-component")).findElement(By.xpath("//button[@type='submit']")).click();
    }
}
