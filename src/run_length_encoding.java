package src;

/* Letter Counter 
The program return the first word with the greatest number of repeated letters */

import java.util.*;

class LetterFunc {
    
    String LetterCounter(String str) {
        String[] list = str.split(" ");
        String word = list[0]; 
        int count1 = 0;
        int count2 = 0;

        for(int i=0; list.length>i; i++){
            for (int j=0; list[i].length()>j; j++){
                count2 = 0;
                for(int k = 0; k < list[i].length(); k++) {
                    if(list[i].charAt(j) == list[i].charAt(k)) {
                        count2++;
                    }
                    if(count1 < count2) {
                        count1 = count2;
                        word = list[i];
                        count2 = 0;
                    }
                }
            }
            if(count1 == 1){
                return "-1";
            }
            
    
        } 
        str = word;
        return str;
    }
    public static void main (String[] args) {     
        try (Scanner s = new Scanner(System.in)) {
            LetterFunc c = new LetterFunc();
            System.out.print(c.LetterCounter(s.nextLine()));
        }  
      }  

}