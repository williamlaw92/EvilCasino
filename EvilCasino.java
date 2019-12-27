import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class EvilCasino{
  public static void main (String [] args) throws IOException{
    






Public class SlotMachine{

  



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
    
    
