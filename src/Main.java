import functions.parsers.FunctionParser;

public class Main {
    public static void main(String[] args)  {
        FunctionParser a = new FunctionParser("1+4*2^0", 'x');
        System.out.println(a.parseFunction().getValueAt(0));
        System.out.println(a.parseFunction().toString());
    }

}
