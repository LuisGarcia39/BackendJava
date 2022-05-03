package practicaMultiverse;

public class Spiderverse {
    private String SpNombre;
    private String identidad;
    private int edad;
    private String ColorTraje;
    private int tierra;

    Spiderverse(String SpNombre,String identidad,int edad,String ColorTraje,int tierra){
        this.SpNombre = SpNombre;
        this.identidad = identidad;
        this.edad = edad;
        this.ColorTraje = ColorTraje;
        this.tierra = tierra;
    }

    public String getSpNombre(){return SpNombre;}
    public String getIdentidad(){return identidad;}
    public String getColorTraje(){return ColorTraje;}
    public int getEdad(){return edad;}
    private int getTierra(){return tierra;}

    public boolean setSpNombre(String SpNombre){
        if(!SpNombre.isEmpty()){
            this.SpNombre = SpNombre;
            return true;
        } else
            return false;
    }

    public boolean setIdentidad(String identidad){
        if(!identidad.isEmpty()){
            this.identidad=identidad;
            return true;
        } else
            return false;
    }

    public boolean setColorTraje(String ColorTraje){
        if(!ColorTraje.isEmpty()){
            this.ColorTraje = ColorTraje;
            return true;
        } else
            return false;
    }

    public boolean setEdad(int edad){
        if (edad>0){
            this.edad = edad;
            return true;
        } else
            return false;
    }

    public boolean setTierra(int tierra){
        if(tierra>0){
            this.tierra = tierra;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: " + SpNombre +
                        "\nIdentidad: " + identidad +
                        "\nEdad: " + edad +
                        "\nColor: " + ColorTraje +
                        "\nTierra: " + tierra + "\n";
    }
}
