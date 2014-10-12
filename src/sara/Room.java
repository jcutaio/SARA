/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sara;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Nick
 */
class Room implements Serializable {
    
    private int roomID;
    private int roomCapacity;
    private ArrayList<Equipment> equipList = new ArrayList<>();
    private boolean studentReserveable;
    private static int nextID=1;
    
    public int getID(){return roomID;}
    public int getRoomCap(){return roomCapacity;}
    public boolean getStReserveable(){return studentReserveable;}
    public ArrayList getEquipment(){ return equipList;}
    
    public void setRoomCapacity(int roomCap){this.roomCapacity = roomCap;}
    public void setStudentReservable(boolean stReserv){this.studentReserveable = stReserv;}
    public void setEquipment(Equipment equip1, Equipment equip2, Equipment equip3, Equipment equip4){
        if(equip1 == null){
            equipList.add(null);
        }
        else {equipList.add(equip1);
        }
        if(equip2 == null){
            equipList.add(null);
        }
        else {equipList.add(equip2);
        }
        if(equip3 == null){
            equipList.add(null);
        }
        else {equipList.add(equip3);
        }
        if(equip4 == null){
            equipList.add(null);
        }
        else {equipList.add(equip4);
        }
    }
    
   
    
    public Room () {
        roomID = nextID;
        nextID++;
    }
    
    public Room (int roomCap, Equipment equip1, Equipment equip2, Equipment equip3, Equipment equip4, boolean stReserv){
        this.roomID=nextID;
        this.roomCapacity = roomCap;
        //equipList.add(equip);
        this.studentReserveable = stReserv;
        if(equip1 == null){
            equipList.add(null);
        }
        else {equipList.add(equip1);
        }
        if(equip2 == null){
            equipList.add(null);
        }
        else {equipList.add(equip2);
        }
        if(equip3 == null){
            equipList.add(null);
        }
        else {equipList.add(equip3);
        }
        if(equip4 == null){
            equipList.add(null);
        }
        else {equipList.add(equip4);
        }
        
        nextID++;
    }
    
    
    
}
