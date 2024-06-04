import java.util.ArrayList;

public class Empleados {
    // Generamos arrayList de la clase empleado
    private ArrayList<Empleado> lista;
    // Creamos sus constructores
    public Empleados() {
        this.lista = new ArrayList<>();
    }
    // Realizamos un metodo para mostrar todos los empleados llamando a Textos y Empleado
    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println(Textos.NOMBRE + e.getNombre() + ", " + Textos.EDAD + e.getEdad() + ", " + Textos.SALARIO + e.getSalario());
        }
    }
    
    // Aumentamos el salario, recordar usar double para almacenar datos, sino no se puede
    public void aumentarSalario(double porcentaje) {
        for (Empleado e : lista) {
            double nuevoSalario = e.getSalario() * (1 + porcentaje / 100);
            e.setSalario(nuevoSalario);
        }
    }
    // Agregamos a los empleados a la lista
    public void agregarEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    public ArrayList<Empleado> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Empleado> lista) {
        this.lista = lista;
    }
}
