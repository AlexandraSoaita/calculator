package EndavaCalculator;

public enum Operator {

    ADD("\\+"), //in paranteze sunt constructori
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    PARANTHESES("(", ")");

    private String sign;
    private String startSign;
    private String endSign;

    private Operator(String sign) {  //constructorii in enum sunt private
        this.sign = sign;
    }

    private Operator(String startSign, String endSign) {
        this.startSign = startSign;
        this.endSign = endSign;

    }


    public String getSign() {
        return sign;
    }

    public String getStartSign() {
        return startSign;
    }

    public String getEndSign() {
        return endSign;
    }

    public static Operator[] getValues() { //ordinea operatiilor
        return new Operator[]{PARANTHESES, ADD, SUBTRACT, MULTIPLY, DIVIDE};
    }
}
