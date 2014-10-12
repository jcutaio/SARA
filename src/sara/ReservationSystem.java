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
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeff
 */
class ReservationSystem implements Serializable{

    private static ArrayList<User> users;
    private static ArrayList<Equipment> equipment;
    public static ArrayList<Room> rooms;
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
        
        Equipment room1eq1 = new Equipment("TV");
        Equipment room1eq2 = new Equipment("Projector");
        Equipment room1eq3 = new Equipment("Whiteboard");
        Equipment room2eq1 = new Equipment("TV");
        Equipment room2eq2 = new Equipment("Projector");
        Equipment room2eq3 = new Equipment("Whiteboard");
        Equipment room3eq1 = new Equipment("TV");
        Equipment room3eq2 = new Equipment("TV 2");
        Equipment room3eq3 = new Equipment("Projector");
        Equipment room3eq4 = new Equipment("Whiteboard");
        Equipment room4eq1 = new Equipment("TV");
        Equipment room4eq2 = new Equipment("Projector");
        Equipment room4eq3 = new Equipment("Projector 2");  
        Equipment room4eq4 = new Equipment("Whiteboard");
        
        equipment.add(room1eq1);
        equipment.add(room1eq2);
        equipment.add(room1eq3);
        equipment.add(room2eq1);
        equipment.add(room2eq2);
        equipment.add(room2eq3);
        equipment.add(room3eq1);
        equipment.add(room3eq2);
        equipment.add(room3eq3);
        equipment.add(room3eq4);
        equipment.add(room4eq1);
        equipment.add(room4eq2);
        equipment.add(room4eq3);
        equipment.add(room4eq4);
        
        
        Room room1 = new Room(4, room1eq1, room1eq2, room1eq3, null, true);
        Room room2 = new Room(8, room2eq1, room2eq2, room2eq3, null, true);
        Room room3 = new Room(6, room3eq1, room3eq2, room3eq3, room3eq4, false);
        Room room4 = new Room(14, room4eq1, room4eq2, room4eq3, room4eq4, false);
        
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        
    }
    
    public static Room roomSearch(int roomID) {
        //search for room with getID from array list
        for(int i=0; i < rooms.size(); i++) {
             if(rooms.get(i).getID() == roomID) return rooms.get(i);
         }
         return null;
    }

    public static LinkedList equipmentIDSearch(Room room) {
        LinkedList<Integer> eqIDArr = new LinkedList<>();
        ArrayList<Equipment> rawEqArr = room.getEquipment();
                 for(int i=0; i < rawEqArr.size(); i++) {
                    if (rawEqArr.get(i) != null){
                     eqIDArr.add(rawEqArr.get(i).getID());}
                 }
                 return eqIDArr;
    }
    
    public static Equipment equipmentSearch(int eqID) {
         for(int i=0; i < equipment.size(); i++) {
             if(equipment.get(i).getID() == eqID) return equipment.get(i);
         }
         return null;
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
        
