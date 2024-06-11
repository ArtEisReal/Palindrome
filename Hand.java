package cardHand;

import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;
import java.util.*;

/**
 * @Author Artin Nouri, Sumru Canibek
 * 
 * @Versions 11.06.2024 #V3
 */

public class Hand {
    
    
    private Card[] cards;
    
    
    /**
     * constructor (initziliaze varargs cards in an array)
     * @param cards
     */
    public Hand(Card... cards) {
        
        if(cards != null) {
            this.cards = new Card[cards.length];
            for (int iterateThroughCards = 0; iterateThroughCards < cards.length; iterateThroughCards++) {
                this.cards [iterateThroughCards] = cards [iterateThroughCards];
            }  
        }else {
            this.cards = new Card[0];
        }
        
    }
    
    /**
     * add new cards to your already existing hand
     * @param newCards
     */
    public void add(Card... newCards) {
        Card[] addingCards = new Card[cards.length + newCards.length];
        
        for (int iterateThroughAddingCards = 0; iterateThroughAddingCards < cards.length; iterateThroughAddingCards++) {
            addingCards[iterateThroughAddingCards] = cards[iterateThroughAddingCards];
        }
        for (int iterateThroughAddingCards = 0; iterateThroughAddingCards < newCards.length; iterateThroughAddingCards++) {
            addingCards[iterateThroughAddingCards+cards.length] = newCards[iterateThroughAddingCards]; 
        }
        
        cards = addingCards;
    }
    
    /**
     * 
     * Adding new hand to your already existing hand 
     * @param newHand
     */
    public void add(Hand newHand) {
        Card[] addingHands = new Card[cards.length + newHand.cards.length];
        
        for (int iterateThroughHands = 0; iterateThroughHands < cards.length; iterateThroughHands++) {
            addingHands[iterateThroughHands] = cards[iterateThroughHands];
        }
        for (int iterateThroughHands = 0; iterateThroughHands < newHand.cards.length; iterateThroughHands++) {
            addingHands[iterateThroughHands+cards.length] = newHand.cards[iterateThroughHands]; 
        }
        
        cards = addingHands;
    }
    
    /**
     * 
     * method to check if all cards are the same suit
     * @return true or false
     */
    public boolean isSuited() {        
        boolean retval = true;
        
        for (int iterateThroughCards = 1; iterateThroughCards < cards.length; iterateThroughCards++) {
            if (cards[0].getSuit() != cards[iterateThroughCards].getSuit()) {
                retval = false;
                break;
            }
        }
        return retval;
    }
    
    /**
     * 
     * method to give existing hand 
     * 
     * @return your cards
     */
    public Card[] getHandCards() {
        
        return cards;
    }
    
    /**
     * 
     * method to hard set your hand
     * @param hardCard
     */
    public void setHandCards(Card... hardCard) {
        
        cards = hardCard;
    }
}
