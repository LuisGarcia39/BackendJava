package practicaMona;

public class PrivateInvestoCat extends Mona{
    String atuendo4 = "Gabardina y sombrero";

    @Override
    public void Actividades(){
        System.out.println("Sale para buscar pistas y resolver un misterio");
    }

    void showInvestocat(){
        System.out.println("-----Private InvestoCat----");
        System.out.println("Atuendo: " + atuendo4);
        System.out.println("Actividad: ");
        Actividades();
    }
}
