import javax.inject.Inject;
import java.util.Arrays;

public class CholeskyDecomposer {

    private final Printer printer = new Printer();

    public void matrixDecomposition(Matrix matrix)
    {
        double[][] resMatrix = new double[matrix.getSize()][];
        for (int i = 0; i < matrix.getSize(); i++)
        {
            resMatrix[i] = new double[i + 1];
            double temp;
            for (int j = 0; j < i; j++)
            {
                temp = 0;
                for (int k = 0; k < j; k++)
                {
                    temp += resMatrix[i][k] * resMatrix[j][k];
                }
                resMatrix[i][j] = (matrix.getMatrix()[i][j] - temp) / resMatrix[j][j];
            }

            temp = matrix.getMatrix()[i][i];
            for (int k = 0; k < i; k++)
            {
                temp -= resMatrix[i][k] * resMatrix[i][k];
            }
            resMatrix[i][i] = Math.sqrt(temp);
        }

        printer.printRes(resMatrix);
    }
}
