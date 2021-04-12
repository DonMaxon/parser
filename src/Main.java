import functions.parsers.FunctionParser;

public class Main {
    public static void main(String[] args)  {
        String s = "arccot(x)";

        FunctionParser a = new FunctionParser(s, 'x');
        System.out.println(s);
        System.out.println(a.parseFunction().getValueAt(0));
    }

}
