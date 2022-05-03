package practicaMultiverse;
import imonsh.*;

public class MiguelOHara extends Spiderverse implements MiguelActionCallbacks{

    public MiguelOHara(String SpNombre, String identidad, int edad, String ColorTraje, int tierra){
        super(SpNombre,identidad,edad, ColorTraje,tierra);
    }

    @Override
    public void SuperGolpe(Screen s){
        //s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nCon su superfuerza, sus golpes pueden ser muy dañinos\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/Mgolpe.gif");
        s.setBounds(0,0,600,880);
    }

    @Override
    public void SuperFuerza(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nCuenta con Super fuerza, lo que le permite defenderse de cualquier peligro\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/Mfuerza.gif");
        s.setBounds(0,0,600,880);
    }

    @Override
    public void tela(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",20, Colors.DARK_GRAY);
        s.out("\nCapaz de lanzar telarañas para ir de un lado a otro o para atacar\n","Helvetica",20, Colors.DARK_GRAY);
        s.showImage("img/Mtela.gif");
        s.setBounds(0,0,600,880);
    }
}
