package practicaHarry;
//Modelado de 5 personajes de Harry Potter

public class Personaje {
    //caracteristica
    public String casa,genero,nombre,boggart,patronus;

    //metodos getter
    public String getCasa(){return casa;}
    public String getGenero(){return genero;}
    public String getNombre(){return nombre;}
    public String getBoggart(){return boggart;}
    public String getPatronus(){return patronus;}

    //metodos setter
    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }
}

//------------------Otra clase para la prueba------------------
class PruebaPersonaje {
    public static void main(String[] args) {
        inf();
    }
    static void inf(){
        Personaje Harry_Potter = new Personaje();
        Harry_Potter.setCasa("Gryffindor");
        Harry_Potter.setGenero("Masculino");
        Harry_Potter.setNombre("Harry James Potter");
        Harry_Potter.setBoggart("Dementor");
        Harry_Potter.setPatronus("Ciervo");

        Personaje Hermione = new Personaje();
        Hermione.setCasa("Gryffindor");
        Hermione.setGenero("Femenino");
        Hermione.setNombre("Hermione Jean Granger");
        Hermione.setBoggart("Fracasar");
        Hermione.setPatronus("Nutria");

        Personaje Ron = new Personaje();
        Ron.setCasa("Gryffindor");
        Ron.setGenero("Masculino");
        Ron.setNombre("Ronald Bilius Ron Weasley");
        Ron.setBoggart("Aragog");
        Ron.setPatronus("Terrier jack russel");

        Personaje Luna = new Personaje();
        Luna.setCasa("Ravenclaw");
        Luna.setGenero("Femenino");
        Luna.setNombre("Luna Scamander");
        Luna.setBoggart("Unknown");
        Luna.setPatronus("Liebre");

        Personaje Draco = new Personaje();
        Draco.setCasa("Slytherin");
        Draco.setGenero("Masculino");
        Draco.setNombre("Draco Lucius Malfoy");
        Draco.setBoggart("Lord Voldemort");
        Draco.setPatronus("None");

        String msg = "Personajes de Harry Potter:";
        msg+="\n"+Harry_Potter.getNombre();
        msg+="\nCasa: "+Harry_Potter.getCasa();
        msg+="\nGenero: "+Harry_Potter.getGenero();
        msg+="\nBoggart: "+Harry_Potter.getBoggart();
        msg+="\nPatronus: "+Harry_Potter.getPatronus();


        msg+="\n"+Hermione.getNombre();
        msg+="\nCasa: "+Hermione.getCasa();
        msg+="\nGenero: "+Hermione.getGenero();
        msg+="\nBoggart: "+Hermione.getBoggart();
        msg+="\nPatronus: "+Hermione.getPatronus();

        msg+="\n"+Ron.getNombre();
        msg+="\nCasa: "+Ron.getCasa();
        msg+="\nGenero: "+Ron.getGenero();
        msg+="\nBoggart: "+Ron.getBoggart();
        msg+="\nPatronus: "+Ron.getPatronus();

        msg+="\n"+Luna.getNombre();
        msg+="\nCasa: "+Luna.getCasa();
        msg+="\nGenero: "+Luna.getGenero();
        msg+="\nBoggart: "+Luna.getBoggart();
        msg+="\nPatronus: "+Luna.getPatronus();

        msg+="\n"+Draco.getNombre();
        msg+="\nCasa: "+Draco.getCasa();
        msg+="\nGenero: "+Draco.getGenero();
        msg+="\nBoggart: "+Draco.getBoggart();
        msg+="\nPatronus: "+Draco.getPatronus();

        System.out.println(msg);
    }
}

