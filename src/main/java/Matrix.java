import java.util.Arrays;
import java.util.Objects;

public class Matrix {

    private double [][] matrix;
    private int size;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.size = matrix.length;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return size == matrix1.size &&
                Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", size=" + size +
                '}';
    }
}
