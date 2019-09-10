import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;



public class Vertice {
    private Tabuleiro tabuleiroEstado;
    private Set<Vertice> verticesAdjacentes = new HashSet<Vertice>();
    private Vertice verticePai;
    private String jogadaText; // saber se a jogada é X ou O

    
    public String getJogadaText(){
        return jogadaText;
    }
    public void setJogadaText(String jogadaText){
        this.jogadaText = jogadaText;
    }
    
    
    
    public Vertice getVerticePai(){
        return verticePai;
    }
    public void setVerticePai(Vertice verticePai){
        this.verticePai = verticePai;
    }
       
    
    public Tabuleiro getTabuleiroEstado(){
        return tabuleiroEstado;
    }     
   public void setTabuleiroEstado(Tabuleiro tabuleiroEstado){
       this.tabuleiroEstado = tabuleiroEstado;
   }     
    
    //adiciona vertices filhos a vértice atual
    public void adicionarVertice(Vertice vertice){
        verticesAdjacentes.add(vertice);
    }
}
