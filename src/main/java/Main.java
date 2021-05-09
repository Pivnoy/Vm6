import javax.inject.Inject;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MatrixFab matrixFab = new MatrixFab();
        CholeskyDecomposer choleskyDecomposer = new CholeskyDecomposer();
        Printer printer = new Printer();
        Matrix matrix;

        Scanner sc = new Scanner(System.in);
        System.out.println("Лабораторная работа №6\nМетод разложения Холецкого");

        System.out.println("Лабораторная работа №1\n" +
                "Выберите режим работы\n" +
                "1 - ввод из файла\n" +
                "2 - ввод с клавиатуры\n");

        try {
            String s = sc.nextLine();
            int val = Integer.parseInt(s);
            if (val == 1){
                System.out.println("Вы выбрали ввод из файла\nВведите путь к файлу");
                String fileName = sc.nextLine();
                matrix = matrixFab.readMatrixFromFile(fileName);
                System.out.println("Исходная матрица");
                printer.printMatrix(matrix);
                choleskyDecomposer.matrixDecomposition(matrix);
            } else if (val == 2){
                System.out.println("Вы выбрали ввод с клавиатуры");
                matrix = matrixFab.createMatrixFromKeyBoard();
                System.out.println("Исходная матрица");
                printer.printMatrix(matrix);
                choleskyDecomposer.matrixDecomposition(matrix);
            } else {
                System.out.println("Неизветсная команда");
            }
        } catch (NumberFormatException e){
            System.out.println("Неверный формат ввода");
        }
    }
}
