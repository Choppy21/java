package recursividad;

//Angel Gabriel Aguirre Rosell
public class fibonacci {
    public static int fibonacc(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacc(n - 1) + fibonacc(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // número
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacc(i));
        }
    }
}
