package functions.basic;
//тангенс
public class Tan extends Trig{
    @Override
    public double getValueAt(double x) {
        return Math.tan(x);
    }

    @Override
    public String toString() {
        return "tg(x)";
    }
}
