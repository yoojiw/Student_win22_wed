/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_win22_wed;

import java.util.Scanner;

/**
 *
 * @author irene
 */
public class Student_win22_wed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        
        for(int i = 0; i < myWord.length; i++){
            System.out.print(myWord[i]);
        }
        
        //print in reverse 
        for(int i = myWord.length - 1; i >= 0; i--){
            System.out.println(myWord[i]);
            
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        System.out.println("this line is added");
        String word = sc.nextLine(); 
        

        char[] myLetters = new char[word.length()];
        
        //문장을 한 문자씩 배열에 입력하기, 출력하기 
        for(int i = 0; i < myLetters.length; i++){
            myLetters[i] = word.charAt(i);
            System.out.print(myLetters[i]);
        }
        
        
        
        
        
                
        
    }
    
}
