/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamemodel;

/**
 *
 * @author mukulthemalik
 */
public abstract class WarBegins {
    
         private String playerID; //the unique ID for this player
    
    
    public WarBegins(String name)
    {
        playerID= name;
    }
    
    
    public String getPlayerID() 
    {
        return playerID;
    }

    
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    
    public abstract void play();
    
}

    

