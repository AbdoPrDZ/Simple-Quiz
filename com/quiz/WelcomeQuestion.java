package com.quiz;

public class WelcomeQuestion extends Question {
  private Question startQuestion;

  public WelcomeQuestion(Question startQuestion) {
    super("Welcome to the quiz! Choose an option:", new String[] { "Start", "Exit" });
    this.startQuestion = startQuestion;
  }
  
  public void handleAnswer(String answer) {
    switch (answer) {
      case "Start":
        start();
        break;
      case "Exit":
        exit();
        break;
    }
  }

  public void start() {
    System.out.println("Starting the quiz...");

    this.startQuestion.setPreviousQuestion(this);
    this.startQuestion.ask();
  }

  public void exit() {
    new ExitQuestion(this).ask();
  }
}
