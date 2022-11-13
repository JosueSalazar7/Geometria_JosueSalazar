import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        musica m = new musica();
        System.out.println("Titulo de la cancion: " + m.getTitulocancion());
        m.setTitulocancion("Hola");
        System.out.println("Titulo de la cacion: " + m.getTitulocancion());
        System.out.println("Genero: " + m.getGenero());
        m.setGenero("Bacahata");
        System.out.println("Gnero: " + m.getGenero());
        System.out.println("Anio publicacion: " + m.getAniopublicacion());
        m.setAniopublicacion(2022);
        System.out.println("Anio publicacion: " + m.getAniopublicacion());
        System.out.println("Artista: " + m.getArtista());
        m.setArtista("Bad Bunny");
        System.out.println("Artista: " + m.getArtista());
    }
}