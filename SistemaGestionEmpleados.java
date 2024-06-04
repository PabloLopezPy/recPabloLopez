public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        // Creas un arryList de clase Empleados
        Empleados ListaEmpleados = new Empleados();
        // Agregas datos ficticios
        Empleado emp1 = new Empleado("Paco", 20, 22000.0);
        Empleado emp2 = new Empleado("Julen", 25, 2500.0);
        Empleado emp3 = new Empleado("Pablo", 40, 3000.0);
        // Los introduces  en el array llamando a agregarEmpleado
        ListaEmpleados.agregarEmpleado(emp1);
        ListaEmpleados.agregarEmpleado(emp2);
        ListaEmpleados.agregarEmpleado(emp3);
        // Muestras los empleados
        ListaEmpleados.mostrarEmpleados();
        // Haces el aumento 
        ListaEmpleados.aumentarSalario(10);
        // Vuelves a mostrarlos para ver los cambios actualizados
        ListaEmpleados.mostrarEmpleados();
    }
}

