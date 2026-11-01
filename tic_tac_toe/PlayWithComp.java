package tic_tac_toe;

import java.util.*;
import java.util.stream.Gatherer.Integrator;


public class PlayWithComp
{
    // HashSet<Integer>duplicateChoices=new HashSet<>();
  
      ArrayList <Integer>storedUserChoices=new ArrayList<>();
       ArrayList<Integer>compChoices=new ArrayList<>();
        HashSet<Integer>storedChoices=new HashSet<>();
    // ArrayList<Integer> duplicateAl=new ArrayList<>();
     ArrayList <Integer>failedComb=new ArrayList<>();
      ArrayList <Integer>comb1=new ArrayList<>();
      ArrayList<Integer>dupicateAl=new ArrayList<>();

      HashMap<String,String>h=new HashMap<>();
        int symbol1=0;
    Scanner sc;
    int flag=0;
    int combFlag=0;
     
    public PlayWithComp(Scanner sc)
    {
         
    
        this.sc=sc;
    }
    String userName=null;
     String value=null;
          int counter=0;
HashSet<Integer>storedResults=new HashSet<>();
    public int  compResponse()
    {
        
   
        
        

int result=0;
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


 
 


ArrayList <Integer>commonAl=new ArrayList<>();
commonAl.addAll(storedUserChoices);



commonAl.addAll(compChoices);
int count=1;
Collections.sort(storedUserChoices);
//horizontal winner logic
for(int i=0;i<3;i++)
{
    int currChoice=0;
     int prevChoice=0;
    try 
    {
prevChoice=  storedUserChoices.get(i);
    currChoice=storedUserChoices.get(i+1);
    }catch(Exception e)
    {}
    if(currChoice-prevChoice==1)
    {
        count++;


    }

}
if(count==3)
{
    System.out.println("hey you finag3 ry2gglly done it");
    flag=1;
    return result;
}

 

 ArrayList<ArrayList<Integer>>rootArrayList=new ArrayList<>();
 
 rootArrayList.add(verticalAl1);
 rootArrayList.add(horizontalAl1);
 
 rootArrayList.add(horizontalAl2);
 rootArrayList.add(horizontalAl3);

 rootArrayList.add(diagonalAl1);
 rootArrayList.add(diagonalAl2);

//   storedUserChoices.add(5);
//    storedUserChoices.add(4);
//    storedUserChoices.add(2);
//    storedUserChoices.add(7);
//    storedUserChoices.add(5);
//    storedUserChoices.add(7);


   Collections.sort(commonAl);
   System.out.println("comp:"+commonAl);
// commonAl.removeAll(failedComb);
System.out.println("hey after removing: "+commonAl);
   int i=1;
   int verticalSum1=12;
 for(ArrayList al:rootArrayList)
 {
    // System.out.println("entered in outer loop");
     System.out.println("i: "+i);
// for(int remove:duplicateAl)
// {
//     if(commonAl.contains(remove))
//     {
//         commonAl.remove(Integer.valueOf(remove));
//     }
// }
    for(int ch:commonAl)
    {
        System.out.println("ch: "+ch);
        if(al==diagonalAl1||al==diagonalAl2)
        {
         
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
    if(prevch*ch%5==0 || prevch*ch%3==0)
    {
        // diagonalAl1.add(ch);
            int sum=prevch+ch;
                
                // System.out.println("diagonal sum;'"+diagonalAlSum);
                 result=diagonalAlSum-sum;
                System.out.println("result of diagonal: "+result);
                return result;


    }
}else 
{
     diagonalAl1.add(ch);

}
    

            
                
    // }

  }
}

  //vertical response logic
    //  if(ch>=previousVerticalCount && ch<=currVerticalCount)
    //  {
    if(al==verticalAl1)
    {
        System.out.println("stored results: "+storedResults);
        if(storedResults.contains(ch))
        {
            System.out.println("result:"+ch+"hence need to continue");
            continue;
            
        }
        
           
        if(al.size()>0)
        {

           
            int previousCh=(int)al.get(0);
            int verDiff=ch-previousCh;
             System.out.println("duplicate: "+dupicateAl);
                
            if(verDiff==3 || verDiff==6)
            {
          
                if(!dupicateAl.contains(ch))
                {
                
                al.add(ch);
                }
                else  
             {
                System.out.println("dupicate duplicate");
             }
            }else 
            {
                 System.out.println("hey not adding because vertical difference:"+verDiff);
            }

        }else 
        {
             if(!dupicateAl.contains(ch))
             {
        al.add(ch);
             }else  
             {
                System.out.println("dupicate duplicate");
             }
        }
        System.out.println("vertical al: "+al);
   
   
         if(al.size()==2)
         {
            if(al.contains(2)||al.contains(5))
            {
                verticalSum1=15;
        //          int  previousVerch=(int)al.get(0);
        //  int currSum=previousVerch+ch;
        //  int verResult=verticalSum1-currSum;
        //  System.out.println("verResult: "+verResult);
        //  return;
         
            }else if(al.contains(3)||al.contains(6))
            {
                verticalSum1=18;

            }
          
           
              int  previousVerch=(int)al.get(0);
         int currSum=previousVerch+ch;
         
         result=verticalSum1-currSum;
          System.out.println("al--------------: "+verticalAl1);
     System.out.println("result-----------: "+result);
        //  System.out.println("stored user: "+storedUserChoices);
            
        //  if(storedUserChoices.contains())
        //  {
        //     System.out.println("you got is yash");
        //  }
        // if(result==1||result==4||result==7||result==8)
        // { System.out.println("result-----------: "+result);
            //   System.out.println("stored user: "+verticalAl1);
            if(commonAl.contains(result))
            {
                counter=0;
                System.out.println("hey result matches the user value");
               verticalAl1.add(result);
               if(!comb1.isEmpty())
               {
                combFlag=1;
                
            result=   compCombination1(comb1, rootArrayList);
            dupicateAl.addAll(verticalAl1);
            return  result;
               }
            
               
            //    return 0;
            }else 
            {
         verticalAl1.add(result);
         System.out.println("hey here vertical al is: "+verticalAl1);
             counter=1;
            return  result;
            }
        // }
        // if(storedUserChoices.contains(ch)&&storedUserChoices.contains(previousVerch))
        //  {
        //   counter=5;
        //  }
    
     
         if(verticalAl1.size()==3)
         {


              

        //     System.out.println("vertical:"+verticalAl1+" and user:"+storedUserChoices);
        //  for(int choice:storedUserChoices)
        //     {
        //         System.out.println("choice: "+choice);
        //     if(verticalAl1.contains(choice))
        //     {
     
                
        //         verticalAl1.remove(Integer.valueOf(choice));
        //                    duplicateAl.add(choice);
        //                    System.out.println("-------------: "+duplicateAl);
               
        //         System.out.println("saved ur ass");



        //     }
        // }
        //     if( counter==1)
        //     {
        
        //     // System.out.println("hey here it is:"+verticalAl1);
        //     // System.out.println("Winner Winner chicken dinner");
        //     flag=1;
        //  return result;  
            if(counter==0)
            {
                System.out.println("hey adding all eureka eureka:"+verticalAl1);
                // failedComb.addAll(verticalAl1);
                dupicateAl.addAll(verticalAl1);
                System.out.println("duplicate: "+dupicateAl);
                counter=2;
                // break;
                //  int previous=0;
                // int choice=1;
                // try 
                // {
                //    for(int remove:verticalAl1)
                //    {
                   
                //     if(choice==1)
                //     {
                //         previous=verticalAl1.get(0);
                //     }
                //     if(remove-previous!=3||remove-previous!=6)
                //     {
                        
                //         al.remove(Integer.valueOf(remove)); 

                        

                //     }
                //     System.out.println("arraylist after the suspected logic performed:"+al);

                    

                //    }
                // }catch(Exception e)
                // {}
                // System.out.println("hey implementing something new");
                // for(int j=0;j<3;j++)
                // {
                //     int previous=(int)al.get(j);
                //     int curr=(int)al.get(i+1);
                //     if(curr-previous!=3||curr-previous!=6)
                //     {
                //         al.remove(Integer.valueOf(curr));
                //         al.remove(I);

                //     }

                    
                // }
                // continue;
            }else if(counter==5)
            {
                       storedResults.add(result);
                System.out.println("cry baby cry");
                return  result;
            }

            if(counter!=2)
            {
                System.out.println("counter: "+counter);
                            System.out.println("hey came here here here");
            storedResults.add(result);
            return  result;
            }
        
         }
        //  System.out.println("verResult: "+verResult+"and sum: "+verticalSum1);
        
        
         }
        

        // continue;
    //  }else  
    //  {

    //     previousVerticalCount++;
    //     currVerticalCount++;
    //  }
    }


   System.out.println("out 4");
  //horizontal response logic
  if(al==horizontalAl1||al==horizontalAl2||al==horizontalAl3)
  {
        if(!duplicateChoices.contains(ch))
            {
            // System.out.println("prev: "+previousCount+" curr: "+currCount);
        if(ch>previousCount && ch<=currCount)
        {
           
            if(al.size()<2 )
            {
                // System.out.println("BEFORE ADDING CH:"+al);
            al.add(ch);
            }// }else 
            // {
            //    System.out.println("hey you have done it bro");
            //    return result;
            // }
            // if(ch%2!=0 && i>3)
            // {
            //     System.out.println("hey entered in odd condition");
            //     al.add(ch);
                
            // }
          //  System.out.println("before"+storedUserChoices);
            duplicateChoices.add(ch);
            // System.out.println("added to dupicate"+duplicateChoices);
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
                //  System.out.println("prevch:"+prevch+" currrch: "+ch);


                int sum=prevch+ch;
                //  System.out.println("horizontal sum;'"+horizontalSum1);
                result=horizontalSum1-sum;
                // System.out.println("result: "+result);
                al.add(result);
                // commonAl.remove(0);
                // commonAl.remove(1);
                
                System.out.println("result yash you are best:"+result);

             return result ;                
            }
               

            
            //  System.out.println("size: "+al.size());
            // System.out.println("out ");

        }else  
        {
            // i++;
           
            break;
            
        }
        // System.out.println("out 2");
    }
    // System.out.println("out 3");
}
       
    }
    System.out.println("gd8swfuhu9");
    if(counter==2)
{
    System.out.println("common: "+commonAl);
//   commonAl.removeAll(failedComb);
    System.out.println("after removal common: "+commonAl);
}

 

   System.out.println("after everything1: "+horizontalAl1);

   System.out.println("after eveything2: "+horizontalAl2);
   System.out.println("after everything3: "+horizontalAl3);
   System.out.println("after everything: "+diagonalAl1);
   System.out.println("after everything: "+diagonalAl2);
    i++;
      if(al==horizontalAl1||al==horizontalAl2||al==horizontalAl3)
  {
    System.out.println("inside");
    
    previousCount= previousCount+3;
           currCount=currCount+3;
        horizontalSum1=   horizontalSum1+9;
      
  }
 }
 System.out.println("hey the result is: "+result);
 return  result;
 
}




   

    public int compCombination1(ArrayList comb1,ArrayList storedUserChoices)

    {
        
        int choice=0;
        if((storedUserChoices.size()>=2 || compChoices.size()>=2)&&combFlag==0)
        {
            System.out.println("hey calling compresponse");

           
          choice=  compResponse();
          System.out.println("eureka");
            return choice;


        }
        
        System.out.println("entered");
        System.out.println("comb1:"+comb1);
        while(true)
        {
        try 
        {
            System.out.println("choice at the entered: "+comb1.get(0));
        
         choice=(int)comb1.get(0);
        

       
        }catch(Exception e){}
        if(storedUserChoices.contains(choice))
        {
            System.out.println("hey contained so nezxt");
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
       
        System.out.println("hey ");
        
             comb1.add(1);
             comb1.add(7);
             comb1.add(9);
             System.out.println(comb1);
   
        
      
          
        
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
            // if(compChoices.size()>=2)
            // {
            //     System.out.println("compchoices :"+compChoices);
            //     System.out.println("--------------------");
            //    choice= compResponse();
            // //    System.out.println("Choices: "+choice);
            // }
       
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
                // System.out.println("Choice: "+choice);
    

                compChoices.add(choice);
                // System.out.println("compchoics: "+compChoices);

                         

            }
            
            // Random compChoice=new Random();
            // choice=compChoice.nextInt(9)+1;
            // System.out.println("choice: "+choice);
            try 
            {
          comb1.remove(0);
            }catch(Exception e)
            {} 
        //   System.out.println("after removal: "+comb1);
            counter++;
            // System.out.println("continuing");
            continue;
            
            
        }

  
            if(flag==1)
            {
                System.out.println("\n**********************************");
                System.out.println("Winner Winner chicken dinner");
                 System.out.println("**********************************");
                 return ;
            
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
                combFlag=0;
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
                sc.nextLine();
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
     // compResponse();
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
   