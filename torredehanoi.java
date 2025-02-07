package recursividad;

//Angel Gabriel Aguirre Rosell
public class torredehanoi {
    public static void hanoi(int n, char source, char auxiliary, char target) {
        if (n > 0) {
            hanoi(n - 1, source, target, auxiliary);
            System.out.println("Mueve el disco " + n + " desde " + source + " a " + target);
            hanoi(n - 1, auxiliary, source, target);
        }
    }

    public static void main(String[] args) {
        int n = 3; // número
        hanoi(n, 'A', 'B', 'C');
    }
}
