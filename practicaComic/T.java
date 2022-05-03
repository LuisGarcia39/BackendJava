package practicaComic;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;

public class T {
    public static void main(String[] args) throws InterruptedException{
        TestIZ();
    }

    private static void TestIZ() throws InterruptedException{
        Screen screen = new Screen();
        IZ In = new IZ(
                "Invasor Zim",
                03,
                "Zim usa una estructura para sus malvados planes");

        Runnable p = new Runnable() {
            @Override
            public void run() {
                try {
                    In.p1(screen);
                    Thread.sleep(5218);

                    In.p2(screen);
                    Thread.sleep(5218);

                    In.p3(screen);
                    Thread.sleep(5218);

                    In.p4(screen);
                    Thread.sleep(5218);

                    In.p5(screen);
                    Thread.sleep(5218);

                    In.p6(screen);
                    Thread.sleep(5218);

                    In.p7(screen);
                    Thread.sleep(5218);

                    In.p8(screen);
                    Thread.sleep(5218);

                    In.p9(screen);
                    Thread.sleep(5218);

                    In.p10(screen);
                    Thread.sleep(5218);

                    In.p11(screen);
                    Thread.sleep(5218);

                    In.p12(screen);
                    Thread.sleep(5218);

                    In.p13(screen);
                    Thread.sleep(5218);

                    In.p14(screen);
                    Thread.sleep(5218);

                    In.p15(screen);
                    Thread.sleep(5218);

                    In.p16(screen);
                    Thread.sleep(5218);

                    In.p17(screen);
                    Thread.sleep(5218);

                    In.p18(screen);
                    Thread.sleep(5218);

                    In.p19(screen);
                    Thread.sleep(5218);

                    In.p20(screen);
                    Thread.sleep(5218);

                    In.p21(screen);
                    Thread.sleep(5218);

                    In.p22(screen);
                    Thread.sleep(5218);

                    In.p23(screen);
                    Thread.sleep(5218);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
     Thread pag = new Thread(p);
     pag.start();
    }
}
