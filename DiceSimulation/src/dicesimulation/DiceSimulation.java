/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicesimulation;

/**
 * represents the simulation of dice
 * @author Meeth
 * @version 1
 */
public class DiceSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        RollDice d= new RollDice();// d ithe reference for object of type RollDice
        d.input();// calls input
        d.trials();// calls method trials
        d.display();// calls method display
    }
    
}
