package Test_Ng;

import Action_methods.Login_method;
import Action_methods.new_study_creation_method;
import org.testng.annotations.Test;



public class  Tests {
    @Test
  public   void Forlogin()throws Exception{
        Login_method Act=new Login_method();
        Act.Login();

    }

    @Test
    public void new_study()throws Exception{
        new_study_creation_method create_study = new new_study_creation_method();
       create_study.New_study_creation();
    }
}
