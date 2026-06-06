package star_pattern;

public class pattern3 {
    public static void main(String[] args) {
        int size = 20; // controls the heart size

        // Upper part of the heart
        for (int i = size / 2; i <= size; i += 2) {
            // Left spacing
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            // Left half of heart
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            // Middle spacing
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Right half of heart
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        // Lower part of the heart
        for (int i = size; i >= 1; i--) {
            // Left spacing
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // Bottom triangle
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
