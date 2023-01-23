public class Exer22 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 1, 4};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min);
    }
}

