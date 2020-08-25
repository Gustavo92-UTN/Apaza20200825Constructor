package apaza20200825constructor;
public class Apaza20200825Constructor {
    public static void main(String[] args) {
        Persona p1, p2, p3, p4;
//Crear 4 personas donde cada una use un constructor distinto.
        p1 = new Persona();
        p2 = new Persona(12345678);
        p3 = new Persona(11223344, "Maria");
        p4 = new Persona(94460067, "Gustavo", "Apaza");
//Mostrar los datos de todas.
        p1.mostrarPorPantalla();
        p2.mostrarPorPantalla();
        p3.mostrarPorPantalla();
        p4.mostrarPorPantalla();
    }
}
