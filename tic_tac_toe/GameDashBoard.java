package tic_tac_toe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
   
    public void startGame()
    {
        int draw=0;

   
        HashSet<Integer>vertical_user=new HashSet<>();
         HashSet<Integer>vertical_friend=new HashSet<>();
       
        String fetchedSymbol=null;
        //String value=h.get(userName);
        String value=null;
        int verticalWinner=0;
      
    ArrayList<Integer>userChoices=new ArrayList<>();
     ArrayList<Integer>storeduserChoices=new ArrayList<>();
    
    
           int choice=0;

          int counter=1;
          int var=1;
          while(true)
            {
                draw++;
                
                int val=0;
                 int count=1;
              
               int fetchedValue=3,fetchedValue2=3;
     int flag=0;
            for (int i=1;i<=3;i++)

{
    int horizontal_Winner1=0;
    int horizontal_Winner2=0;

    
    for (int j=1;j<=3;j++)
    {
        
      
            
      
       
            if(storeduserChoices.contains(count))
            {
              
                try
                {
                 fetchedValue=storeduserChoices.get(val++);

                
                }
                catch(Exception e)
                {
                }
                
                    if(fetchedValue%3==0)
                 {
                
                    vertical_user.add(fetchedValue);
                    
                    
                 
                  
                 } else if((storeduserChoices.contains(2)&&storeduserChoices.contains(5)&&storeduserChoices.contains(8))||(storeduserChoices.contains(1)&&storeduserChoices.contains(4)&&storeduserChoices.contains(7)))
                 {
                    flag=1;
                  

                    

                  
                 }else if ((storeduserChoices.contains(1)&&storeduserChoices.contains(5)&&storeduserChoices.contains(9))||(storeduserChoices.contains(3)&&storeduserChoices.contains(5)&&storeduserChoices.contains(7)))
                 {
                   flag=1;
                 }
                
       
                value=h.get(userName);
                            
                
   System.out.print(" " + value + " ");
   horizontal_Winner1++;


  
            }else if(userChoices.contains(count)) 
            {
                 try
                {
                   
                 fetchedValue2=userChoices.get(val++);

             }
                catch(Exception e)
                {
                }
                    if(fetchedValue2%3==0)
                 {
                
                    
                    vertical_friend.add(fetchedValue2);
                
                 }else if((userChoices.contains(2)&&userChoices.contains(5)&&userChoices.contains(8))||(userChoices.contains(1)&&userChoices.contains(4)&&userChoices.contains(7)))
                 {
                  
                  flag=2;

                    

                  
                 }else if ((userChoices.contains(1)&&userChoices.contains(5)&&userChoices.contains(9))||(userChoices.contains(3)&&userChoices.contains(5)&&userChoices.contains(7)))
                 {
                    flag=2;
                 }

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
    if(horizontal_Winner1==3)
    {
       flag=1;
    }else if(vertical_user.size()==3)
    {
    
    flag=1;   
    }else if(vertical_friend.size()==3)
    {
        flag=2;
    }else if(horizontal_Winner2==3)
    {
        flag=2;
    }
    
 
}
if(flag==1)
{
    System.out.println("\n\t\t------------------------");
    System.out.println("\t\t"+userName+" is the Winner");
       System.out.println("\n\t\t------------------------");
    return ;
    
}else if(flag==2)
{
       System.out.println("\n\t\t------------------------");
    System.out.println("\t\t"+userName+" is the Winner");
       System.out.println("\n\t\t------------------------");
return ;
}else if(draw==9)
{
    System.out.println("\n\t\t------------");
    System.out.println("\t\tGame Drawn");
    System.out.println("\t\t------------");
}
             if(counter%2==0)
            {
               
               
              

                  System.out.print("\n\n"+friendName+" your choice: ");
                
         
            try {
                choice=sc.nextInt();
                  
                if(choice<=9&&choice>0)
                {
               
                
                 if(userChoices.contains(choice)||storeduserChoices.contains(choice))
                    {
                        System.out.println("Already Selected");
                        userChoices.remove(choice);
                        continue;

                    }else 
                    {
                         userChoices.add(choice);
                    }
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
            sc.nextLine();
            continue;
        }
        if(ch==1)
        {
            registerPlayer();
        }
    }
}
    
}

