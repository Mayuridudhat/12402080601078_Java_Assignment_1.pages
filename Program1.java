import java.util.Scanner;

class ArrayOperations {
    int arr[];
    int n;

    ArrayOperations(int size) {
        n = size;
        arr = new int[n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void reverse() {
        System.out.print("Reversed Array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        display();
    }

    void search(int key) {
        boolean found = false;
        for (int i = 0; i < n; i++) { // Fixed the typo 'or' to 'for'
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    void average() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Average: " + avg);
    }

    void maximum() {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
} // Moved the closing brace for the class down here

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        ArrayOperations obj = new ArrayOperations(n);
        obj.input();
        
        System.out.print("Original Array: ");
        obj.display();
        
        obj.reverse();
        obj.sort();
        
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.search(key);
        
        obj.average();
        obj.maximum();
        
        sc.close(); // Added sc.close() as a best practice to prevent memory leaks
    }
}