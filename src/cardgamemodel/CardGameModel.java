/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamemodel;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mukulthemalik
 */
public class CardGameModel {
      //The group of cards, stored in an ArrayList
    private ArrayList <CardCalculate> cards;
    private int size;
    
    public CardGameModel(int givenSize)
    {
        size = givenSize;
    }
    
    
    public ArrayList<CardCalculate> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

   
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    
}
