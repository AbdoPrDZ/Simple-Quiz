package com.quiz;

class Main {

  /**
   * Clears the screen.
   * 
   * @return void
   */
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  /**
   * Returns the index of the target in the array.
   * 
   * @param arr The array to search in.
   * @param target The target to search for.
   * @return int The index of the target in the array.
   */
  public static int indexOf(String[] arr, String target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Returns true if the array contains the target.
   * 
   * @param arr The array to search in.
   * @param target The target to search for.
   * @return boolean True if the array contains the target.
   */
  public static boolean contains(String[] arr, String target) {
    return indexOf(arr, target) != -1;
  }

  /**
   * The main method.
   * 
   * @param args The command-line arguments.
   * @return void
   */
  public static void main(String[] args) {
    // create the welcome question
    WelcomeQuestion welcome = new WelcomeQuestion(
      new CapitalQuestion()
    );

    // ask the welcome question
    welcome.ask();
  }
}