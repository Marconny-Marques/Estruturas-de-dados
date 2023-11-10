package Exerlabs;

import java.util.Scanner;
import java.util.Stack;

public class Exer05 {
    public static void main(String[] args) {
      
        
        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");

    }
    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palindromo?" + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<palavra.length(); i++) {
            stack.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while(!stack.isEmpty()) {
            palavraInversa += stack.pop();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }
}
