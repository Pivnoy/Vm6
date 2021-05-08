import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Printer {

    private final MathContext context = new MathContext(3, RoundingMode.HALF_UP);

    public void printMatrix(Matrix matrix) {
        if (matrix != null) {
            for (int i = 0; i < matrix.getSize(); i++) {
                for (int j = 0; j < matrix.getSize(); j++) {
                    System.out.print(new BigDecimal(matrix.getMatrix()[i][j], context));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public void printRes(double [][] arr){
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(new BigDecimal(arr[i][j], context));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

}
