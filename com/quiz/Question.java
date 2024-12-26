package com.quiz;

public abstract class Question {
  private String prompt;
  private String[] options;
  private Question previousQuestion;

  public Question(String prompt, String[] options) {
    this.prompt = prompt;
    this.options = options;
  }

  public Question(String prompt, String[] options, Question previousQuestion) {
    this.prompt = prompt;
    this.options = options;
    this.previousQuestion = previousQuestion;
  }

  public void setPreviousQuestion(Question previousQuestion) {
    this.previousQuestion = previousQuestion;
  }

  public void ask() {
    String answer = "";

    while (!Main.contains(this.options, answer)) {
      Main.clearScreen();

      System.out.println(this.prompt);

      for (int i = 0; i < this.options.length; i++) {
        System.out.println((i + 1) + ". " + this.options[i]);
      }

      System.out.print("Enter your answer: ");
      answer = System.console().readLine();

      // get the answer if it is a number
      try {
        int answerInt = Integer.parseInt(answer);
        if (answerInt > 0 && answerInt <= this.options.length) {
          answer = this.options[answerInt - 1];
        }
      } catch (NumberFormatException e) {
        // do nothing
      }
    }

    handleAnswer(answer);
  }

  public abstract void handleAnswer(String answer);

  public void back() {
    if (this.previousQuestion != null) {
      this.previousQuestion.ask();
    }
  }
}
