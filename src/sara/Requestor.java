/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sara;

import java.io.Serializable;

/**
 *
 * @author Casey
 */
public class Requestor extends User implements Serializable {
    
    private String department; 
    
    public Requestor(int userID, String userName, String userEmail, char[] password, boolean hasFacultyPrivileges, String department) {
        super(userID, userName, userEmail, password, hasFacultyPrivileges);
        
        this.department = department; 
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public String getPhone()
    {
        return null;
    }
    
    public void setPhone(String ph)
    {
    }
    
    
}
