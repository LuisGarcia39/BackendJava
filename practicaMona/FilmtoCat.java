package practicaMona;

public class FilmtoCat extends Mona{
    String atuendo5 = "Usa lentes";

    public void Actividades(){
        System.out.println("Le gusta filmar peliculas con su videocamara");
    }

    void showFilmtocat(){
        System.out.println("-----Filmtocat----");
        System.out.println("Atuendo: " + atuendo5);
        System.out.println("Actividad: ");
        Actividades();
    }
}
