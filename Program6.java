import java.util.Scanner;

// Abstract class
abstract class Cipher {
    abstract String encrypt(String text);
    abstract String decrypt(String text);
}

// Derived class (Caesar Cipher)
class CaesarCipher extends Cipher {
    int shift;

    CaesarCipher(int s) {
        shift = s;
    }

    // Encryption
    String encrypt(String text) {
        String result = "";

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char)((ch - base + shift) % 26 + base);
            }

            result += ch;
        }
        return result;
    }

    // Decryption
    String decrypt(String text) {
        String result = "";

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char)((ch - base - shift + 26) % 26 + base);
            }

            result += ch;
        }
        return result;
    }
}

// Main class
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        CaesarCipher obj = new CaesarCipher(shift);

        String encrypted = obj.encrypt(text);
        System.out.println("Encrypted Text: " + encrypted);

        String decrypted = obj.decrypt(encrypted);
        System.out.println("Decrypted Text: " + decrypted);
    }
}