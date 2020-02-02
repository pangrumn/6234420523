/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_2;

/**
 *
 * @author nutnichaboonrod
 */
public class LetterPrinter {
    public static void main(String[] args){
       Letter letterP = new Letter("Jade","Clarissa");
       letterP.addLine("We must find Simon quickly.");
       letterP.addLine("He might be in danger.");
       System.out.print(letterP.getText());
    }
    
}
