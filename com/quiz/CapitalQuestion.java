package com.quiz;

public class CapitalQuestion extends Question {

  /**
   * Creates a CapitalQuestion instance.
   * 
   * @return CapitalQuestion
   */
  public CapitalQuestion() {
    super("What is the capital of Algeria?", new String[] { "Algiers", "Cairo", "Tunis", "Rabat", "I don't know", "Back" });
  }

  public void handleAnswer(String answer) {
    switch (answer) {
      case "Algiers":
        System.out.println("Correct!");
        break;
      case "I don't know":
        System.out.println("The correct answer is Algiers.");
        break;
      case "Back":
        back();
        break;
      default:
        System.out.println("Incorrect!");
        System.console().readLine();

        // ask the question again
        ask();
        break;
    }
  }
  
}
