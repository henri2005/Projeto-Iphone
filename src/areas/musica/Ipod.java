package areas.musica;
import java.util.Scanner;

public interface Ipod {
    Scanner sc = new Scanner(System.in);

    public void tocar();

    public void pausar();

    public void selecionarMusica(String musica);
}