package tic_tac_toe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GameDashBoard
{
    
          HashMap <String ,String>h=new HashMap<>();
    Scanner sc;
       String userName=null,friendName=null;
    public GameDashBoard(Scanner sc)
    {
        this.sc=sc;


    }
    public void calculateWinner(ArrayList <Integer>storedArrayList,ArrayList userChoices)
    {

        ArrayList <Integer>winner=new ArrayList<>();
        storedArrayList.sort(null);
        System.out.println(storedArrayList);
        int arr[]=new int[5];
        int i=0;
        for(int choices:storedArrayList)
        {
            arr[i]=choices;
            i++;
            
            
            
            
            

        }
        for(int k=0;k<4;k++)
        {
            System.out.println(arr[k]);
        }
        int count=1;
       for(int j=0;j<4;j++)
       {
        if((arr[j+1]-arr[j])==1)
        {
            if(count==3)
            {
                System.out.println("winner");
                break;
            }
            winner.add(arr[j]);
            

        }
        count++;
        System.out.println(winner);
       }

        

    }
    public void startGame()
    {
        
        ArrayList <Integer>horizontal=new ArrayList<>();
       
        String fetchedSymbol=null;
        //String value=h.get(userName);
        String value=null;
        int vertical_winner=0;
      
    ArrayList<Integer>userChoices=new ArrayList<>();
     ArrayList<Integer>storeduserChoices=new ArrayList<>();
    
    
           int choice=0;

          int counter=1;
          int var=1;
          while(true)
            {
                
                int val=0;
                 int count=1;
              
               
     
            for (int i=1;i<=3;i++)

{
    int horizontal_Winner1=0;
    int horizontal_Winner2=0;
    
    for (int j=1;j<=3;j++)
    {
            
      
        System.out.println("count1: "+count);
            if(storeduserChoices.contains(count))
            {
                System.out.println("coutn2:"+count);
                if(count%3==0)
                {
                    vertical_winner++;
                    System.out.println("vertical: "+vertical_winner+"count: "+count);
                }

                value=h.get(userName);
                // count++;
                System.out.println("count: "+count);
               
                
   System.out.print(" " + value + " ");
   horizontal_Winner1++;


  
            }else if(userChoices.contains(count)) 
            {
                          value=h.get(friendName);
   System.out.print(" " + value + " ");
   horizontal_Winner2++;
//    count++;


            }else 
            {
                System.out.print(" " + count + " ");  
            // count++;
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
    if(horizontal_Winner1==3||horizontal_Winner2==3)
    {
System.out.println("Yash is Winner");
    }
    
 
}
             if(counter%2==0)
            {
               
               
              

                  System.out.print("\n\nRahul your choice: ");
                
         
            try {
                choice=sc.nextInt();
                  System.err.println();
                if(choice<=9&&choice>0)
                {
                userChoices.add(choice);
                }
                else if(userChoices.contains(choice))
                    {
                        System.out.println("Already Selected");
                        userChoices.remove(choice);
                        continue;

                    }else 
                {
                    System.out.println("Invalid choice");
                    continue;
                }
                
            } catch (Exception e) {
                System.out.println("Pls enter the valid number from 1-9");
               sc.nextLine();
                continue;
            }
         
            counter++;
                      
            continue;

            }

    


 
            System.out.print("\n\nYash your choice: ");
         
            try {
                choice=sc.nextInt();
                  System.err.println();
                if(choice<=9&&choice>0)
                {
               // userChoices.add(choice);
                storeduserChoices.add(choice);
                }else if(storeduserChoices.contains(choice))
                {
                    System.out.println("Already Selecetd");
                    storeduserChoices.remove(choice);
                    continue;
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
         String value=null;
        String remaining=null;
  
         
            int symbol1=0;
     
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
            System.out.println();
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

