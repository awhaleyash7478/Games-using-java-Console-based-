package tic_tac_toe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Gatherer.Integrator;

public class PlayWithComp
{
      HashMap<String,String>h=new HashMap<>();
        int symbol1=0;
    Scanner sc;
    public PlayWithComp(Scanner sc)
    {
        this.sc=sc;
    }
    String userName=null;
     String value=null;
    
    public void startGame()
    {
        int choice=0;
        int counter=1;
        while(true)
        {
        ArrayList<Integer>userChoices=new ArrayList<>();
        ArrayList <Integer>storeduserChoices=new ArrayList<>();
        int count=1;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if(storeduserChoices.contains(count))
                {
                     value=h.get(userName);
                      System.out.print(" " + value + " ");
                    

                }else 
                {
                    System.out.print(" " + count + " ");  

                }
                
        if (j<3)
        {
            System.out.print("|");
        }
       

        
        count++;
      
     
                
            }
            if (i<3)
    {
        System.out.println("\n---+---+---");
    }
        }
        if(counter%2==0)
        {
            Random compChoice=new Random(1-9);
            
            
        }

  
            
        
        System.out.print("\n\n"+userName+" your choice: ");
         
            try {
                choice=sc.nextInt();
                  
                if(choice<=9&&choice>0)
                {
               // userChoices.add(choice);
               
                 if(storeduserChoices.contains(choice)||userChoices.contains(choice))
                {
                    System.out.println("Already Selecetd");
                    storeduserChoices.remove(choice);
                    continue;
                }else 
                {
                     storeduserChoices.add(choice);
                }
                System.out.println("stored: "+storeduserChoices);
            }
                else 
                {
                    System.out.println("Invalid choice");
                    continue;
                }
                             counter++;
                       
              
            } catch (Exception e) {
                System.out.println("Pls enter the valid number from 1-9");
               sc.nextLine();
                continue;
            }
          
}


         
    }
    public void registerPlayer()
    {
      
        String remaining=null;
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
         h.put("Computer", remaining);
            System.out.println("\n----------------------");
            System.out.println("Name            Symbol");
            System.out.println("----------------------");
            System.out.println(userName+"               "+value);
            System.out.println("Computer"+"           "+remaining);
            System.out.println("-----------------------");
            while(true)
        {
        System.out.println("\n\n1.Ready    2.Exit");
    int choice=0;
        try {
            choice=sc.nextInt();
            System.out.println();
        } catch (Exception e) {
        System.out.println("Invalid option no.");
        sc.nextLine();
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
   