package com.nt.quiz;

import java.util.*;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOption;

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == correctOption;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> quiz = new ArrayList<>();

        // Adding Core Java Collection Framework Questions
        quiz.add(new Question(
                "1. Which collection class allows you to grow or shrink its size and provides indexed access to its elements?",
                Arrays.asList("HashSet", "ArrayList", "LinkedList", "TreeSet"),
                2));

        quiz.add(new Question(
                "2. Which of these classes implements the Map interface?",
                Arrays.asList("HashMap", "ArrayList", "LinkedList", "Vector"),
                1));

        quiz.add(new Question(
                "3. Which collection does not allow duplicate elements?",
                Arrays.asList("List", "Set", "Map", "Queue"),
                2));

        quiz.add(new Question(
                "4. Which collection class maintains insertion order?",
                Arrays.asList("HashSet", "TreeSet", "LinkedHashSet", "PriorityQueue"),
                3));

        quiz.add(new Question(
                "5. Which of these allows null keys and multiple null values?",
                Arrays.asList("TreeMap", "Hashtable", "HashMap", "ConcurrentHashMap"),
                3));

        quiz.add(new Question(
                "6. Which class is best for implementing LIFO (Last In First Out)?",
                Arrays.asList("Queue", "PriorityQueue", "Stack", "HashSet"),
                3));

        quiz.add(new Question(
                "7. Which of these is synchronized by default?",
                Arrays.asList("ArrayList", "LinkedList", "HashMap", "Vector"),
                4));

        quiz.add(new Question(
                "8. Which interface is the root of the Java Collections Framework?",
                Arrays.asList("List", "Collection", "Map", "Iterable"),
                2));

        quiz.add(new Question(
                "9. Which collection sorts elements in natural ordering?",
                Arrays.asList("HashSet", "TreeSet", "ArrayList", "LinkedHashMap"),
                2));

        quiz.add(new Question(
                "10. Which method is used to add an element into a HashMap?",
                Arrays.asList("put()", "add()", "insert()", "set()"),
                1));

        int score = 0;

        System.out.println("===== Welcome to the Java Collections Quiz =====");
        System.out.println("Answer the following questions:\n");

        for (Question q : quiz) {
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();

            if (q.checkAnswer(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong Answer.\n");
            }
        }

        System.out.println("===== Quiz Finished =====");
        System.out.println("Your Score: " + score + " out of " + quiz.size());

        if (score == quiz.size()) {
            System.out.println(" Excellent! Perfect Score!");
        } else if (score >= 7) {
            System.out.println(" Very Good! You know Collections well.");
        } else if (score >= 4) {
            System.out.println("Not bad! Keep practicing Collections.");
        } else {
            System.out.println("You need more practice. Revise Java Collections Framework.");
        }

        sc.close();
    }
}
