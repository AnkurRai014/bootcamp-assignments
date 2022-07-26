package com.npci.mankatha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	Deck d1 = new Deck();

	public Player addPlayer(int playerNumber) {

		Player p1 = new Player();

		Scanner in = new Scanner(System.in);

		System.out.println("Player " + (playerNumber + 1) + " enter your name:");
		p1.setName(in.next());
		System.out.println("Player " + (playerNumber + 1) + " enter how much coins you have");
		p1.setCoins(in.nextInt());
		System.out.println("Player " + (playerNumber + 1) + " chose your card rank:" + "\n1 for Clubs" + "\n2 for Spades"
				+ "\n3 for Diamonds" + "\n4 for Hearts");
		int suit = in.nextInt();
		System.out.println("Player " + (playerNumber + 1) + " chose card rank from 1 to 13 where 1 is Ace and 13 is King:");
		int rank = in.nextInt();
		p1.setChosenCard(new Cards(rank, suit).toString());
		System.out.println("Player " + (playerNumber + 1) + " chose 1 for In or 2 for Out:");
		if (in.nextInt() == 1) {
			p1.setChosenOrientation("In");
		} else {
			p1.setChosenOrientation("Out");
		}

		return p1;
	}

	public void playGame() {
		Scanner in = new Scanner(System.in);
		List<Player> players = new ArrayList<>();
		System.out.println("Enter number of players:");
		int numOfPlayer = in.nextInt();

		for (int i = 0; i < numOfPlayer; i++) {
			players.add(addPlayer(i));
		}

		System.out.println(players);
		List<Cards> shuffledCards = new ArrayList<>(d1.shuffle());
		System.out.println(shuffledCards);
	}
}
