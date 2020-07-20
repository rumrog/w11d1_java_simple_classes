public class Calculator {
    private int num1;
    private int num2;
    private double num3;
    private double num4;

    public Calculator(int num1, int num2, double num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public double getNum3() {
        return this.num3;
    }

    public double getNum4() {
        return this.num4;
    }

    public int addNums() {
        return this.num1 + this.num2;
    }

    public int subNums() {
        return this.num1 - this.num2;
    }

    public int multNums() {
        return this.num1 * this.num2;
    }

    public double divNums() {
        return this.num3 / this.num4;
    }
}
