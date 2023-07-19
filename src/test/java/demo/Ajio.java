package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void openAjio() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.ajio.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.close();
	  Thread.sleep(1000);
	  
  }
}
