package day02;

public class Main {

   public static void main(String[] args) {
      Deck deck = new Deck();
      Card card = deck.get(5);

      System.out.printf("the fifth card is suit: %s, name: %s, value: %d\n", 
            card.getSuit(), card.getName(), card.getValue());

      System.out.println(card);
      System.out.println(deck);


      deck.shuffle(deck);



      System.out.println("");
      System.out.println("");
      System.out.println("");

      card = deck.get(5);
      System.out.printf("the fifth card is suit: %s, name: %s, value: %d\n", 
      card.getSuit(), card.getName(), card.getValue());






      

      






   }
   
}
