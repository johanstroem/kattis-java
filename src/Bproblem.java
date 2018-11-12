import java.util.Scanner;

public class Bproblem {

  static String rootState = ".........";

  public static void main(String[] args) {

    int n = 0;
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();

    String[] state = new String[n];
    String[] goalStates = setAndReadGoalStates(n, sc);



    System.out.println(n);
    System.out.println(rootState);

    for (String goalState : goalStates) {
      System.out.println(goalState);
      System.out.println(rootState.equals(goalState));
    }
    System.out.println(rootState.equals("........."));

  }

  private static String[] setAndReadGoalStates(int n, Scanner sc) {
    sc.nextLine();

    String[] goalStates = new String[n];
    for (int p = 0; p < n; p++) {
      String goal = "";
      for (int i = 0; i<3; i++) {
        goal += sc.nextLine();
      }
      goalStates[p] = goal;
    }

    return goalStates;
  }
}
