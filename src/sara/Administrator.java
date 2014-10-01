/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sara;

import java.io.Serializable;

/**
 *
 * @author Jeff
 */
public class Administrator extends User implements Serializable {

    private int phoneNumber;
    
    public Administrator(int userID, String userName, String userEmail, char[] password, boolean hasFacultyPrivileges, int phoneNumber) {
        super(userID, userName, userEmail, password, hasFacultyPrivileges);
        this.phoneNumber = phoneNumber;
    }
    
}
