public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] weights = new int[12];
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        weights[1] = 26;
        int febuaryWeight = weights[1];
        System.out.println(febuaryWeight);
        weights[2] = 69;
        int marchWeight = weights[2];
        System.out.println(marchWeight);
        int january = 0;
        System.out.println(weights[january]);
        task1();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1/2:");
        int[] tabler1 = new int[]{1, 0, 0};
        int one = tabler1[0];
        tabler1[1] = 2;
        int two = tabler1[1];
        tabler1[2] = 3;
        int tree = tabler1[2];

        for(int i = 0; i < tabler1.length; ++i) {
            System.out.print(tabler1[i]);
            if (i < tabler1.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        double[] tabler2 = new double[]{1.57, 7.654, 9.986};

        for(int i = 0; i < tabler2.length; ++i) {
            System.out.print(tabler2[i]);
            if (i < tabler2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        int[] tabler3 = new int[]{1, 2, 3};
        tabler3[0] = 100;
        tabler3[1] = 200;
        tabler3[2] = 300;

        int i;
        for(i = 0; i < tabler3.length; ++i) {
            System.out.print(tabler3[i]);
            if (i < tabler3.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Task 3:");

        for(i = tabler1.length - 1; i >= 0; --i) {
            System.out.print(tabler1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for(i = tabler2.length - 1; i >= 0; --i) {
            System.out.print(tabler2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for(i = tabler3.length - 1; i >= 0; --i) {
            System.out.print(tabler3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Task 4: ");
    }

    public static void task4() {
        System.out.println("Task 4: ");
        int[] tabler1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int i;
        for(i = 0; i < tabler1.length; ++i) {
            if (tabler1[i] % 2 != 0) {
                int var10002 = tabler1[i]++;
            }
        }

        for(i = 0; i < tabler1.length; ++i) {
            System.out.print(tabler1[i]);
            if (i < tabler1.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}