package tic_tac_toe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PlayWithFriend gameObj=new PlayWithFriend(sc);
         gameObj.dashBoard();
    //    gameObj.startGame();

    }
    
}
