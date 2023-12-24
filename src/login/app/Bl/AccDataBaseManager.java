package login.app.Bl;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 */
public class AccDataBaseManager {
    // connection to data Base
    // Variables

    Connection connect;
   
    
    //connect to drivers
   //    connect = getConnection("")

    public boolean addUser(Account acc) {
        if (acc.getFullname().isEmpty() || acc.getPassword().isBlank() || acc.getUsername().isBlank()) {
            return false;
        } else {
            try {
                PreparedStatement ps = connect.prepareStatement("");
            } catch (SQLException ex) {
                Logger.getLogger(AccDataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return true;
        }
    }

}
