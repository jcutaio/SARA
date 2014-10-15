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
 * @author Nick
 */
class Room implements Serializable {
    
    private int roomID;
    private int roomCapacity;
    private Equipment[] equipList = new Equipment[4];
    private boolean studentReserveable;
    private static int nextID=1;
    
    public int getID(){return roomID;}
    public int getRoomCap(){return roomCapacity;}
    public boolean getStReserveable(){return studentReserveable;}
    public Equipment[] getEquipment(){ return equipList;}
    
    public void setRoomCapacity(int roomCap){this.roomCapacity = roomCap;}
    public void setStudentReservable(boolean stReserv){this.studentReserveable = stReserv;}
    public void setEquipment(Equipment equip1, Equipment equip2, Equipment equip3, Equipment equip4){
        equipList[0] = equip1;
        equipList[1] = equip2;
        equipList[2] = equip3;
        equipList[3] = equip4;
    }
    
   
    
    public Room () {
        roomID = nextID;
        nextID++;
    }
    
    public Room (int roomCap, Equipment equip1, Equipment equip2, Equipment equip3, Equipment equip4, boolean stReserv){
        this.roomID=nextID;
        this.roomCapacity = roomCap;
        this.studentReserveable = stReserv;
            equipList[0] = equip1;
            equipList[1] = equip2;
            equipList[2] = equip3;
            equipList[3] = equip4;
        nextID++;
    }
    
    public void modifyRoomEquipment(int index, String type){
        equipList[index].modifyEquipment(type);
    }
    
}
