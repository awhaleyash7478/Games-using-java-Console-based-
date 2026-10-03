package tic_tac_toe;

import java.util.HashMap;
import java.util.Scanner;

public class GameDashBoard
{
    Scanner sc;
    public GameDashBoard(Scanner sc)
    {
        this.sc=sc;
//           1   |  2   |  3
// ------+-------+------
//   4   |  5   |  6
// ------+-------+------
//   7   |  8   |  9

    }
    public void startGame()
    {
        int count=1;
       
            for(int j=1;j<=3;j++)
            {
               
                 System.out.print(" " + count + "  |  " + ++count + "  |  " + ++count);
    System.out.println("\n-----+-----+-----");
               


            }
        
    }
    public void registerPlayer()
    {
         String value=null;
        String remaining=null;
        HashMap <String ,String>h=new HashMap<>();
         
            int symbol1=0;
        String userName=null,friendName=null;
        while(true)
        {
        System.out.println("\n1.Play with Friend          2.Play with Computer");
        int ch=0;
        try {
            ch=sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid option no.");
            sc.nextLine();
            continue;
        }
        if(ch==1)
        {
            System.out.print("\nYour Name:");
            userName=sc.nextLine();

            while(true)
            {
                 System.out.println("\nSymbol: 1. 'X'      2. 'O'");
          
            try {
               
                symbol1=sc.nextInt();
                sc.nextLine();
                if(symbol1==1)
                {
                    value="X";
                    remaining="O";
                  

                }else if(symbol1==2)
                {
                    value="O";
                    remaining="X";
                }else 
                {
                    System.out.println("Invalid option no.");
                    continue;
                }
                h.put(userName,value );

            } catch (Exception e) {
                System.out.println("Invalid option no.");
                continue;
            }
            break;
        }
        while(true)
        {
              System.out.print("\nFriend Name:");
            friendName=sc.nextLine();
            if(userName.equals(friendName))
            {
                System.out.println("Both Players can't have the same name");
                continue;
            }
            h.put(friendName, remaining);
            System.out.println("\n----------------------");
            System.out.println("Name            Symbol");
            System.out.println("----------------------");
            System.out.println(userName+"               "+value);
            System.out.println(friendName+"              "+remaining);
            System.out.println("-----------------------");
            break;

        }
        // while(true)
        //     {
        //     System.out.println("Symbol: 1. 'X'      2. 'O'");
        //     int symbol2=0;
        //     try {
        //         symbol2=sc.nextInt();
        //     } catch (Exception e) {
        //         System.out.println("Invalid option no.");
        //         continue;
        //     }
        //     if(symbol1==symbol2)
        //     {
        //         System.out.println("Both Players Can't use the same Symbol");
        //         continue;
        //     }
        //     break;
        // }
        while(true)
        {
        System.out.println("1.Ready    2.Exit");
        int choice=0;
        try {
            choice=sc.nextInt();
        } catch (Exception e) {
        System.out.println("Invalid option no.");
        continue;
        }
        if(choice==1)
        {
            startGame();
        }else if(choice==2)
        {
            return ;
        }else 
        {
            System.out.println("Invalid option no.");
            continue;
        }
    }

            
            
        
    }
    }
    }
    
    public void dashBoard()
    {
        System.out.println("--------Tic-Tac-Toe---------");
        while(true)
        {
        System.out.println("1.Start Game          2.Exit");
        int ch=0;
        try {
            ch=sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid option no.");
            continue;
        }
        if(ch==1)
        {
            registerPlayer();
        }
    }
}
    
}

