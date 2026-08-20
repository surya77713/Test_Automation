package base_class;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Common_methods {
  public   static   ChromeDriver driver ;
  public    static  Select s;
   public   ChromeDriver open_Application(String url){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;

   }
     public Properties properties(String path)throws Exception{
       File fis=new File(path);
         FileInputStream fiss=new FileInputStream(fis);
         Properties prop=new Properties();
         prop.load(fiss);

         return prop;



     }

    public void drop_down_no( By drop_down, String value){
        Select s=new Select(driver.findElement(drop_down));
        s.selectByValue(value);
    }

     public void Waits(int time){

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
     }


}
