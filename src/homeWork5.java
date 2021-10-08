public class homeWork5 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");

            }
            for (int l = 0; l < i + 1; l++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        for (int s = 0; s < 3; s++) {
            for (int t = 0; t < s+2; t++) {
                System.out.print(" ");

            }
            for (int v = 0; v < 3-s; v++) {
                System.out.print(" *");

            }
            System.out.println();

        }
    }
}


