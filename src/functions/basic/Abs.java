package functions.basic;

import functions.Function;

public class Abs implements Function {
    @Override
    public double getValueAt(double x) {
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return "|x|";
    }
}
