package practicaMultiverse;
import imonsh.*;

public class SPM {
    public static void main(String[] args) throws InterruptedException{
        TestSp();
    }

    private static void TestSp() throws InterruptedException {
        Screen screen = new Screen();
        MilesMorales MM = new MilesMorales("Spider-man\n", "Miles Morales\n", 17, "Negro y rojo\n", 1610);
        PeniParker PP = new PeniParker("SP//dr", "Peni Parker", 14, "Rojo con azul", 14512);
        MiguelOHara MOH = new MiguelOHara("Spider-man 2099", "Miguel O Hara", 24, "Azul con rojo", 928);

        Runnable ataques = new Runnable() {
            @Override
            public void run() {
                try {
                    MM.invisibilidad(screen);
                    Thread.sleep(3000);

                    MM.LanzaTelarañas(screen);
                    Thread.sleep(3000);

                    MM.VenomBlast(screen);
                    Thread.sleep(3000);

                    PP.Laser(screen);
                    Thread.sleep(3000);

                    PP.LanzaTelarañas(screen);
                    Thread.sleep(3000);

                    PP.SuperSalto(screen);
                    Thread.sleep(3000);

                    MOH.SuperGolpe(screen);
                    Thread.sleep(3000);

                    MOH.SuperFuerza(screen);
                    Thread.sleep(3000);

                    MOH.tela(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        Thread At = new Thread(ataques);
        At.start();
    }
}

