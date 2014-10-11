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

    private static ArrayList<User> users;
    private ArrayList<Equipment> equipment;
    public ArrayList<Room> rooms;
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
        
        Equipment room1eq1 = new Equipment("TV", 1);
        Equipment room1eq2 = new Equipment("Projector", 1);
        Equipment room1eq3 = new Equipment("Whiteboard", 1);
        Equipment room2eq1 = new Equipment("TV", 1);
        Equipment room2eq2 = new Equipment("Projector", 1);
        Equipment room2eq3 = new Equipment("Whiteboard", 1);
        Equipment room3eq1 = new Equipment("TV", 2);
        Equipment room3eq2 = new Equipment("Projector", 2);
        Equipment room3eq3 = new Equipment("Whiteboard", 2);
        Equipment room4eq1 = new Equipment("TV", 3);
        Equipment room4eq2 = new Equipment("Projector", 2);
        Equipment room4eq3 = new Equipment("Whiteboard", 3);     
        
        
        Room room1 = new Room(4, room1eq1, room1eq2, room1eq3, null, true);
        Room room2 = new Room(8, room2eq1, room2eq2, room2eq3, null, true);
        Room room3 = new Room(6, room3eq1, room3eq2, room3eq3, null, false);
        Room room4 = new Room(14, room4eq1, room4eq2, room4eq3, null, false);
        
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        
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
    
    public static void addUser(int userID, String name, String email, char[] pw, boolean faculty, String department)
    {
            
        User addin = new Requestor(userID, name, email, pw, faculty, department);
        users.add(addin);
    }
     public static void addAdmin(int userID, String name, String email, char[] pw, boolean faculty, int phone)
    {
       
        User addin = new Administrator(userID, name, email, pw, faculty, phone);
        users.add(addin);
        System.out.println(addin.getUserID());
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
        
