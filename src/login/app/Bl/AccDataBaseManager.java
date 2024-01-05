package login.app.Bl;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 */
public class AccDataBaseManager {
    // connection to data Base of your choice
    // Variables
   
    Connection conn = null;

    public AccDataBaseManager() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:8080/postgres", "postgres", "123");
    }
   // ResultSet temp = conn.prepareStatement("Select * from Login_TBL").executeQuery();
   
    
    public boolean addUser(Account acc) {
        if (acc.getFullname().isEmpty() || acc.getPassword().isBlank() || acc.getUsername().isBlank()) {
            return false;
        } else {
            try {
                PreparedStatement ps = conn.prepareStatement("INSERT INTO LogIn_TBL VALUES (?,?,?)");

                ps.setString(1, acc.getUsername());
                ps.setString(2, acc.getPassword());
                ps.setString(3, acc.getFullname());

                ps.executeUpdate();

                //close
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(AccDataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }

            return true;
        }
    }

    //Log in class for connectivity
    public ArrayList<Account> logInDetails() {
        Account newAcc = null;
        ArrayList<Account> accList = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM LogIn_TBL");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                newAcc = new Account(rs.getString(1), rs.getString(2));
                accList.add(newAcc);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccDataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return accList;

    }

}
