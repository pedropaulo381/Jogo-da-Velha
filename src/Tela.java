import javax.swing.JFrame;
public class Tela extends JFrame{
    public Tela(){
        super("Jogo da Velha - Tec. Desenv. de jogos");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
}
