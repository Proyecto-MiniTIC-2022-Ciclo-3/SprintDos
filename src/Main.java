import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empresa empre = new Empresa();

        empre.Leerdatos();
        empre.modificar();

        System.out.println("El nombre de la empresa es: " + empre.getNombre());
        System.out.println("la dirección de la empresa es: " + empre.getDireccion());
        System.out.println("El numero telefonico de la empresa es: " + empre.getNumero());
        System.out.println("El NIT de la empresa es: " + empre.getNit());

        //JOptionPane.showMessageDialog(null,"El nombre de la empresa es: " + empre.getNombre());

        //empre.setNombre(JOptionPane.showInputDialog("Digite el nombre de la empresa: "));
        //System.out.println("El nombre de la empresa es: " + empre.getNombre());




    }
}