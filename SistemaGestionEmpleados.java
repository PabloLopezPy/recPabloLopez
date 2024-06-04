public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleados ListaEmpleados = new Empleados();

        Empleado emp1 = new Empleado("Paco", 20, 22000.0);
        Empleado emp2 = new Empleado("Julen", 25, 2500.0);
        Empleado emp3 = new Empleado("Pablo", 40, 3000.0);

        ListaEmpleados.agregarEmpleado(emp1);
        ListaEmpleados.agregarEmpleado(emp2);
        ListaEmpleados.agregarEmpleado(emp3);

        ListaEmpleados.mostrarEmpleados();
        ListaEmpleados.aumentarSalario(10);
        ListaEmpleados.mostrarEmpleados();
    }
}

