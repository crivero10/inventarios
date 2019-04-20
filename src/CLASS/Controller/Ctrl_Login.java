/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASS.Controller;

import CLASS.Model.C_Session;
import static CLASS.Model.C_Session.insertSession;
import CLASS.Model.C_User;
import Utilities.Ctrl_Webcam;

/**
 *
 * @author sergiohernandez
 */
public class Ctrl_Login {
    public static C_Session login(String username, String password){
        C_User user_logged = C_User.checkUser(username, password);
        
        Ctrl_Webcam.takePicture(Ctrl_Webcam.PictureType.LOGIN);
        if(user_logged != null){
            C_Session user_session = new C_Session(user_logged);
            
            if(insertSession(user_session)){
                return user_session;
            }
        }
        
        
        return null;
    }
    
    
}
