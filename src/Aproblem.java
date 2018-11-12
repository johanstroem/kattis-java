import java.util.Scanner;

public class Aproblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextInt()) {
      int n = sc.nextInt();

      if (n % 2 == 0) {
        System.out.println("Bob");
      } else {
        System.out.println("Alice");
      }
    }
  }
}
