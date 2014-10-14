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
class RoomReservation implements Serializable {
    private String timeSlot;
    private Room room;
    private User user;
    
    public RoomReservation(String timeSlot, Room room, User user){
        this.timeSlot = timeSlot;
        this.room = room;
        this.user = user;
        if (this.user != null) { System.out.println("res created with user"); }
    }
    
    public String getTimeSlot() {
        return timeSlot;
    }
    
    public User getUser() { 
        if (user != null) { System.out.println("res has user"); }
        return user;
        
    }
    
    public Room getRoom() { 
        return room;
    }
}
    
