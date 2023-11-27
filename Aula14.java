public class Aula14 {
    
    Pilha<Integer> pilha = new Pilha<Integer>();

    for (int i = 1; i<=10; i++) {
        pilha.empilha(i);
    }
    
    system.out.println(pilha);
    system.out.println(pilha.tamanho());
}
