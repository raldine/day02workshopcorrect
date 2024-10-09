package day02;

import java.security.SecureRandom;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Deck {

   public static final String[] SUIT = { 
      "Diamond", "Spade", "Hearts", "Clubs" 
   };
   public static final String[] NAMES = {
      "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
      "Nine", "Ten", "Jack", "Queen", "King"
   };
   public static final int[] VALUES = {
      1, 2, 3, 4, 5, 6, 7, 8,
      9, 10, 10, 10, 10
   };

   // protected Card[] cards;

   protected List<Card> cardsList = new ArrayList<>();

   public Deck() {
      for (int s = 0; s < SUIT.length; s++) {
         String suit = SUIT[s];
         for (int n = 0; n < NAMES.length; n++) {
            String name = NAMES[n];
            int value = VALUES[n];

            Card card = new Card(suit, name, value);
            cardsList.add(card);
         }
      }
   }

   public Card get(int i){
      return cardsList.get(i);

   }

   // public Deck() {
   //    int idx = 0;
   //    cards = new Card[52];
   //    for (int s = 0; s < SUIT.length; s++) {
   //       String suit = SUIT[s];
   //       for (int n = 0; n < NAMES.length; n++) {
   //          String name = NAMES[n];
   //          int value = VALUES[n];

   //          Card card = new Card(suit, name, value);
   //          cards[idx] = card;
   //          idx++;
   //       }
   //    }
   // }


   

   @Override
   public String toString() {
      return "Number of cards: %d".formatted(cardsList.size());
   }

   //shuffle method
   public void shuffle(Deck deck){

      Random rand = new SecureRandom();

      for(int i = 0; i < cardsList.size(); i++ ){
         int j = rand.nextInt(cardsList.size());

         Card temp1 = cardsList.get(i);
         // System.out.println("i got " + temp1);
         // System.out.println("");
         Card temp2 = cardsList.get(j);
         // System.out.println("going to swap " + temp1 + " with " + temp2);
         // System.out.println("");

         cardsList.set(i, temp2);
         // System.out.println("now card i is " + cards[i]);
         // System.out.println("");
         cardsList.set(j, temp1);
         // System.out.println("now card j is " + cards[j]);
         System.out.println("");  
         System.out.println("");
         System.out.println("shuffling....");
         
         
      }

   }

   
}
