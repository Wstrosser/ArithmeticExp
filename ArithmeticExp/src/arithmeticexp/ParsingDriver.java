/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexp;
public class ParsingDriver {
    public static void main(String [] args) {
        String sa = "2+2";
        String sb = "3-5";
        String sc = "100.0*8";
        String sd = "5.1/6.9";
        
        ArithmeticExpression a = ArithmeticExpression.parse(sa);
        ArithmeticExpression b = ArithmeticExpression.parse(sb);
        ArithmeticExpression c = ArithmeticExpression.parse(sc);
        ArithmeticExpression d = ArithmeticExpression.parse(sd);
        
        System.out.println(sa + "\t\t" + a);
        System.out.println(sb + "\t\t" + b);
        System.out.println(sc + "\t\t" + c);
        System.out.println(sd + "\t\t" + d);
        
        // optional - extra credit
        // these tougher to parse expressions can be omitted
        String se = "-1+2";
        String sf = "-1.0--1";
        String sg = " 1 + - 2.0 ";
        
        ArithmeticExpression e = ArithmeticExpression.parse(se);
        ArithmeticExpression f = ArithmeticExpression.parse(sf);
        ArithmeticExpression g = ArithmeticExpression.parse(sg);
        
        System.out.println(se + "\t\t" + e);
        System.out.println(sf + "\t\t" + f);
        System.out.println(sg + "\t" + g);
    }
} 
