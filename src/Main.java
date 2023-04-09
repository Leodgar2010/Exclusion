
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 1, 3};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = diffarr(arr1, arr2);
        float [] arr4 = dividearr(arr1, arr2);
        printarrint(arr3);
        System.out.println();
        printarrfloat(arr4);

    }
    // в следующем методе обрабатывается одно исключение - не совпадение длины массивов
    public static int[] diffarr(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
    // в следующем методе обрабатывается два исключения - не совпадение длины массивов и
    // деление на ноль
    public static float [] dividearr(int[] arr1, int[] arr2) {
        float [] result = new float [arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("На ноль делить нельзя");
            }

            result[i] =  (float) (arr1[i]) / (arr2[i]);
        }
        return result;
    }

    public static void printarrint(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void printarrfloat(float[] arr) {
        for (float v : arr) {
            System.out.print(v + " ");
        }
    }
}