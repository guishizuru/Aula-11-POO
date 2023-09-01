public class Heroi {
    private int id;
    private  String nome;
    private int quatidadeMoedasDeOuro;

    public Heroi(){}

    public  Heroi (int id, String nome, int quatidadeMoedasDeOuro){
        this.id = id;
        this.nome = nome;
        this.quatidadeMoedasDeOuro = quatidadeMoedasDeOuro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuatidadeMoedasDeOuro() {
        return quatidadeMoedasDeOuro;
    }

    public void setQuatidadeMoedasDeOuro(int quatidadeMoedasDeOuro) {
        this.quatidadeMoedasDeOuro = quatidadeMoedasDeOuro;
    }
}
