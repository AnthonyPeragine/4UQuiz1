/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivequiz;

/**
 *
 * @author peraa0837
 */
public class RecursiveQuiz {

    
    public String reverseString(String word){
        //base case
        if(word.length() == 0 || word.length() == 1){
            return word;
        }else{
            //takes the word  minus the first character and places it at the end of the word
            //recurses recurses the smaller substring :)))))
            return reverseString(word.substring(1)) + word.charAt(0);
           
            
           // System.out.println(first);
           // System.out.println(second);
           // System.out.println(middle);
           // System.out.println(reverse);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RecursiveQuiz test = new RecursiveQuiz();
        
        String word = "small";
        System.out.println("BEFORE:");
        System.out.println(word);
        String answer = test.reverseString(word);
        System.out.println("AFTER:");
        System.out.println(answer);
    }
}
