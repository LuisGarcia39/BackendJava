package practicaMona;

public class DinotoCat extends Mona{
    String atuendo2 = "Traje de dinosaurio";

    @Override
    public void Actividades(){
        System.out.println("Mona juega a ser un dinosaurio aplastando una ciudad");
    }

    void showDinotoCat(){
        System.out.println("-----Dinotocat----");
        System.out.println("Atuendo: " + atuendo2);
        System.out.println("Actividad: ");
        Actividades();
    }

}
