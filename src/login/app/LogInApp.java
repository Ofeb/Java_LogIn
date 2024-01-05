package login.app;

import java.sql.SQLException;
import java.util.ArrayList;
import login.app.Bl.AccDataBaseManager;
import login.app.Bl.Account;

public class LogInApp {
    public static void main(String[] args) throws SQLException {

  //new GUIFrame();
        AccDataBaseManager manager = new AccDataBaseManager();
        
        ArrayList<Account> details = manager.logInDetails();
        for (Account detail : details) {
             System.out.println(detail);
        }
       
    }
    
}
