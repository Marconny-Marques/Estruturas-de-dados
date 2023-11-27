

public class Livro {
    private String isbn;
    private String autor;
    private int anolançamento;
    private String nome;

    public Livro() {
        super();
    }

    public Livro(String isbn, String autor, int anolançamento, String nome) {
        this.isbn = isbn;
        this.autor = autor;
        this.anolançamento = anolançamento;
        this.nome = nome;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnolançamento() {
        return anolançamento;
    }
    public void setAnolançamento(int anolançamento) {
        this.anolançamento = anolançamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro [isbn=" + isbn + ", autor=" + autor + ", anolançamento=" + anolançamento + ", nome=" + nome + "]";
    }

    
}
