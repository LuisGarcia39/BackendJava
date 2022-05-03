package practicaComic;
import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;

public class IZ extends Comic implements IZCallbacks{

    public IZ(String nombre,int numero ,String descripcion){
        super(nombre,numero,descripcion);
    }

    @Override
    public void p1(Screen s){
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/0.gif");
        s.setBounds(0,0,1400,1100);
    }

    @Override
    public void p2(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/2.gif");
        s.setBounds(0,0,1400,1100);
    }

    @Override
    public void p3(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/3.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p4(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/4.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p5(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/5.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p6(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/6.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p7(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/7.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p8(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/8.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p9(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/9.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p10(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/10.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p11(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/11.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p12(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/12.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p13(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/13.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p14(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/14.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p15(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/15.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p16(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/16.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p17(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/17.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p18(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/18.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p19(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/19.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p20(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/20.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p21(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/21.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p22(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/22.gif");
        s.setBounds(0,0,1450,1100);
    }

    @Override
    public void p23(Screen s){
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",24, Colors.pink);
        s.showImage("img/23.gif");
        s.setBounds(0,0,1450,1100);
    }
}
