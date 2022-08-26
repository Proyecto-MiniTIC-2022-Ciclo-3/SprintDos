import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Clases intancias Empresa,Empleado,MovimientoDeDinero
        Empresa empresa = new Empresa("Lolitas","Calle 48 sur",123,123456);
        Empleado empleado = new Empleado("Stiven","Stiven@hotmail.com", "lolitas","Administrador");
        MovimientoDeDinero md = new MovimientoDeDinero(1000000,"Negativo", "pago servicios","Stiven");

        //Impresion de los datos de la Empresa
        System.out.println(empresa);

        //Modificacion de los datos de la Empresa
        empresa.setNombre("TripleAAA");
        empresa.setDireccion("diagonal 32");
        empresa.setNumero(5101002);
        empresa.setNit(64567);

        //Impresion de los datos modificados de la empresa
        System.out.println("Datos modificados" + "\n" + empresa);

        //Impresion de los datos del empleado
        System.out.println(empleado);

        // Modificacion de los datos del empelado
        empleado.setNombreempleado("Brayan");
        empleado.setCorreoempleado("brayan@gmail.com");
        empleado.setEmpresaempleado("TripleAAA");
        empleado.setRol("Operativo");

        //Impresion de los datos modificados
        System.out.println("Datos modificados empleado" + "\n" +empleado );

        // Impresion del movimiento de dinero
        System.out.println(md);

        //Mofificacion de los movimiento de dinero
        md.setMontomovimiento(300000);
        md.setTipomovimiento("Positivo");
        md.setConceptomovimiento("venta de muebles");
        md.setEncargadomovimiento("Brayan");

        System.out.println("Datos modificados del movimiento de dinero" + "\n" + md);










    }
}