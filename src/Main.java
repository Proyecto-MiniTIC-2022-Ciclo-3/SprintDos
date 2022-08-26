import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Lolitas","Calle 48 sur",123,123456);

        System.out.println(empresa);

        empresa.setNombre("TripleAAA");
        empresa.setDireccion("diagonal 32");
        empresa.setNumero(5101002);
        empresa.setNit(64567);

        System.out.println("Datos modificados");

        System.out.println(empresa);

        System.out.println("");
        System.out.println("Datos del empleado");

        Empleado empleado = new Empleado("Stiven","Stiven@hotmail.com","lolitas","Administrador");
        System.out.println(empleado);

        System.out.println("Datos modificados empleado");

        empleado.setNombreempleado("Brayan");
        empleado.setCorreoempleado("brayan@gmail.com");
        empleado.setEmpresaempleado("TripleAAA");
        empleado.setRol("Operativo");
        System.out.println(empleado);
        System.out.println("");


        MovimientoDeDinero md = new MovimientoDeDinero(1000000,"Negativo","pago servicios","Stiven");
        System.out.println("Datos del movimiento de dinero");
        System.out.println(md);
        System.out.println("Datos modificados del movimiento de dinero");
        md.setMontomovimiento(300000);
        md.setTipomovimiento("Positivo");
        md.setConceptomovimiento("venta de muebles");
        md.setEncargadomovimiento("Brayan");
        System.out.println(md);










    }
}