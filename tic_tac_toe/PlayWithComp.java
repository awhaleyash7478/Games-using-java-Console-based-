package tic_tac_toe;

import java.util.*;
import java.util.stream.Gatherer.Integrator;


public class PlayWithComp
{
    // HashSet<Integer>duplicateChoices=new HashSet<>();
  
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

    public void compResponse()//ArrayList<Integer> storedUserChoices)
    {
        
        

//         int horizontalCount=3;
//   ArrayList <Integer>storedUserChoices=new ArrayList<>();
//     //    storedUserChoices.add(3);
//     //    storedUserChoices.add(4);
//       // System.out.println(storedUserChoices);       
//     int previousCount=0;
   
//     //int max=(int)Collections.max(storedUserChoices);
//     //System.out.println("max: "+max);
// int count=3;
// int totalHorizontalSum=6;
// int sum=0;
// int flag=0;
// //System.out.println(storedUserChoices);

// int result=0;
// // if(storedUserChoices.contains(1)||storedUserChoices.contains(2)||storedUserChoices.contains(3))
// // {
// //     for(int choices:storedUserChoices)
// //     {
     
// //         storedSums.add(choices);
        
// //     }
// //     int first=storedSums.get(0);
// //     int second=storedSums.get(1);
// //     sum=first+second;
// //     System.out.println("sum:"+sum);
// //      result=6-sum;
// //     System.out.println("result: "+result);

    
// // }
// String alName=null;
// ArrayList <Integer>horizontalAl1=new ArrayList<>();
// ArrayList <Integer>horizontalAl2=new ArrayList<>();
// ArrayList <Integer>horizontalAl3=new ArrayList<>();


// horizontalAl1.addAll(storedUserChoices);
// System.out.println("dummmy: "+horizontalAl1);

// for(int i=1;i<=3;i++)
// {
   
//     // if(!storedUserChoices.isEmpty())
//    if(!storedUserChoices.isEmpty())
//     {
//         Collections.sort(storedUserChoices);
//         System.out.println("user choices: "+storedUserChoices);
     
//         // for(int ch:storedUserChoices)
//         // {
//         for(int ch:storedUserChoices)
//         {
//             System.out.println("ch:"+ch);      
//             System.out.println("count: "+count);     
//             if(ch<=count)
//             {
//                 if(horizontalAl1.size()==2)
//                 {
//                     flag=1;
//                     alName="horizontalAl1";
//                     break;

//                 }
//                 horizontalAl1.add(ch);
//                 System.out.println("horizontal1: "+horizontalAl1);
//             }else if(ch>=previousCount && ch<=count)
//             {
//                      if(horizontalAl2.size()==2)
//                 {
//                     flag=2;
                     
//                     alName="horizontalAl2";
//                     break;

//                 }
//                 horizontalAl2.add(ch);
//                  System.out.println("horizontal1: "+horizontalAl2);
                
//             }else if(ch>=previousCount && ch<=count) 
//             {
//                      if(horizontalAl3.size()==2)
//                 {
//                     alName="horizontalAl3";
//                     flag=3;
//                     break;

//                 }
//                 horizontalAl3.add(ch);
//                  System.out.println("horizontal1: "+horizontalAl3);

//             }
//             else 
//             {
//                // break;
         
//                System.out.println("going again up for i: "+i+" and count: "+count);
//                continue;
//             }
//             // if(ch<=count && ch>=previousCount )
//             // {
//             //     //  if(duplicateChoices.contains(ch))
//             //     //  {
//             //     //     System.out.println("duplicate spoted: "+ch);
                  
//             //     //     continue;
//             //     //  }else 
//             //     //  {
//             //     //     System.out.println("entered in else");
                    
//                             storedChoices.add(ch);
//                             //   duplicateChoices.add(ch);
//                 //               System.out.println("stored choices: "+storedChoices);
   
//                 //  }
                
                   
//                 //    System.out.println("stored choices: "+storedChoices);
              
                      
                   
                      
                
//                     // }  

                
//                 //   System.out.println("duplicate list: "+duplicateChoices);
              
//                 // System.out.println("\n stored choices : "+storedChoices);

            


//         }
    
        

// int previousch=0;
// if(flag==1)
// {
    





        
//         for(int ch:)
//         {
            
//             System.out.println("ch to be removed: "+ch);
//             if(previousch==0)
//             {
//             previousch=ch;
//             System.out.println("previous ch: "+previousch);
//         continue;    
//         }else if(ch-previousch==1)
//         {
//             System.out.println("minus: "+(ch-previousch));
            
        

//             sum=sum+ch+previousch;
//             System.out.println("sum: "+sum);
//             try 
//             {
//                horizontalAl1.remove(Integer.valueOf(ch));
//             }catch(Exception e)
//             {}
//                System.out.println("dummy after removal: "+horizontalAl1);

//         }
//     }
//         result=totalHorizontalSum-sum;
     
//         System.out.println("result:"+result);
//         // storedChoices.removeAll(duplicateChoices);

//         break;
//     }else 
//     {
//         previousCount=previousCount+3;

//         totalHorizontalSum=totalHorizontalSum+9;
//         count=count+3;
//         continue;
//     }


//     }
    
    
// }
// return result;
int previousCount=0;
int horizontalSum1=6;
int currCount=3;
int previousVerticalCount=1;
int currVerticalCount=7;
ArrayList<Integer> duplicateChoices=new ArrayList<>();
    
ArrayList <Integer>horizontalAl1=new ArrayList<>();
 ArrayList <Integer>horizontalAl2=new ArrayList<>();
 ArrayList <Integer>horizontalAl3=new ArrayList<>();

 ArrayList <Integer>diagonalAl1=new ArrayList<>();
 ArrayList <Integer>diagonalAl2=new ArrayList<>();
 ArrayList<Integer>verticalAl1=new ArrayList<>();

 
 



 

 ArrayList<ArrayList<Integer>>rootArrayList=new ArrayList<>();
 rootArrayList.add(verticalAl1);
//  rootArrayList.add(horizontalAl1);
 
//  rootArrayList.add(horizontalAl2);
//  rootArrayList.add(horizontalAl3);

//  rootArrayList.add(diagonalAl1);
//  rootArrayList.add(diagonalAl2);

//   storedUserChoices.add(5);
//    storedUserChoices.add(4);
//    storedUserChoices.add(2);
//    storedUserChoices.add(7);
   storedUserChoices.add(3);
   storedUserChoices.add(5);


   Collections.sort(storedUserChoices);
   System.out.println(storedUserChoices);
   int i=1;
   int verticalSum1=15;
 for(ArrayList al:rootArrayList)
 {
    // System.out.println("entered in outer loop");
     System.out.println("i: "+i);

    for(int ch:storedUserChoices)
    {
        // System.out.println("ch: "+ch);
  if(ch%2!=0)
  {
   
    // if(diagonalAl1.size()==2)
    // {
        // System.out.println("enterd in cond");
        //         System.out.println(diagonalAl1);
        
        //         System.out.println("prevch:"+prevch+" currrch: "+ch);
        
        //diagonal response logic
        int diagonalAlSum=15;
        if(diagonalAl1.size()>0)
            {
    int prevch=(int)diagonalAl1.get(0);
    if(prevch*ch%5==0)
    {
        // diagonalAl1.add(ch);
            int sum=prevch+ch;
                
                // System.out.println("diagonal sum;'"+diagonalAlSum);
                int result=diagonalAlSum-sum;
                System.out.println("result of diagonal: "+result);
                return;


    }
}else 
{
     diagonalAl1.add(ch);

}
    

            
                
    // }

  }

  //vertical response logic
    //  if(ch>=previousVerticalCount && ch<=currVerticalCount)
    //  {
        al.add(ch);
        System.out.println("vertical al: "+al);
   
   
         if(al.size()==2)
         {
            if(al.contains(2)||al.contains(5))
            {
                verticalSum1=15;
         
            }else if(al.contains(3)||al.contains(6))
            {
                verticalSum1=18;

            }
         int  previousVerch=(int)al.get(0);
         int currSum=previousVerch+ch;
         int verResult=verticalSum1-currSum;
         System.out.println("verResult: "+verResult);
         return;
         }
        

        // continue;
    //  }else  
    //  {

    //     previousVerticalCount++;
    //     currVerticalCount++;
    //  }



  System.out.println("out 4");
  //horizontal response logic
  if(al==horizontalAl1||al==horizontalAl2||al==horizontalAl3)
  {
        if(!duplicateChoices.contains(ch))
            {
            System.out.println("prev: "+previousCount+" curr: "+currCount);
        if(ch>previousCount && ch<=currCount)
        {
           
            if(al.size()<2 )
            {
                // System.out.println("BEFORE ADDING CH:"+al);
            al.add(ch);
            // if(ch%2!=0 && i>3)
            // {
            //     System.out.println("hey entered in odd condition");
            //     al.add(ch);
                
            // }
          //  System.out.println("before"+storedUserChoices);
            duplicateChoices.add(ch);
            System.out.println("added to dupicate"+duplicateChoices);
            // try 
            // {

            // storedUserChoices.remove(Integer.valueOf(ch));
            // }catch(Exception e)
            // {}
            // System.out.println("duplicate:"+duplicateChoices);
            
            // System.out.println("AFTER ADDING CH:"+al);
            if(al.size()==2)
            {
            //  System.out.println("enterd in cond");
                // System.out.println(al);
                int prevch=(int)al.get(0);
                // System.out.println("prevch:"+prevch+" currrch: "+ch);


                int sum=prevch+ch;
                // System.out.println("horizontal sum;'"+horizontalSum1);
                int result=horizontalSum1-sum;
                System.out.println("result: "+result);
               return ;
                // break;
            }
               

            }
            //  System.out.println("size: "+al.size());
            System.out.println("out ");

        }else  
        {
            // i++;
           
            break;
        }
        System.out.println("out 2");
    }
    System.out.println("out 3");
}
       
    }

 

   System.out.println("after everything1: "+horizontalAl1);
   System.out.println("after eveything2: "+horizontalAl2);
   System.out.println("after everything3: "+horizontalAl3);
   System.out.println("after everything: "+diagonalAl1);
   System.out.println("after everything: "+diagonalAl2);
    i++;
    previousCount= previousCount+3;
           currCount=currCount+3;
        horizontalSum1=   horizontalSum1+9;
      
   
 }
 
}




   

    public int compCombination1(ArrayList comb1,ArrayList storedUserChoices)

    {
        
        int choice=0;
        if(storedUserChoices.size()>=2)
        {
            System.out.println("hey calling compresponse");
           
            compResponse();
            return choice;


        }
        
        System.out.println("entered");
        System.out.println(comb1);
        while(true)
        {
        try 
        {
            System.out.println("choice at the entered: "+comb1.get(0));
         choice=(int)comb1.get(0);

       
        }catch(Exception e){}
        if(storedUserChoices.contains(choice))
        {
            try 
            {
            comb1.remove(Integer.valueOf(choice));
            }catch(Exception e)
            {}
            continue;   
        }else 

            {
                break;
            }
    }
    return choice;
}
        
       
         
        
      
    public void startGame()
    {
        ArrayList <Integer>comb1=new ArrayList<>();
        System.out.println("hey ");
        
             comb1.add(1);
             comb1.add(7);
             comb1.add(9);
             System.out.println(comb1);
   
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

              choice=compCombination1(comb1,storedUserChoices);
               // choice=compResponse();
                System.out.println("choice: "+choice);
                compChoices.add(choice);

                         

            }
            
            // Random compChoice=new Random();
            // choice=compChoice.nextInt(9)+1;
            // System.out.println("choice: "+choice);
            try 
            {
          comb1.remove(0);
            }catch(Exception e)
            {} 
          System.out.println("after removal: "+comb1);
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
      compResponse();
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
   