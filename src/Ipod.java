import java.util.Scanner;

public interface Ipod {
    Scanner sc = new Scanner(System.in);

    public static void tocar(){
        System.out.println("Tocando a música");
    }

    public static void pausar(){
        System.out.println("Música pausada!");
    };

    public static void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }
}