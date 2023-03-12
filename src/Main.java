import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Sum is %d%n", Arrays.stream(array).sum());

        System.out.println("=========================================");

        if (array.length > 0){
            int max = array[0];
            for (int i = 0; i < array.length; i++){
                if (max < array[i]) max = array[i];
            }

            System.out.printf("Max is %d%n", max);
            System.out.printf("Max is %d%n", Arrays.stream(array).max().getAsInt());

            System.out.println("=========================================");
        }
    }
}