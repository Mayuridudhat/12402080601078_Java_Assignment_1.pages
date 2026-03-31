public class Program3 {
    public static void main(String[] args) {
        
        System.out.println("=== Wrapper Class Demo ===");

        // 1. Integer Wrapper & Conversions
        int num = 10;
        Integer obj = num; // Autoboxing: primitive 'int' to 'Integer' object
        System.out.println("Primitive int: " + num);
        System.out.println("Integer Object: " + obj);

        int num2 = obj; // Unboxing: 'Integer' object back to primitive 'int'
        System.out.println("Unboxed int: " + num2);

        // Converting String to primitive int
        String strNum = "123";
        int converted = Integer.parseInt(strNum);
        System.out.println("String to int: " + converted);

        // 2. Double Wrapper
        double d = 10.5;
        Double dObj = d; // Autoboxing: primitive 'double' to 'Double' object
        System.out.println("\nDouble Object: " + dObj);

        // 3. Character Wrapper (Added to fulfill requirements)
        char letter = 'A';
        Character charObj = letter; // Autoboxing: primitive 'char' to 'Character' object
        System.out.println("Character Object: " + charObj);
        // Demonstrating a useful method from the Character wrapper class
        System.out.println("Is the character a letter? " + Character.isLetter(charObj));


        System.out.println("\n=== String vs StringBuffer ===");

        // --- String Demonstration (Immutable) ---
        String s1 = "Hello";
        s1 = s1 + " World"; // This actually creates a brand new String object in memory
        System.out.println("String reassigned: " + s1);

        String s = "Test";
        s.concat("ing"); // This creates "Testing", but doesn't change 's' because Strings are immutable
        System.out.println("String after concat (Notice it is unchanged): " + s);


        // --- StringBuffer Demonstration (Mutable) ---
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // This modifies the original object directly without creating a new one
        System.out.println("\nStringBuffer: " + sb);

        StringBuffer sb2 = new StringBuffer("Test");
        sb2.append("ing"); // Modifies the original object directly
        System.out.println("StringBuffer after append (Notice it changed): " + sb2);
    }
}