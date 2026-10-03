package tic_tac_toe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GameDashBoard gameObj=new GameDashBoard(sc);
        // gameObj.dashBoard();
        gameObj.startGame();

    }
    
}
