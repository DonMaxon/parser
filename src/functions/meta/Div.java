package functions.meta;
// частное функций
import functions.Function;

public class Div implements Function {
    private final Function f, g;
    public Div(Function f1, Function g1) {
        f = f1;
        g = g1;
    }
    @Override
    public double getValueAt(double x) {
        if (g.getValueAt(x) != 0)
            return f.getValueAt(x) / g.getValueAt(x);
        else
            throw new IllegalArgumentException("Деление на 0! (Division by zero)");
    }

    @Override
    public String toString() {
        return "(" + f.toString() + ")" + " / " + "(" + g.toString() + ")";
    }
}
