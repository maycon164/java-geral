package com.app.cartas;

import com.app.cartas.model.DeckOfCard;

public class Main {

    public static void main(String[] args) {
        DeckOfCard myDeck = new DeckOfCard();
        myDeck.shuffle();

        for (int x = 1; x <= 52; x++) {
            System.out.printf("%-19s", myDeck.dealCard());

            if (x % 4 == 0)
                System.out.println();
        }
    }

}
