# Quiz Application

This is a simple console-based quiz application written in Java. This project demonstrates an effective way to create a quiz.

## Project Structure

```
/Simple-Quiz
│   └── com
│       └── quiz
│           ├── CapitalQuestion.java
│           ├── ExitQuestion.java
│           ├── Main.java
│           ├── Question.java
│           └── WelcomeQuestion.java
└── README.md
```

## Classes

### `com.quiz.Main`

The entry point of the application. It initializes the quiz and starts with the welcome question.

### `com.quiz.Question`

An abstract class representing a generic question. It provides methods to ask the question, handle the answer, and navigate to the previous question.

### `com.quiz.WelcomeQuestion`

A class representing the welcome question. It prompts the user to start the quiz or exit.

### `com.quiz.CapitalQuestion`

A class representing a specific question about the capital of Algeria. It handles the user's answer and provides feedback.

### `com.quiz.ExitQuestion`

A class representing the exit question. It confirms if the user wants to exit the quiz.
