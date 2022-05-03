package practicaMona;

public class HulatoCat extends Mona{
    String atuendo1 = "falda de hierbas y una flor en una oreja";
    @Override
    public void Actividades(){
        System.out.println("Mona toca un ukelele mientras baila moviendo de un lado a otro su falda de hula");
    }

    void showHulatocat(){
        //Mona M1 = new HulatoCat();
        System.out.println("-----Hulatocat----");
        System.out.println("Atuendo: " + atuendo1);
        System.out.println("Actividad: ");
        Actividades();
    }
}
