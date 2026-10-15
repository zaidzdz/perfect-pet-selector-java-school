// Made by Zaid Zamani
// 10/15/26
// Gives you your perfect pet based on a few things

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String favColor = getFavColor(scanner);
    String favSeason = getFavSeason(scanner);
    String name = getName(scanner);
    String pet = "";

    if (favColor.equals("blue")) {
      if (favSeason.equals("fall")) {
        pet = "alligator";
      } 
      else if (favSeason.equals("spring")) 
        {
        pet = "ostrich";
      }
    }
    if (favColor.equals("green")) {
      if (isConsonant(name) && favSeason.equals("winter")) {
        pet = "giraffe";
      }
       else if (!favSeason.equals("fall")) {
        pet = "dog";
      }

    }

    if (favColor.equals("red") ) {
      if (startsWithVowel(name)) {
        pet = "porcupine";
      }
      else {
        pet = "panda";
      }

    }

    if (favSeason.equals("summer") && !(pet.equals("dog") || pet.equals("panda") || pet.equals("porcupine"))) {
      pet = "pony";
    }

    if (isConsonant(name) && favColor.equals("blue") && !(favSeason.equals("summer") || favSeason.equals("fall")) && !pet.equals("ostrich")) {
      pet = "axolotl";
    }

    if (pet.isEmpty()) {
      pet = "rock";
    }

    System.out.println("-------------------------------------------");
    //wanted to tryout prinf
    System.out.printf("Your perfect pet is %s \n",pet);
    scanner.close();
  }
  public static void printNotValidError(String s){
    System.out.println("\u001B[31mEnter a valid " + s + "\u001B[0m"); //RED then RESET
  }
  public static String getFavColor(Scanner scanner) {
    System.out.println("Enter your favorite color (Either red, blue or green:)");
    String favColor = scanner.nextLine().toLowerCase();
    if (favColor.equals("red") || favColor.equals("blue") || favColor.equals("green")) {
      return favColor;
    }
    printNotValidError("color");
    return getFavColor(scanner);
  }

  public static String getFavSeason(Scanner scanner) {
    System.out.println("Enter your favorite season (winter, spring, summer, fall):");
    String favSeason = scanner.nextLine().toLowerCase();
    if (favSeason.equals("winter") || favSeason.equals("spring") || favSeason.equals("summer") || favSeason.equals("fall")) {
      return favSeason;
    }
    printNotValidError("season");
    return getFavSeason(scanner);
  }

  public static String getName(Scanner scanner) {
    System.out.println("Enter your name:");
    String name = scanner.nextLine();
    if (!name.equals("")) {
      return name;
    }
    printNotValidError("name");
    return getName(scanner);
  }

  public static boolean startsWithVowel(String name) {
    char first = Character.toLowerCase(name.charAt(0));
    return "aeiou".indexOf(first) != -1;
  }

  public static boolean isConsonant(String name) {
    char first = Character.toLowerCase(name.charAt(0));
    return "aeiou".indexOf(first) == -1;
  }
}