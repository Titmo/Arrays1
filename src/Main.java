import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2_1();
        task2_2();
        task3();
        task4_1();
        task4_2();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        double [] arrays1 = {1.57, 7.654, 9.986};

        int [] arrays2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < arrays1.length; i++) {
            System.out.println(arrays1[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < arrays2.length; i++) {
            System.out.print(arrays2[i]+" ");
        }
    }


    public static void task2_1 () {
        System.out.println("\nЗадача 2 (Первый вариант)");
        int [] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        double [] arrays1 = {1.57, 7.654, 9.986};

        int [] arrays2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arrays.length; i++) {
            if (i == arrays.length-1) {
                System.out.print(arrays[i]);
            } else {
                System.out.print(arrays[i]+", ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arrays1.length; i++) {
            if (i == arrays1.length-1) {
                System.out.print(arrays1[i]);
            } else {
                System.out.print(arrays1[i]+", ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arrays2.length; i++) {
            if (i == arrays2.length-1) {
                System.out.print(arrays2[i]);
            } else {
                System.out.print(arrays2[i]+", ");
            }
        }
    }
    public static void task2_2 () {
        System.out.println("\nЗадача 2 (Второй вариант)");
        int [] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        double [] arrays1 = {1.57, 7.654, 9.986};

        int [] arrays2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.toString(arrays1));
        System.out.println(Arrays.toString(arrays2));
    }
    public static void task3 () {
        System.out.println("\nЗадача 3");
        int [] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        double [] arrays1 = {1.57, 7.654, 9.986};

        int [] arrays2 = {1,2,3,4,5,6,7,8,9};

        for (int i = arrays.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrays[i]);
            } else {
                System.out.print(arrays[i]+", ");
            }
        }
        System.out.print("\n");
        for (int i = arrays1.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrays1[i]);
            } else {
                System.out.print(arrays1[i]+", ");
            }
        }
        System.out.print("\n");
        for (int i = arrays2.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrays2[i]);
            } else {
                System.out.print(arrays2[i]+", ");
            }
        }

    }

    public static void task4_1 () {
        System.out.println("\nЗадача 4 (Первый вариант)");
        int [] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                System.out.print(arrays[i] + " ");
            } else {
                System.out.print((arrays[i]+1) + " ");
            }
        }
    }
    public static void task4_2 () {
        System.out.println("\nЗадача 4 (Второй вариант)");
        int [] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                arrays[i]=arrays[i]+1;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
