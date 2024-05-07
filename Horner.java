import java.util.Scanner;

public class Horner {
    private int base;
    private int mod;

    public static void main(String[] args) {
        Horner horner = new Horner(31, 1000000007); // Base and mod
        String key = menu();
        int hashValue = horner.hash(key);
        System.out.println("The hash value of ' " + key + " ' is " + hashValue);
    }

    public Horner(int base, int mod) {
        this.base = base;
        this.mod = mod;
    }

    public int hash(String key) {
        // Horner's rule
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * base + key.codePointAt(i)) % mod;
        }
        return hash;
    }

    private static String menu() {
        // Get user input
        System.out.println("Enter a string to hash: ");
        Scanner userInput = new Scanner(System.in);
        String key = userInput.nextLine();
        return key;
    }
}