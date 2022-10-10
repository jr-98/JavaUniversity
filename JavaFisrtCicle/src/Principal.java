
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        boolean continuar = true;
        boolean continuar1 = true;
        boolean continuar2 = true;

        do {
            int option = Utilidades.presentarMenuPrincipal();
            switch (option) {
                case 1://Area
                    int option2 = Utilidades.presentarMenuAreas();
                    switch (option2) {
                        case 1://circulo
                            double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo"));
                            Circulo cir = new Circulo(radio);
                            JOptionPane.showMessageDialog(null, "El area del circulo es:\n" + cir.area() + "cm2");
                            break;
                        case 2://rectangulo
                            double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectángulo"));
                            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectángulo"));
                            Rectangulo rec = new Rectangulo(base, altura);
                            JOptionPane.showMessageDialog(null, "El area del rectangulo  es:\n" + rec.area() + "cm2");
                            break;
                        case 3://triangulo
                            double baser = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo"));
                            double alturar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo"));
                            double hipotenusa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la hipotenusa del triangulo"));
                            Triangulo trg = new Triangulo(baser, alturar, hipotenusa);
                            JOptionPane.showMessageDialog(null, "El area del rectangulo  es:\n" + trg.area() + "cm2");
                            break;
                        case 4://salir
                            continuar1 = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Eliga un opcion válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 2: //perimetro
                    int option3 = Utilidades.presentarMenuPerimetros();
                    switch (option3) {
                        case 1://circulo
                            double perimetro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo"));
                            Circulo per = new Circulo(perimetro);
                            JOptionPane.showMessageDialog(null, "El areperimetro del circulo es:\n" + per.perimetro() + "cm");
                            break;
                        case 2://rectangulo
                            double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectángulo"));
                            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectángulo"));
                            Rectangulo rec = new Rectangulo(base, altura);
                            JOptionPane.showMessageDialog(null, "El perimetro del rectangulo  es:\n" + rec.perimetro() + "cm");
                            break;
                        case 3://triangulo
                            double baser = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo"));
                            double alturar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo"));
                            double hipotenusa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la hipotenusa del triangulo"));
                            Triangulo trg = new Triangulo(baser, alturar, hipotenusa);
                            JOptionPane.showMessageDialog(null, "El perimetro del triangulo es:\n" + trg.perimetro() + "cm");
                            break;
                        case 4://salir
                            continuar2 = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Eliga un opcion válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 3://salir
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Eliga un opcion válida", "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } while (continuar);

    }
}
