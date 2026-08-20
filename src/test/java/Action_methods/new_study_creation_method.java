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

            driver.findElement(Protocol_Version)
                    .sendKeys(prop.getProperty("Protocol_Version"));

            driver.findElement(Product_Name)
                    .sendKeys(prop.getProperty("Product_Name"));

            driver.findElement(CRF_Version)
                    .sendKeys(prop.getProperty("CRF_Version"));

            driver.findElement(Sponsor)
                    .sendKeys(prop.getProperty("Sponsor"));

            driver.findElement(Enter_No_of_Periods)
                            .sendKeys(prop.getProperty("Enter_No_of_Periods"));


            driver.findElement(No_of_TP)
                    .sendKeys(prop.getProperty("No_of_TP"));


            driver.findElement(No_of_Replaceable_TP)
                    .sendKeys(prop.getProperty("No_of_Replaceable_TP"));


            driver.findElement(No_of_Aliquots)
                    .sendKeys(prop.getProperty("No_of_Aliquots"));


            driver.findElement(No_of_Predoses)
                    .sendKeys(prop.getProperty("No_of_Predoses"));

            driver.findElement(No_of_Washout_Days)
                    .sendKeys(prop.getProperty("No_of_Washout_Days"));

            driver.findElement(Vitals_Window)
                    .sendKeys(prop.getProperty("Vitals_Window"));

            driver.findElement(Predose_Sample_Window)
                    .sendKeys(prop.getProperty("Predose_Sample_Window"));

//            driver.findElement(Ambulatory_Window)
//                    .sendKeys(prop.getProperty("Ambulatory_Window"));

            driver.findElement(Sample_Volume)
                    .sendKeys(prop.getProperty("Sample_Volume"));

            driver.findElement(Inter_Sample_Window)
                    .sendKeys(prop.getProperty("Inter_Sample_Window"));

            driver.findElement(Dosing_Fluid)
                    .sendKeys(prop.getProperty("Dosing_Fluid"));

            driver.findElement(Route_of_Administration)
                    .sendKeys(prop.getProperty("Route_of_Administration"));

            drop_down_no(Buffer_Volume,"number:23");

            driver.findElement(Study_Procedure_details)
                    .sendKeys(prop.getProperty("Study_Procedure_details"));

            Waits(5000);
            System.out.println("completed");


        }catch (Exception e){
            System.out.println(e);
        }


        driver .quit();






 }


    }
