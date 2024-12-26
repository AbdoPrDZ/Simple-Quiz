package com.quiz;

public abstract class Question {

  private String prompt;
  private String[] options;
  private Question previousQuestion;

  /**
   * Creates a Question instance.
   * 
   * @param prompt The prompt of the question.
   * @param options The options of the question.
   * @return Question
   */
  public Question(String prompt, String[] options) {
    this.prompt = prompt;
    this.options = options;
  }

  /**
   * Creates a Question instance with a previous question.
   * 
   * @param prompt The prompt of the question.
   * @param options The options of the question.
   * @param previousQuestion The previous question.
   * @return Question
   */
  public Question(String prompt, String[] options, Question previousQuestion) {
    this.prompt = prompt;
    this.options = options;
    this.previousQuestion = previousQuestion;
  }

  /**
   * Returns the prompt of the question.
   * 
   * @return String The prompt of the question.
   */
  public void setPreviousQuestion(Question previousQuestion) {
    this.previousQuestion = previousQuestion;
  }

  /**
   * Returns the prompt of the question.
   * 
   * @return String The prompt of the question.
   */
  public void ask() {
    String answer = "";

    // keep asking until the answer is valid
    while (!Main.contains(this.options, answer)) {
      // clear the screen
      Main.clearScreen();

      // print the prompt and the options
      System.out.println(this.prompt);

      // print the options
      for (int i = 0; i < this.options.length; i++) {
        System.out.println((i + 1) + ". " + this.options[i]);
      }

      // get the answer
      System.out.print("Enter your answer: ");
      answer = System.console().readLine();

      // get the answer if it is a number
      try {
        // get the answer as an integer
        int answerInt = Integer.parseInt(answer);
        // check if the answer is valid
        if (answerInt > 0 && answerInt <= this.options.length) {
          // get the answer
          answer = this.options[answerInt - 1];
        }
      } catch (NumberFormatException e) {
        // do nothing
      }
    }

    // handle the answer
    handleAnswer(answer);
  }

  /**
   * Handles the answer of the question.
   * 
   * @param answer The answer of the question.
   * @return void
   */
  public abstract void handleAnswer(String answer);

  /**
   * Goes back to the previous question if it exists.
   * 
   * @return void
   */
  public void back() {
    // check if the previous question exists
    if (this.previousQuestion != null) {
      // ask the previous question
      this.previousQuestion.ask();
    }
  }

}
