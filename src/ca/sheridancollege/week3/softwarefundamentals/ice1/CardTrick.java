/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
             Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13)+1);
            System.out.print(c.getValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[0+(int)(Math.random()*3)]);
            System.out.println(c.getSuit());
            magicHand[i]= new Card();
        }
         //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please select a cart suit: ");
        System.out.println( "1 for " + Card.SUITS[0] + " 2 for " + Card.SUITS[1] + " 3 for " + Card.SUITS[2] + " 4 for " + Card.SUITS[3]);
      
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the suit of  card you want to select: ");
        String cardSuit = input.next();
        switch (cardSuit) {
            case "1":
                cardSuit = Card.SUITS[0] ;
                break;
            case "2":
                cardSuit = Card.SUITS[1];
                break;
            case "3":
                cardSuit = Card.SUITS[2];
                break;
            case "4":
                cardSuit = Card.SUITS[3];
                break;
            default:
                break;
        }
        System.out.println("Enter the value of card between 1 and 13: ");
        int cardValue = input.nextInt();
        
        System.out.printf("Your card: \n Suit : %s \n Value: %d \n" , cardSuit , cardValue);
                // and search magicHand here            
     
                //Then report the result here
      
        for(int i = 0;  i<magicHand.length;i++){
        if( magicHand[i].getValue() == cardValue ){
            System.out.println("The Magic Hand contain your card.");
        }else{
            System.out.println("The Magic Hand does not contain your card.");
        }
        }
        
    }}

        