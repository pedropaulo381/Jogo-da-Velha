import java.util.ArrayList;
import java.util.List;
public class Vertice {
    private Tabuleiro tabuleiroEstado;
    private List<Vertice> verticesAdjacentes = new ArrayList<Vertice>();
    private Vertice verticePai;
    private String jogadaText; // saber se a jogada é X ou O
    
    public String getJogadaText(){
        return jogadaText;
    }
    public void setJogadaText(String jogadaText){
        this.jogadaText = jogadaText;
    }
    
    
    Vertice verticePai;
    public Vertice getVerticePai(){
        return verticePai;
    }
    public void setVerticePai(Vertice verticePai){
        this.verticePai = verticePai;
    }
       
    
    public Tabuleiro getTabuleiroEstado(){
        return tabuleiroEstado;
    }
    //adiciona vertices filhos a vértice atual
    public void adicionarVertice(Vertice vertice){
        verticesAdjacentes.add(vertice);
    }
}
