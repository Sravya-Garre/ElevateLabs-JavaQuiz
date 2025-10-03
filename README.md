Java Collections Quiz (Console-based)
=> Objective
        A console-based quiz application built in Core Java to test knowledge of the Collections Framework.
The quiz presents multiple-choice questions, accepts user answers, and provides a final score with feedback.

=>Tools & Technologies
Language: Java (Core Java)
Execution: Console/Terminal
IDE: Eclipse

=>Features
Multiple-choice questions based on Java Collections (ArrayList, HashSet, Map, etc.)
Uses a List of Question objects to store and display quiz questions.
Accepts user input and validates answers.
Displays real-time feedback after each answer.
Shows final score with motivational feedback at the end.

=> Example Questions
Which collection class allows you to grow or shrink its size and provides indexed access to its elements?
Which of these classes implements the Map interface?
Which collection does not allow duplicate elements?
Which collection class maintains insertion order?
Which method is used to add an element into a HashMap?

📂 Project Structure
src/
└── com/nt/quiz/
    ├── Question.java    # Class to store question details
    └── QuizApp.java     # Main application class

=>How to Run
Clone the repository (or copy the source code).
git clone <your-repo-link>
Open the project in Eclipse/IntelliJ/VS Code.

=>Compile and run the QuizApp.java file.
javac QuizApp.java
java com.nt.quiz.QuizApp


Answer the questions by entering option numbers (1-4).

=>Sample Output
===== Welcome to the Java Collections Quiz =====
Answer the following questions:

1. Which collection class allows you to grow or shrink its size and provides indexed access to its elements?
1. HashSet
2. ArrayList
3. LinkedList
4. TreeSet
Your answer (1-4): 2
Correct!

===== Quiz Finished =====
Your Score: 8 out of 10
Very Good! You know Collections well.

=> Deliverables
Question.java → Class to define quiz questions.
QuizApp.java → Main quiz logic and execution.
README.md → Project documentation.


