import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Clases intancias Empresa,Empleado,MovimientoDeDinero
        Empresa empresa = new Empresa("Lolitas","Calle 48 sur",123,123456);
        Empleado empleado = new Empleado();
        MovimientoDeDinero md = new MovimientoDeDinero();

        //Impresion de los datos de la Empresa
        System.out.println(empresa);

        //Modificacion de los datos de la Empresa
        empresa.setNombre("TripleAAA");
        empresa.setDireccion("diagonal 32");
        empresa.setNumero(5101002);
        empresa.setNit(64567);

        //Impresion de los datos modificados de la empresa
        System.out.println("Datos modificados" + "\n" + empresa);


    }
}