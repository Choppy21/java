package recursividad;

//Angel Gabriel Aguirre Rosell
public class invertir {
    public static String invertirC(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return invertirC(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        String cadena = "Hola como estan?";
        System.out.println(invertirC(cadena));
    }
}
