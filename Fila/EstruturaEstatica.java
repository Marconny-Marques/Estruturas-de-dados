package Fila;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    public EstruturaEstatica() {
        this(10);
    }

    public boolean estaVazia() {
        return this.tamanho == 00;
    }

    protected boolean adiciona(T elemento) {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            
        }
        return true;
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválidade");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho-1; i>= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    protected void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i=posicao; i<tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    private void aumentaCapacidade() {
        this.aumentaCapacidade();
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object [this.elementos.length*2];
            for(int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[1];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        

        for (int i=0; i<this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }
        if (this.tamanho>0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}

