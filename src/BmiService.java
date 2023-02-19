public class BmiService {


    public double calculate(double m, double h) { // m - масса в килограммах, h - рост в метрах

        double result = m / Math.pow(h, 2);
        return result;
    }

}
