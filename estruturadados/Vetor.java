package estruturadados;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento) {
        for (int i = 0; i<this.elementos.length; i++) {
            if (this.elementos[0] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    public void adiciona(String elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }
}
