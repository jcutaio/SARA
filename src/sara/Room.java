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
    //private static LinkedList<Equipment> equipList = new LinkedList<Equipment>(); 
    private Equipment[] equipList = new Equipment[3];
    private boolean studentReserveable;
    private static int nextID=1;
    
    public int getID(){return roomID;}
    public int getRoomCap(){return roomCapacity;}
    public boolean getStReserveable(){return studentReserveable;}
    
    public void setRoomCapacity(int roomCap){this.roomCapacity = roomCap;}
    public void setEquipment(Equipment equip1, Equipment equip2, Equipment equip3){
        //Not sure if this is the best way?
        equipList[0] = equip1;
        equipList[1] = equip2;
        equipList[2] = equip3;
        
    }
    
    public Room () {
        roomID = nextID;
        nextID++;
    }
    
    public Room (int roomCap, Equipment equip1, Equipment equip2, Equipment equip3, boolean stReserv){
        this.roomID=nextID;
        this.roomCapacity = roomCap;
        //equipList.add(equip);
        this.studentReserveable = stReserv;
        if(equip1 != null){
            equipList[0] = equip1;
        }
        if(equip2 != null){
            equipList[1] = equip2;
        }
        if(equip3 != null){
            equipList[2] = equip3;
        }
        
        nextID++;
    }
    
}
