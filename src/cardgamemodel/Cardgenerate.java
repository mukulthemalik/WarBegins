/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamemodel;

import java.util.ArrayList;

/**
 *
 * @author mukulthemalik
 */
public abstract class Cardgenerate {
  
    private final String gameName;
    private ArrayList <WarBegins> players;
    
    public Cardgenerate(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    
    public String getGameName() 
    {
        return gameName;
    }
    

    public ArrayList <WarBegins> getWarBegins() 
    {
        return players;
    }

   
    public void setWarBegins(ArrayList <WarBegins> players) 
    {
        this.players = players;
    }
    
    
    public abstract void play();
 
    public abstract void declareWinner();

   
    
}


