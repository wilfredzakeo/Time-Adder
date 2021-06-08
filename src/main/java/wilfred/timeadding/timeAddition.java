
package wilfred.timeadding;

import java.util.Arrays;


public class timeAddition {
  
      
      public static void main (String[]args)  {
      
        
          timeAdder(5,"days",25,"hours");
          
         }
    
    public static void timeAdder (int value1, String label1, int value2, String label2){
    
        String[] Labels_Plural =   {"seconds", "minutes",  "hours",  "days"};  
        String[] Labels_Singular = {"second",   "minute",  "hour",    "day"}; 
        int[] seconds           =  {   1,          60,      3600,     86400};
   
        //convert value to seconds
       int value1_seconds;
       int value2_seconds;
       int index;
       if(value1 == 1) {
       index = Arrays.asList(Labels_Singular).indexOf(label1);
       value1_seconds = seconds [index];
       }
       else { index = Arrays.asList(Labels_Plural).indexOf(label1);
       value1_seconds = seconds[index] * value1;
               }
       
       if(value2 == 1) {
       index = Arrays.asList(Labels_Singular).indexOf(label2);
       value2_seconds = seconds [index];
       }
       else { index = Arrays.asList(Labels_Plural).indexOf(label2);
       value2_seconds = seconds[index] * value2;
               }
       // add both time values and get total in seconds
       int totalSeconds = value1_seconds + value2_seconds;
       
             
       //Determine final value and final label
       String finalLabel = "";
       int finalValue = 0;
       
       switch (totalSeconds) {
           
           case 1 : 
               //second
               finalLabel = Labels_Singular[0];
               finalValue = 1;
           break;
           case 60 :
               //minute
               finalLabel = Labels_Singular[1];
               finalValue = 1;
           break;
           case 3600 : 
               //hour
               finalLabel = Labels_Singular[2];
               finalValue = 1;
           break;
           case 86400 : 
               //day
               finalLabel = Labels_Singular[3];
               finalValue = 1;
           break;
           default:
                    if(totalSeconds > seconds[3] && totalSeconds % seconds[3] == 0) {
                    //Days
                    finalLabel = Labels_Plural [3];
                    finalValue = totalSeconds / seconds[3];
                    }
                    else if(totalSeconds > seconds[2] && totalSeconds % seconds [2] ==0) {
                    //Hours
                    finalLabel = Labels_Plural [2];
                    finalValue = totalSeconds / seconds [2];
                    }
                    else if (totalSeconds > seconds [1] && totalSeconds % seconds [1] ==0) {
                    //Minutes
                    finalLabel = Labels_Plural[1];
                    finalValue = totalSeconds / seconds[1];
                    }
                    else {
                    //Seconds
                    finalLabel = Labels_Plural [0];
                    finalValue = totalSeconds;
          
                    }
    
       System.out.println(finalValue + " " + finalLabel);
    }
    
    }

    }

    
    
    
    
