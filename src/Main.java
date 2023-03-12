import java.util.Arrays;
import java.util.Locale;

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

            int min = array[0];
            for (int i = 0; i < array.length; i++){
                if (min > array[i]) min = array[i];
            }

            System.out.printf("Min is %d%n", min);
            System.out.printf("Min is %d%n", Arrays.stream(array).min().getAsInt());

            System.out.println("=========================================");

            int arithmeticMean = sum / array.length;

            System.out.printf("Arithmetic mean is %d%n", arithmeticMean);
        }
        else System.out.println("Array is empty");

        System.out.println("=========================================");

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        sum = 0;
        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                sum += array2[i][j];
            }
        }

        System.out.printf("Sum is %d%n", sum);

        System.out.println("=========================================");

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                if (array2[i][j] > max) max = array2[i][j];
            }
        }

        System.out.printf("Max is %d%n", max);

        System.out.println("=========================================");

        int numberOfElements = 0;
        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                numberOfElements++;
            }
        }

        System.out.printf("Number of elements is %d%n", numberOfElements);

        System.out.println("=========================================");

        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'о') System.out.print("о");
        }

        System.out.println();
        System.out.println("=========================================");

        s = "Перевыборы выбранного президента";

        int numberOfE = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'е') numberOfE++;
        }

        System.out.println(numberOfE);

        System.out.println("=========================================");

        s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase(Locale.ROOT);

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'р' && s.charAt(i + 1) == 'и' && s.charAt(i + 2) == 'т') System.out.printf("%d; ", i);
        }

        System.out.println();
        System.out.println("=========================================");

        String[][] array3 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        numberOfE = 0;
        for (int i = 0; i < array3.length; i++){
            for (int j = 0; j < array3[i].length; j++){
                for (int k = 0; k < array3[i][j].length(); k++){
                    if (array3[i][j].charAt(k) == 'е') numberOfE++;
                }
            }
        }
        System.out.println(numberOfE);

        System.out.println("=========================================");

        int[][] array4 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int t = 0;
        for (int i = 0; i < array4.length; i++){
            for (int j = i + 1; j < array4[i].length; j++){
                t = array4[i][j];
                array4[i][j] = array4[j][i];
                array4[j][i] = t;
            }
        }

        System.out.println(Arrays.toString(array4[0]));
        System.out.println(Arrays.toString(array4[1]));
        System.out.println(Arrays.toString(array4[2]));

        System.out.println("=========================================");

        System.out.println('y' - 't');

        String cripted =  "myyux?44|||3gz~rjfhtkkjj3htr4XjwljnI";
        String encripted = "";
        for (int i = 0; i < cripted.length(); i++){
            char c =(char)(cripted.charAt(i) - 5);
            encripted = encripted + c;
        }

        System.out.println(encripted);

        cripted =  "^tz%fwj%f|jxtrj&%^tz%ini%ny&%Otns%tzw%yjfr&%Fqj}%Qjt3%Ny%nx%szrgjw%;%ns%ymj%qnxy%tk%lwtzux";
        encripted = "";
        for (int i = 0; i < cripted.length(); i++){
            char c =(char)(cripted.charAt(i) - 5);
            encripted = encripted + c;
        }

        System.out.println(encripted);
    }
}