public class homeWork4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");

            }
            for (int l = 0; l < 5-(i+1); l++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}