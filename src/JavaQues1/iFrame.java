package JavaQues1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratima Sharma\\Documents\\chromedriver.exe");
   WebDriver driver =  new ChromeDriver();
 driver.get("https://www.google.com/");
 driver.findElement(By.xpath("//*[@class='gb_D gb_wc']")).click();
 
 Thread.sleep(3000);
 driver.switchTo().frame(0);
 

 driver.findElement(By.xpath("//span[@class='Rq5Gcb' and contains(text(),'News')]")).click();
                              

//a[@class='tX9u1b']//span[@class='Rq5Gcb' and contains(text(),'News')]
                             
	}

}
