package arithmeticexp;

import static java.lang.Character.isDigit;

public class ArithmeticExpression {

    private Operation op;
    private double lhs;
	private double rhs;

    @Override
    public String toString() {
        return "" + op + " lhs: " + lhs + " rhs: " + rhs;
    }

    // parse: create and return a simple arithmetic 
    // expression resulting from parsing the given String
    public static ArithmeticExpression parse(String s) {
        s = s.replaceAll("\\s", "");
        char hold[] = s.toCharArray();
        char sign[] = {'+', '-', '*', '/'};
        char signChar = 0;
        double x = 0, y = 0;
        String sl="0", sr="0";
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < sign.length; j++) {
                if (hold[i] == sign[j] && isDigit(hold[i - 1])) {
                    signChar = sign[j];
                    sl = s.substring(0, (i));
                    x = Double.parseDouble(sl);
                    sr = s.substring(i+1);
                    y = Double.parseDouble(sr);
                    break;
                }
            }
        }
        switch (signChar) {
        case '+':
        	return (new ArithmeticExpression(Operation.ADDITION, x, y));
        case '-':
        	return (new ArithmeticExpression(Operation.SUBTRACTION, x, y));
        case '/':
        	return (new ArithmeticExpression(Operation.DIVISION, x, y));
        case '*':
        	return (new ArithmeticExpression(Operation.MULTIPLICATION, x, y));
        }
		return null ;

    
	}
    public ArithmeticExpression(Operation op,
            double lhs, double rhs) {
        this.op = op;
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
