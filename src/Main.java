import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empresa empre = new Empresa();

        empre.Leerdatos();
        empre.modificar();

        System.out.println(empre);






        //JOptionPane.showMessageDialog(null,"Desea modificar los datos");

        //empre.setNombre(JOptionPane.showInputDialog("Digite el nombre de la empresa: "));
        //System.out.println("El nombre de la empresa es: " + empre.setDireccion());






    }
}