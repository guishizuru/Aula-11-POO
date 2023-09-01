public abstract class Inimigo {

    private int id;
    private String nome;

    public Inimigo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public void risadinha(){
        System.out.println("ahahahhaah");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}