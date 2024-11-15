public class Tablasdemultiplicar {
    public static void main(String[] args) {
        int maxNumber = 10;
        for (int j = 1; j <= maxNumber; j++) {
            for (int i = 1; i <= maxNumber; i++) {
                System.out.printf("%2d x %2d = %2d   ", i, j, i * j);
            }
            System.out.println();
        }
    }
}