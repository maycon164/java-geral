package com.app.cartas.model;

import com.app.cartas.enums.Face;
import com.app.cartas.enums.Suit;

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCard {
    private Card[] deck;
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;

    private final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCard() {

        Face[] faces = {Face.ACE, Face.DEUCE, Face.THREE, Face.FOUR, Face.FIVE, Face.SIX, Face.SEVEN,
                Face.EIGHT, Face.NINE, Face.TEN, Face.JACK, Face.QUEEN, Face.KING};

        Suit[] suit = {Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS, Suit.SPADES};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13].toString(), suit[count / 13].toString());

        }
    }

    public void shuffle() {
        currentCard = 0;
        //Embaralhamento imparcial de Fisher-Yates
        int index = deck.length;
        while(index != 0){
            int aleatory = randomNumbers.nextInt(index--);
            Card temp = deck[index];
            deck[index] = deck[aleatory];
            deck[aleatory] = temp;
        }

        //Embaralhamento
        /*for (int first = 0; first < 51; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }*/
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }

    public void showCards() {
        Arrays.asList(deck).forEach(System.out::println);
    }

}
