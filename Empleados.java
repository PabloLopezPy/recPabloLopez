import java.util.ArrayList;

public class Empleados {
    private ArrayList<Empleado> lista;

    public Empleados() {
        this.lista = new ArrayList<>();
    }

    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println(Textos.NOMBRE + e.getNombre() + ", " + Textos.EDAD + e.getEdad() + ", " + Textos.SALARIO + e.getSalario());
        }
    }
    

    public void aumentarSalario(double porcentaje) {
        for (Empleado e : lista) {
            double nuevoSalario = e.getSalario() * (1 + porcentaje / 100);
            e.setSalario(nuevoSalario);
        }
    }

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
