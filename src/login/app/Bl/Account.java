package login.app.Bl;
/*
is an Object to Store corresponding Passwords and username
     OR
you might like to use a Hash Map to compare  Passwords 
*/
public class Account {
     private String username , fullname, password ;

    public Account(String username, String fullname, String password) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", fullname=" + fullname + ", password=" + password + '}';
    }
     
  
}
