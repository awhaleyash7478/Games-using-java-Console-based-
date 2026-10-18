package tic_tac_toe;

import java.util.*;
import java.util.stream.Gatherer.Integrator;


public class PlayWithComp
{
    HashSet<Integer>duplicateChoices=new HashSet<>();
  
      ArrayList <Integer>storedUserChoices=new ArrayList<>();
        HashSet<Integer>storedChoices=new HashSet<>();
    

      HashMap<String,String>h=new HashMap<>();
        int symbol1=0;
    Scanner sc;
     
    public PlayWithComp(Scanner sc)
    {
         
    
        this.sc=sc;
    }
    String userName=null;
     String value=null;

    public int compResponse()//ArrayList<Integer> storedUserChoices)
    {
        

        int horizontalCount=3;
    //  ArrayList <Integer>storedUserChoices=new ArrayList<>();
    //    storedUserChoices.add(3);
    //    storedUserChoices.add(4);
      // System.out.println(storedUserChoices);       
    int previousCount=0;
   
    //int max=(int)Collections.max(storedUserChoices);
    //System.out.println("max: "+max);
int count=3;
int totalHorizontalSum=6;
int sum=0;
int flag=1;
//System.out.println(storedUserChoices);

int result=0;
// if(storedUserChoices.contains(1)||storedUserChoices.contains(2)||storedUserChoices.contains(3))
// {
//     for(int choices:storedUserChoices)
//     {
     
//         storedSums.add(choices);
        
//     }
//     int first=storedSums.get(0);
//     int second=storedSums.get(1);
//     sum=first+second;
//     System.out.println("sum:"+sum);
//      result=6-sum;
//     System.out.println("result: "+result);

    
// }

for(int i=1;i<=3;i++)
{
    System.out.println("previous count: "+previousCount);
   System.out.println("i: "+i+" "+"count: "+count+"  sum:"+totalHorizontalSum);
    if(!storedUserChoices.isEmpty())
    {
        Collections.sort(storedUserChoices);
      System.out.println("sorted list: "+storedUserChoices);
        for(int ch:storedUserChoices)
        {
           System.out.println("ch: "+ch);

           
            if(ch<=count && ch>=previousCount )
            {
                 if(duplicateChoices.contains(ch))
                 {
                    System.out.println("dupicate|: "+duplicateChoices);
                    System.out.println("hey contains the duplicate hence not entered");
                    continue;
                 }else 
                 {
                    System.out.println("hey");
                       System.out.println("stored  choices: "+storedChoices);
                            storedChoices.add(ch);
                              duplicateChoices.add(ch);
   System.out.println("stored  choices: "+storedChoices);
                 }
                
                   
                //    System.out.println("stored choices: "+storedChoices);
              
                      
                   
                      
                
                    // }  

                
                //   System.out.println("duplicate list: "+duplicateChoices);
              
                // System.out.println("\n stored choices : "+storedChoices);

            }else 
            {
               // break;
               System.out.println("phirse");
               continue;
            }


        }
        System.out.println("final stored choices: "+storedChoices);
        if(storedChoices.size()>=2)
        {

        
        for(int ch:storedChoices)
        {
            sum=sum+ch;

        }
        System.out.println("sum: "+sum);
        result=totalHorizontalSum-sum;
        System.out.println("eureka it is: "+result);
        System.out.println("duplicate choices: "+duplicateChoices);
        System.out.println("stored choices: "+storedChoices);
        storedChoices.removeAll(duplicateChoices);
        System.out.println("after removal: "+storedChoices);

        break;
    }else 
    {
        System.out.println("here");
        previousCount=previousCount+3;

        totalHorizontalSum=totalHorizontalSum+9;
        count=count+3;
        continue;
    }


    }
    
    
}
return result;

    }


   

//     public int compCombination1(ArrayList comb1,ArrayList storedUserChoices)

//     {
        
//         int choice=0;
//         while(true)
//         {
//         try 
//         {
//          choice=(int)comb1.get(0);

       
//         }catch(Exception e){}
//         if(storedUserChoices.contains(choice))
//         {
//             try 
//             {
//             comb1.remove(Integer.valueOf(choice));
//             }catch(Exception e)
//             {}
//             continue;   
//         }else 

//             {
//                 break;
//             }
//     }
        
       
         
        
      
    public void startGame()
    {
    //     ArrayList <Integer>comb1=new ArrayList<>();
    //     System.out.println("hey ");
        
    //          comb1.add(1);
    //          comb1.add(7);
    //          comb1.add(9);
   
         ArrayList<Integer>compChoices=new ArrayList<>();
      
          
        
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
        // if(!storedUserChoices.isEmpty())
        // {
        //     choice=compResponse(storedUserChoices);
        //    //choice=  compResponse(storedUserChoices);
        // }
       
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
                //storedUserChoices.add(1);
                choice=compResponse();//storedUserChoices);
                System.out.println("choice: "+choice);
                compChoices.add(choice);
               // System.out.println("org: "+comb1);
               //  choice=compCombination1(comb1,storedUserChoices);
                // System.out.println("choice before add: "+choice);
                //  compChoices.add(choice);

                //  System.out.println("return back");
                //  System.out.println("choice return: "+choice);
                         

            }
            
            // Random compChoice=new Random();
            // choice=compChoice.nextInt(9)+1;
            // System.out.println("choice: "+choice);
            try 
            {
         //   comb1.remove(0);
            }catch(Exception e)
            {} 
           // System.out.println("after removal: "+comb1);
            counter++;
            System.out.println("continuing");
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
   