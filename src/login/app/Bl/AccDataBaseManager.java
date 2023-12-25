package login.app.Bl;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 */
public class AccDataBaseManager {
    // connection to data Base of your choice
    // Variables

    Connection conn = null;

    public AccDataBaseManager() throws SQLException {
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "APP");
    }

    public boolean addUser(Account acc) {
        if (acc.getFullname().isEmpty() || acc.getPassword().isBlank() || acc.getUsername().isBlank()) {
            return false;
        } else {
            try {
                PreparedStatement ps = conn.prepareStatement("INSERT INTO LogInTBL VALUES (?,?,?)");

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
    public Account logInDetails() {
        Account newAcc = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM LogInTBL");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                newAcc = new Account(rs.getString(1), rs.getString(2));

            }

        } catch (SQLException ex) {
            Logger.getLogger(AccDataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return newAcc;

    }

}
