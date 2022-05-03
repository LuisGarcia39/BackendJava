package practicaMona;

public class OctoNaut extends Mona{
    String atuendo6 = "Traje de astronauta";

    public void Actividades(){
        System.out.println("Explora el espacio en busca de nuevos conocimientos");
    }

    void showOctonaut(){
        System.out.println("-----Octonaut----");
        System.out.println("Atuendo: " + atuendo6);
        System.out.println("Actividad: ");
        Actividades();
    }
}
