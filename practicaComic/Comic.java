package practicaComic;

public class Comic {
    private String nombre;
    private String descripcion;
    private int numero;

    public Comic(String nombre,int numero, String descripcion){
        this.nombre = nombre;
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public String getNombre(){return nombre;}
    public String getDescripcion(){return descripcion;}
    public int getNumero(){return numero;}

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setDescripcion(String descripcion){
        if (!descripcion.isEmpty()){
            this.descripcion = descripcion;
            return true;
        } else
            return false;
    }

    public boolean setNumero(int numero){
        if(numero>0){
            this.numero = numero;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return "Nombre: " + nombre +" Numero: "+numero +"\nDescripcion: "+descripcion;

    }
}
