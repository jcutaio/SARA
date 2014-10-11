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
 * @author Lazaro
 */
class Equipment implements Serializable {

    //Drop down for only TV, Projector, ??
    private String equipmentType;
    private int equipmentQuant;
    private int equipmentID;
    private String damageDesc;
    private boolean equipmentDamaged;
    
    private static int nextID=1;
    
    public String getType(){return equipmentType;}
    public int getID(){return equipmentID;}
    public boolean getDamaged(){return equipmentDamaged;}
    public int getQuant(){return equipmentQuant;}
    
    public void setID(int equipmentID){this.equipmentID = equipmentID;}
    public void setQuant (int equipmentQuant) {this.equipmentQuant = equipmentQuant;}
    
    public Equipment () {
        equipmentID = nextID++;
    }
    public Equipment(String equipmentType, int equipmentQuant) { 
        this.equipmentType = equipmentType;
        this.equipmentQuant = equipmentQuant;
        this.equipmentDamaged = false;
        this.damageDesc = null;
        this.equipmentID = nextID++;
    }
    
    public void reportDamage(String damageDesc){
        this.damageDesc = damageDesc;
        this.equipmentDamaged = true;
    }
    
    public void repair() {
        //take values from reporter gui
        this.damageDesc = null;
        this.equipmentDamaged = false;
    
    }
    
}
