/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kruispunt;

/**
 * @author Tiko Huizinga - s4460898
 * @author Conny Blach - s4329872
*/
public class Zone {
    private final int ID;
    private Boolean bezet;
    
    public Zone(int zoneID){
        ID = zoneID;
        
    }
    /**
     * Maakt de zone bezet zodat andere auto's weten dat ze hem niet kunnen
     * reserveren.
     */
    public synchronized void rijOp(){
        bezet = true;
        
    }
    
    /**
     * Geeft de zone weer vrij zodat andere auto's de zone kunnen reserveren.
     */
    public synchronized void rijAf(){
        bezet = false;
    }
    
    public Boolean getBezet(){
        return bezet;
    }
    
}