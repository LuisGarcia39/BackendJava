package practicaMona;

public class Catstello extends Mona{
    public String atuendo3 = "Usa lentes oscuros, playera negra y audifonos de casco.";

    @Override
    public void Actividades(){
        System.out.println("Mona esta usando un tablero de DJ para hacer mezclas");
    }

    void showCatstello(){
        System.out.println("-----Catstello----");
        System.out.println("Atuendo: " + atuendo3);
        System.out.println("Actividad: ");
        Actividades();
    }
}
