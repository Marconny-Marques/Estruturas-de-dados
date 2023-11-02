public class Aula11 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<String>(1);

        Lista<Contato> vetor = new Lista<Contato>(1);
         
        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

        vetor.adiciona(c3);


    }
}
