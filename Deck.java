/*
 * @author Gateway Instructors
 * @version 1.0
 * @name: Yoohyuk Chang
 * @Date: December 9th
 */

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

/**
 * This class represents a standard deck (52 playing cards).
 */
public class Deck extends CardCollection {

   /**
    * Create a new full standard playing card deck that contains
    * 52 cards in standard order, using the generic label "Deck".
    */
   public Deck() {
      super("Deck");
      for (int i = 1; i <= 4; i++) {
         for (int j = 1; j <= 13; j++) {
            this.cards[numFilled] = new Card(j, i);
            numFilled++;
         }
      }

   }
   
   
   /**
    * Create a new full standard playing card deck that contains
    * 52 cards in standard order, using the specified label.
    * @param label the label used to name this deck
    */
   public Deck(String label) {
      super();
      this.label = label;
      for (int i = 1; i <= 4; i++) {
         for (int j = 1; j <= 13; j++) {
            this.cards[numFilled] = new Card(j, i);
            numFilled++;
         }
      }
      
   }


   /**
    * Randomly permute the cards in this deck, leaving out nulls.
    */
   public void shuffle() {

      // Create a right-sized version of Cards array to avoid shuffling
      // in the nulls that might exist at the end of our Cards array
      Card[] rightSized = new Card[numFilled];
      System.arraycopy(this.cards, 0, rightSized, 0, numFilled);      

      List<Card> list = Arrays.asList(rightSized);
      Collections.shuffle(list);
      System.arraycopy(list.toArray(), 0, this.cards, 0, numFilled);
      
   }
   
}
