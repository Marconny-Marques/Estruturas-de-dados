package Exerlabs;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<Livro>();

        Livro livro1 = new Livro();
        livro1.setNome("Learning JavaScript Data Structures and Algoritms");
        livro1.setAutor("Loiane Groner");
        livro1.setAnolançamento(2016);
        livro1.setIsbn("B01C2XX8YZ");


        Livro livro2 = new Livro();
        livro2.setNome("Learning Java");
        livro2.setAutor("Loiane Groner");
        livro2.setAnolançamento(2014);
        livro2.setIsbn("B00OYTCT02");


        Livro livro3 = new Livro();
        livro3.setNome("Mastering Ext JS");
        livro3.setAutor("Loiane Groner");
        livro3.setAnolançamento(2015);
        livro3.setIsbn("B00U01QQWU");


        Livro livro4 = new Livro();
        livro4.setNome("JavaScript Regular");
        livro1.setAutor("Loiane Groner");
        livro4.setAnolançamento(2015);
        livro4.setIsbn("B00YHBVHGO");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha:");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() +" livros foram empilhados:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilha livros da pilha: ");

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro: " + pilha.pop());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());
    }
}
