package apaza20200825constructor;
public class Persona {
    int DNI;
    String nombre, apellido;
//Constructor por defecto
    public Persona(){
        System.out.println("Creando persona...");
        DNI = 0;
        nombre = "";
        apellido = "";
    }
//Constructor que reciba DNI
    public Persona(int DNI){
        this();
        this.DNI = DNI;
    }
//Constructor que reciba DNI, Nombre
    public Persona(int DNI, String nombre){
        this(DNI);
        this.nombre = nombre;
    }
//Constructor que reciba DNI, Nombre y Apellido
    public Persona(int DNI, String nombre, String apellido){
        this(DNI,nombre);
        this.apellido = apellido;
    }
//Método que muestre por pantalla todos los datos de la persona.
    public void mostrarPorPantalla(){
        if(DNI != 0){
            System.out.println(this.DNI);
        }
        if (!(nombre.equals(""))){
            System.out.println(this.nombre);
        }
        if(!(apellido.equals(""))){
            System.out.println(this.apellido);
        }
        System.out.println();
    }
}
