import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int rows = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Matris elemanlarını girin:");

        // Matrisin elemanlarını kullanıcıdan alın
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpozunu bulmak için yeni bir matris oluştur
        int[][] transposeMatrix = new int[columns][rows];

        // Matrisin transpozunu hesapla
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Transpozunu ekrana yazdır
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
