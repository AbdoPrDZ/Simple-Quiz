package com.quiz;

public class CapitalQuestion extends Question {
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
        
        ask();
        break;
    }
  }
  
}
