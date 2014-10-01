/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sara;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeff
 */
class ReservationSystem implements Serializable{

    private ArrayList<User> users;
    private ArrayList<Equipment> equipment;
    private ArrayList<Room> rooms;
    private ArrayList<RoomReservation> reservations;
    
    //Custom Static Variable Declarations
    private static FileInputStream in;
    private static FileOutputStream out;
    
    public ReservationSystem() {
        users = new ArrayList<>();
        equipment = new ArrayList<>();
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
        char[] pw = {'1', '2', '3', '4', '5', '6'};
        User defaultUser = new Administrator(123456, "John Doe", "jdoe@mail.com", pw, true, 1234567890);
        users.add(defaultUser);
    }
    
    public boolean validateLoginCredentials(int loginID, char[] password) {
        User user = searchUsers(loginID);
        if(user == null) {
            return false;
        } else {
            return user.validatePassword(password);
        }
    }

    public User searchUsers(int loginID) {
        User returner = null;
        if(users != null) {
            for (User user : users) {
                if(user.getUserID() == loginID){
                returner = user;
                }
            }
        }
        return returner;
    }

    public static void save(ReservationSystem resSystem) {
            try {
                out = new FileOutputStream("resSystem.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            ObjectOutput s = null;
            try {
                s = new ObjectOutputStream(out);
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        try { 
            s.writeObject(resSystem);
        } catch (IOException ex) {
            Logger.getLogger(ReservationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
        
