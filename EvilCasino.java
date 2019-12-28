import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class EvilCasino{
  public static void main (String [] args) throws IOException{
    SlotMachine s = new SlotMachine("slot-machine.txt")'
      Scanner scan = new Scanner (System.in);
    
    System.out.println("Welcome to EvilCasino, What is your name?");
    Scanner name = new Scanner (System.in);
    System.out.println("Please place your bet");
    Scanner 
    
    String input = "";
    
    






Public class SlotMachine{
  public SlotMachine(String filename)throws IOException{
    Scanner s = new Scanner (new File(filename));
    
  }
   public double pullLever ( 
  
   public static int randomizer(){
     return (int) Math.ceil(Math.random() * 3);
   }
     
    
    
    private char smileyFace = \u263A;
    private char heart = \u2764;
    private char seven = \u0037;
    private char three = \u0033;
    private char frownFace = \u2639;
    private char diamond = \u2666;
    private char ex = \u2743;
    private char copyright = \u00A9;
    private char check = \u2713;
    private char dollar = \u0024;
    private char slot1;
    private char slot2;
    private char slot3;
    private double betAmount;
    
    
    


Public class bank{
  public bank(){
    bankBook = 100000;
    }
  
  public bank(string filename) throws IOException{
    scanner s = new Scanner (new File(filename));
    bankBook = s.nextDouble();
    }
  
  public void save (String filename) throws IOException{
    PrintWriter p = new PrintWriter(new File(filename));
    p.print(bankBook);
    p.close();
    }
    
  private double bankBook;
  }
    
    
