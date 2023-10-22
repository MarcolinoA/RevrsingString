import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    String input; 

    System.out.println("Enter a word");
    input = scanner.nextLine();
    char data[] = new char[input.length()];

    for(int i = 0; i < input.length(); i++){
      data[i] = input.charAt(i);
    }

    for(int i = input.length() - 1; i >= 0; i--){
      System.out.print(data[i]);
    }
  }
}
