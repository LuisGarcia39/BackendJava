package practicaMultiverse;
import imonsh.*;

public class MilesMorales extends Spiderverse implements MilesActionCallbacks{

    public MilesMorales(String SpNombre, String identidad, int edad, String ColorTraje, int tierra){
        super(SpNombre,identidad,edad,ColorTraje,tierra);
    }

    @Override
    public void invisibilidad(Screen s){
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nCapacidad para volverse invisible\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/invisible.gif");
        s.setBounds(0,0,600,880);
    }

    @Override
    public void VenomBlast(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nCanaliza energia electrica de su cuerpo para usarla contra sus enemigos\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/electrico.gif");
        s.setBounds(0,0,600,880);
    }

    @Override
    public void LanzaTelarañas(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nCapaz de lanzar telarañas, ya sea para ataque o para transporte\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/telaraña.gif");
        s.setBounds(0,0,600,880);
    }
}
