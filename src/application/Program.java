package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		System.out.println("This is almost working already /s\n");

		ChessMatch match = new ChessMatch();
		
		UI.printBoard(match.getPieces());

	}

}
