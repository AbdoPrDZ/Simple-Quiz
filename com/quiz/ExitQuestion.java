package com.quiz;

public class ExitQuestion extends Question {

  /**
   * Creates an ExitQuestion instance.
   * 
   * @param previousQuestion The previous question.
   * @return ExitQuestion
   */
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

  /**
   * Exits the quiz.
   * 
   * @return void
   */
  public static void exit() {
    System.out.println("Exiting the quiz...");
  }
  
}
