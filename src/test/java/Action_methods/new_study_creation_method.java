package Action_methods;


import static Locators.New_syudy_creation_locators.*;
public class new_study_creation_method extends Login_method {
    public void New_study_creation()throws Exception{

        Waits(5000);
       driver.findElement(new_study).click();
 
        driver.findElement(new_study).click();
        //   driver.findElement(new_study).click();
       
        driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement().sendKeys(prop.getProperty(""));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));
        // driver.findElement(Study_Number).sendKeys(prop.getProperty("Study_number"));




        driver .quit();






 }


    }
