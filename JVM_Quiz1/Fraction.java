public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public void printFraction() {
        System.out.println(this.numerator + "/" + this.denominator);

    }
    //Third
    public void reduced(int a){
        if(this.numerator % a == 0 && this.denominator  % a == 0){
            System.out.println(this.numerator/a + "/" + this.denominator/a);

        }else{
            System.out.println("This fraction can't be reduced by" + a);
        }

    }
    public void sum(int a, int b){
        if(b == this.denominator){
            System.out.println(this.numerator + a + "/" + b);

        }else{
            int c = this.numerator*b;
            int d = a * this.denominator;
            int e = b * this.denominator;
            System.out.println(c + d + "/" + e);
        }

    }
    public void multiply(int a, int b){
        System.out.println(this.numerator * a + "/" + this.denominator * b);
    }


}