package arithmeticexp;


public enum Operation {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');
    final char sign;
    public char getSign(){
    return this.sign;
            }
    Operation(char sign){
    this.sign=sign;}
}

