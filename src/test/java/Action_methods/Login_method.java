package Action_methods;


import base_class.Common_methods;
import org.openqa.selenium.By;

import static Locators.Login_locators.*;
import static Locators.New_syudy_creation_locators.*;

import java.util.Properties;

public  class Login_method extends Common_methods {
    static Properties prop;
    public void Login()throws Exception {
        prop = properties("D:\\OneDrive - Endpoint Data Analytics\\Sk User\\VS_code_test\\Test_Automation\\src\\test\\properties");
        open_Application("http://192.168.0.12/GAJA_eSource_2.0");
        driver.findElement(username).sendKeys(prop.getProperty("user_name"));
        driver.findElement(password).sendKeys(prop.getProperty("password"));
        driver.findElement(login).click();
        try {
            String s = driver.switchTo().alert().getText();
            if (s.describeConstable().isPresent()) {
                driver.switchTo().alert().accept();
                System.out.println("Logedin");

            } else {

                System.out.println("Logedin");
            }
        } catch (Exception Errors) {
            System.out.println(Errors);
        }

             driver.findElement(new_study).click();

    }


}
