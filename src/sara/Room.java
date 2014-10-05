/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sara;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Jeff
 */
class Room implements Serializable {
    
    private int roomID;
    private int roomCapacity;
    private static LinkedList<Equipment> equipList = new LinkedList<Equipment>(); 
    private boolean studentReserveable;
    private static int nextID=1;
    
    public int getID(){return roomID;}
    public int getRoomCap(){return roomCapacity;}
    public boolean getStReserveable(){return studentReserveable;}
    
    public Room () {
        roomID = nextID;
        nextID++;
    }
    
    public Room (int roomCap, Equipment equip, boolean stReserv){
        this.roomID=nextID;
        this.roomCapacity = roomCap;
        equipList.add(equip);
        this.studentReserveable = stReserv;
        
        nextID++;
    }
    
}
