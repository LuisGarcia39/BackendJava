package practicaMultiverse;
import imonsh.*;

public class PeniParker extends Spiderverse implements PeniActionCallbacks{

    public PeniParker(String SpNombre, String identidad, int edad, String ColorTraje, int tierra){
        super(SpNombre,identidad,edad,ColorTraje,tierra);
    }

    @Override
    public void Laser(Screen s){
        //s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nPuede usar los laser de los dedos del robot para diferentes acciones\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/laser.gif");
        s.setBounds(0,0,600,880);
    }

    public void LanzaTelarañas(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nEntre sus componentes incluye un lanza telarañas que permite moverse de un lado a otro\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/lanzatelaraña.jpg");
        s.setBounds(0,0,600,880);
    }

    public void SuperSalto(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nOtra caracteristica es que el traje puede moverse con agilidad por medio de saltos\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/salto.gif");
        s.setBounds(0,0,600,880);
    }
}
