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
public class Letter {
public String line;
    private String from;
    private String to;
    private String text;
    public Letter(String from, String to) {
        this.from=from;
        this.to=to;
        text="";
    }   
    public void addLine(String line){
        text=text+'\n'+line;
    }
    public String getText(){
        return ("Dear "+from+":\n"+text+"\n\nSincerely,\n\n"+to+"\n");
    }  
    
}
