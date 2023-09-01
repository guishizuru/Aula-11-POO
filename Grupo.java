import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Heroi> herois = new ArrayList<>();
    private int totalMoedasDeOuro = 0;

    public void adicionarHeroi(Heroi heroi){
        this.herois.add(heroi);
        this.totalMoedasDeOuro = totalMoedasDeOuro + heroi.getQuatidadeMoedasDeOuro();
    }
    public List<Heroi> getHerois(){
        return herois;
    }
    public void setHerois(List<Heroi> herois){
        this.herois = herois;
    }

    public int getTotalMoedasDeOuro() {
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}
