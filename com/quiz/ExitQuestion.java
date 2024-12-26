package com.quiz;

public class ExitQuestion extends Question {
  public ExitQuestion(Question previousQuestion) {
    super("Are you sure you want to exit?", new String[] { "Yes", "No" }, previousQuestion);
  }
  
  public void handleAnswer(String answer) {
    switch (answer) {
      case "Yes":
        exit();
        break;
      case "No":
        back();
        break;
    }
  }

  public static void exit() {
    System.out.println("Exiting the quiz...");
  }
  
}
