import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Clases intancias Empresa,Empleado,MovimientoDeDinero
        Empresa empresa = new Empresa("Lolitas","Calle 48 sur",123,123456);
        Empleado empleado = new Empleado("Stiven","Stiven@gmail.com",empresa,"Administrador");
        MovimientoDeDinero md = new MovimientoDeDinero(1000000,"Negativo", "pago servicios",empleado);

        //Impresion de los datos de la Empresa
        System.out.println(empresa);

        //Impresion de los datos del empleado
        System.out.println(empleado);

        // Impresion del movimiento de dinero
        System.out.println(md);

        //Modificacion de los datos de la Empresa
        empresa.setNombreEmpresa("AAA");
        empresa.setDireccionEmpresa("diagonal 32");
        empresa.setNumeroEmpresa(5101002);
        empresa.setNitEmpresa(64567);

        //Impresion de los datos modificados de la empresa
        System.out.println("Datos modificados" + "\n" + empresa);

        // Modificacion de los datos del empelado
        empleado.setNombreEmpleado("Brayan");
        empleado.setCorreoEmpleado("brayan@gmail.com");
        empleado.setRolEmpleado("Operativo");

        //Impresion de los datos modificados
        System.out.println("Datos modificados empleado" + "\n" +empleado );

        //Mofificacion de los movimiento de dinero
        md.setMontoMovimiento(300000);
        md.setTipoMovimiento("Positivo");
        md.setConceptoMovimiento("venta de muebles");

        //Impresion de los datos modificados
        System.out.println("Datos modificados del movimiento de dinero" + "\n" + md);





    }
}