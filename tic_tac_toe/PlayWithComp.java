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
     int val=0;

    public int compCombination1(ArrayList comb1)

    {
        System.out.println(comb1);
        int choice=0;
        System.out.println("val: "+val);
        try 
        {
         choice=(int)comb1.get(val);

       
        }catch(Exception e){}
        try 
        {
            System.out.println("choice: "+choice);
         comb1.remove(val);
        }catch(Exception e){}
        System.out.println("after :"+comb1);
         
        val++;

        return choice;

        

      

    }
    public void startGame()
    {
        ArrayList <Integer>comb1=new ArrayList<>();
        System.out.println("hey ");
        
             comb1.add(1);
             comb1.add(7);
             comb1.add(9);
   
         ArrayList<Integer>compChoices=new ArrayList<>();
        ArrayList <Integer>storedUserChoices=new ArrayList<>();
          
        
        int firstChance=0;
         int counter=0;
        int chance=0;
        // Random r1=new Random();
        // chance=r1.nextInt(4)+1;
        chance=2;
        System.out.println("chance: "+chance);
        if(chance%2==0)
        {
            firstChance=1;
            counter=2;
        }else 
        {
            counter=1;
        }
        int choice=0;
       
        while(true)
        {
       
        int count=1;
        // System.out.println("hey entered");
        // System.out.println("count:"+count);
        // System.out.println("compchoices: "+compChoices);
        System.out.println("\n");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if(storedUserChoices.contains(count))
                {
                    // System.out.println("storedchoices");
                     value=h.get(userName);
                      System.out.print(" " + value + " ");
                    

                }else if(compChoices.contains(count)) 
                {
                    // System.out.println("entered in  compchoices");
                    value=h.get("Computer");
                    // System.out.println("value: "+value);
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
            System.out.println("computer choice");
            if(firstChance==1)
            {
                 choice=compCombination1(comb1);
                 compChoices.add(choice);
                 //System.out.println(compChoices);
                 //System.out.println("choice return: "+choice);
                         

            }
            
            // Random compChoice=new Random();
            // choice=compChoice.nextInt(9)+1;
            // System.out.println("choice: "+choice);
             counter++;
            continue;
            
            
        }

  
            
        
        System.out.print("\n\n"+userName+" your choice: ");
         
            try {
                choice=sc.nextInt();
                  
                if(choice<=9&&choice>0)
                {
               // compChoices.add(choice);
               
                 if(storedUserChoices.contains(choice)||compChoices.contains(choice))
                {
                    System.out.println("Already Selecetd");
                    storedUserChoices.remove(choice);
                    continue;
                }else 
                {
                     storedUserChoices.add(choice);
                }
                System.out.println("stored: "+storedUserChoices);
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
   