import java.math.BigDecimal;

public class Checker {

    public boolean resultChecker(double [][] res){
        for (int i = 0; i < res.length; ++i){
            for (int j = 0; j < res[i].length; j++) {
                if (Double.isNaN(res[i][j])) return false;
            }
        }
        return true;
    }
}
