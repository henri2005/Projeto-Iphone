import java.util.Scanner;

public interface Ipod {
    Scanner sc = new Scanner(System.in);
    String nomeMusica = sc.next();

    public static void tocar(){
        System.out.println("Tocando a música " + nomeMusica);
    }

    public static void pausar(){
        System.out.println("Música pausada!");
    };

    public static void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }
}