import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a word => ");
    String word = keyboard.nextLine();
    System.out.println("The sequence is: " + convert(word));
  }

  public static String convert(String word) {
    int digit = 0;
    String sequence = "";
    for(int i = 0; i < word.length(); i++){
        switch (word.toUpperCase().charAt(i)){
            case 'A': case 'B': case 'C': digit = 2; break;
            case 'D': case 'E': case 'F': digit = 3; break;    
            case 'G': case 'H': case 'I': digit = 4; break;
            case 'J': case 'K': case 'L': digit = 5; break;
            case 'M': case 'N': case 'O': digit = 6; break;
            case 'P': case 'Q': case 'R': case 'S': digit = 7; break;
            case 'T': case 'U': case 'V': digit = 8; break;
            case 'W': case 'X': case 'Y': case 'Z': digit = 9; break;
        }
        sequence += digit + " ";
    }
    return sequence;
  }
  
 
}