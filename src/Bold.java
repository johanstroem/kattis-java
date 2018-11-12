//import java.util.Scanner;
//
//public class Bold {
//  static String rootState = ".........";
//
//  public static void main(String[] args) {
//
//    int n = 0;
//    Scanner sc = new Scanner(System.in);
//
//    n = sc.nextInt(); // Should outer loop n times..
//    String[] goalStates = readGoalStates(n, sc);
//
//    String[] state = new String[9];
////    String[][] nextState = new String[9][9];
//
//    for (int p = 0; p < n; p++) {
//
//      boolean solutionFound = false;
//      int iteration = 1;
//      // Initialize state
//      for (int i=0; i<state.length; i++) {
//        state[i] = rootState;
//      }
//
////      getFirstLevel(state, goalStates[p], 1); // Iterate once through rootState
//
//      System.out.println("Initial state");
//
//      for (String s: state) {
//        System.out.println(s);
//      }
//
////      iteration++;
//
//      getNextLevel(state, goalStates[p], iteration);
//
////      for (String s: state) {
////        System.out.println(s);
////      }
//
////      while (solutionFound) {
//////        for (String s: state) {
//////          System.out.println(s);
//////        }
////        for (int i=0; i<9; i++) {
////          int[] indices = getPositions(i);
////          StringBuilder s = new StringBuilder(state[i]);
////
////          state[i] = s.toString();
////
////          for (int j: indices) {
////            s.setCharAt(j, flip(s.charAt(j)));
////          }
////          state[i] = s.toString();
////
//////          System.out.println('p');
////          System.out.println(state[i]);
////          if (state[i].equals(goalStates[p])){
////            System.out.println("EXPECTED OUTPUT:"); // SHOULD BE REMOVED
////            System.out.println(iteration);
////            solutionFound = true;
////            break;
////          }
////        }
////        System.out.println("Iteration: " + iteration);
////        if (iteration > 2 ) break;
//////        state = nextState;
////        iteration++;
////      }
//    }
//
////    // Tests.....
////    System.out.println(flip('.')); // should print *
////    System.out.println(flip('*')); // should print .
////
//////    for (String s: state) {
//////      System.out.println(s);
//////    }
////
////    for (int i : getPositions((0))) {
////      System.out.print(i);
////    } // should return 0, 1, 3
////    System.out.println();
////
////    for (int i : getPositions((2))) {
////      System.out.print(i);
////    } // should return 1, 2, 5
////    System.out.println();
////
////    for (int i : getPositions((4))) {
////      System.out.print(i);
////    }  // should return 1, 3, 4, 5, 7
////    System.out.println();
////
////    for (int i : getPositions((5))) {
////      System.out.print(i);
////    }  // should return 2, 4, 5, 8
////    System.out.println();
////
////
////    for (String s: nextState) {
////      System.out.println(s);
////    }
////
////    System.out.println(n);
////    System.out.println(rootState);
////
////    for (String goalState : goalStates) {
////      System.out.println(goalState);
////      System.out.println(rootState.equals(goalState));
////    }
////    System.out.println(rootState.equals("........."));
//
//  }
//
//  private static void getFirstLevel(String[] initialState, final String goalState, int iteration) {
//    iterate(initialState, goalState, iteration);
//  }
//
//  private static void getNextLevel(String[] state, final String goalState, int iteration) {
////    String[][] nextState = new String[9][9];
//
//    String[] nextState = new String[9];
//    // Initialize state
////    for (int i=0; i<9; i++) {
////      nextState[i] = state;
////    }
////
////    for (int k=0; k<9; k++) {
////      System.out.println("-------------------" + k);
//////      for (int l=0; l<9; l++) {
////        System.out.println(nextState[k]);
//////      }
////    }
//
//    nextState = iterate(state, goalState, iteration);
//
//    for (int x=0; x<9; x++) {
//      System.out.println("-------------------" + x);
////      for (int y=0; y<9; y++) {
//      System.out.println(nextState[x]);
//      System.out.println(state[x]);
////      }
//    }
////    for (int i=0; i<9; i++) {
////      iterate(nextState[i], goalState, iteration);
////    }
////
////    for (int i=0; i<9; i++) {
////      System.out.print(nextState[i].length);
////      for (int j=0; i<9; j++) {
////      }
////      System.out.println();
////    }
//
////    nextState = iterate(state, goalState, iteration);
////    for (String s: nextState) {
////      System.out.println(s);
////    }
//  }
//
//  private static String[] iterate(String[] state, final String goalState, int iteration) {
//    for (int i=0; i<9; i++) {
//      int[] indices = getPositions(i);
//      StringBuilder s = new StringBuilder(state[i]);
//
//      for (int j: indices) {
//        s.setCharAt(j, flip(s.charAt(j)));
//      }
//      state[i] = s.toString();
//
////      System.out.println(state[i]);
//      if (state[i].equals(goalState)){
//        System.out.println("EXPECTED OUTPUT:"); // SHOULD BE REMOVED
//        System.out.println(iteration);
//        break;
//      }
//    }
//    return state;
//  }
//
//  private static String[] readGoalStates(int n, Scanner sc) {
//    sc.nextLine();
//
//    String[] goalStates = new String[n];
//    for (int p = 0; p < n; p++) {
//      String goal = "";
//      for (int i = 0; i<3; i++) {
//        goal += sc.nextLine();
//      }
//      goalStates[p] = goal;
//    }
//
//    return goalStates;
//  }
//
//  private static int[] getPositions(int index) {
//    switch (index) {
//      case 0:
//        return new int[]{0, 1, 3};
//      case 1:
//        return new int[]{0, 1, 2, 4};
//      case 2:
//        return new int[]{1, 2, 5};
//      case 3:
//        return new int[]{0, 3, 4, 6};
//      case 4:
//        return new int[]{1, 3, 4, 5, 7};
//      case 5:
//        return new int[]{2, 4, 5, 8};
//      case 6:
//        return new int[]{3, 6, 7};
//      case 7:
//        return new int[]{4, 6, 7, 8};
//      case 8:
//        return new int[]{5, 7, 8};
//      default:
//        return new int[]{};
//    }
//  }
//
//  private static char flip(char c) {
//    return c == '.' ? '*' : '.';
//  }
//}
