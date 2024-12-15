package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b; // Code correct
    }

    public int subtract(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b cannot be zero!"); // Mauvaise gestion de l'erreur
        }
        return a - b;
    }

    public void printCalculation(int result) {
        System.out.println("The result is: " + result); // Code Smell: utiliser un logger
    }

    public void unusedMethod() {
        System.out.println("This method is not used."); // Code Smell: méthode non utilisée
    }
}
