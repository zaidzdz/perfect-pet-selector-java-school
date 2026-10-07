import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your favorite color (Either red, blue or green:)");
    String favColor = scanner.nextLine().toLowerCase(); 
    if((favColor == "red" || favColor == "blue" || favColor == "green") == false) {
      //not a valid color
      System.out.println("Enter your favorite color (Either red, blue or green:)");
    }

    scanner.close();
    
  }
  public static String getFavColor(Scanner scanner){
    System.out.println("Enter your favorite color (Either red, blue or green:)");
    String favColor = scanner.nextLine().toLowerCase(); 
    if((favColor == "red" || favColor == "blue" || favColor == "green") == false) {
      //not a valid color
      getFavColor(scanner);
      
    }else {
      return  favColor;
    }
  }
}