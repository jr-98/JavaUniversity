
import javax.swing.JOptionPane;

public class Utilidades {

    public static int presentarMenuPrincipal() {
        String menu = "1 Calcular Área\n"
                + "2 Calcular Perímetro\n"
                + "3 Salir";
        int option1 = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Area y Perimetro", JOptionPane.INFORMATION_MESSAGE));
        return option1;
    }

    public static int presentarMenuAreas() {
        String menu = "1 Area de un Círculo\n"
                    + "2 Area de un Rectángulo\n"
                    + "3 Area de un Triángulo\n"
                    + "4 Salir";
    int option2 = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Área de figuras geométricas", JOptionPane.INFORMATION_MESSAGE));
        return option2;
    }
    public static int presentarMenuPerimetros() {
        String menu = "1 Perímetros de un Círculo\n"
                    + "2 Perímetros de un Rectángulo\n"
                    + "3 Perímetros de un Triángulo\n"
                    + "4 Salir";
    int option3 = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Área de figuras geométricas", JOptionPane.INFORMATION_MESSAGE));
        return option3;
    }
}
