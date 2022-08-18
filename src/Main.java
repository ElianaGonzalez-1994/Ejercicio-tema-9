public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "marta";
        cliente.edad = 23;
        cliente.telefono = 1168540356;
        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);


    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;


}

class Cliente extends Persona {

}

class Credito extends  Cliente {

}

class Trabajador extends Persona {

}
class trabajador {
    int salario;
}