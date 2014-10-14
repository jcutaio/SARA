/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sara;
//Comment Test
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Jeff
 */
public abstract class User implements Serializable {
    private final int userID;
    private String userName;
    private String userEmail;
    private char[] password;
    private boolean hasFacultyPrivileges;
    
    public User(int userID, String userName, String userEmail, char[] password, boolean hasFacultyPrivileges) { 
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
        this.hasFacultyPrivileges = hasFacultyPrivileges;
                
    }

    public int getUserID() {
        return userID;    
    }
    
    public String getUserName(){
    return userName;
    }
    
    public String getUserEmail(){
        return userEmail;}
    
    
    
    public boolean validatePassword(char[] password) {
        System.out.println(this.password + " " + password);
        return Arrays.equals(this.password, password);
    }

    boolean hasPriviliges() {
        return hasFacultyPrivileges;    }

    String getDepartment() {
        return null;
    }
    
    public void setPrivliges(boolean b)
    {
        hasFacultyPrivileges = b;
        
    }
    
    public void setName(String name)
    {
        this.userName = name;
    }
    
    public void setEmail(String email)
    {
        this.userEmail = email;
    }
    
    public void setPassword(char[] pw)
    {
        this.password = pw;
    }
    abstract String getPhone();
    abstract void setPhone(String ph);
 
}
