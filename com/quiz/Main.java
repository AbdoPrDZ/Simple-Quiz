package com.quiz;

class Main {

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static int indexOf(String[] arr, String target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public static boolean contains(String[] arr, String target) {
    return indexOf(arr, target) != -1;
  }

  public static void main(String[] args) {
    WelcomeQuestion welcome = new WelcomeQuestion(
      new CapitalQuestion()
    );

    welcome.ask();
  }
}