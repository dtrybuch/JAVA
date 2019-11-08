public class Complex
{
    double re, im;
    static Complex I,ZERO,ONE;
    static{I = new Complex (0,1); ZERO = new Complex(0,0); ONE = new Complex(1,0);}
    Complex(){}
    Complex(double re)
    {
        this.re = re;
    }
    Complex(double re , double im)
    {
        this.re = re;
        this.im = im;
    }
    public String toString()
    {
        if(re == 0) 
        {
            if(im ==0) return new String("" + re);
            return new String("" + im +"i");
        } 
        else if(im == 0) return new String("" + re);
        else if(im < 0) return new String("" + re + " - " + -im +"i");
        return new String("" + re + " + " + im +"i");
    } 
    public double getRe() 
    {
        return re;
    }
    public double getIm() 
    {
        return im;
    }
    static public Complex add(Complex first, Complex second)
    {
        return new Complex(first.re + second.re, first.im + second.im);
    }
    static public Complex subtract(Complex first, Complex second)
    {
        return new Complex(first.re - second.re, first.im - second.im);
    }
    static public Complex multiply(Complex first, Complex second)
    {
        double tmp_re = first.re * second.re - first.im * second.im;
        double tmp_im = first.im * second.re + first.re * second.im;
        return new Complex(tmp_re, tmp_im);
    }
    static public Complex multiply(Complex first, double figure)
    {
        double tmp_re = first.re * figure;
        double tmp_im = first.im * figure;
        return new Complex(tmp_re, tmp_im);
    }
    static public Complex divide(Complex first, Complex second)
    {
        double tmp_re = (first.re * second.re + first.im * second.im)/(second.re * second.re + second.im * second.im);
        double tmp_im = (first.im * second.re - first.re * second.im)/(second.re * second.re + second.im * second.im);
        return new Complex(tmp_re, tmp_im);
    }
    public double mod()
    {
        return Math.sqrt(re*re + im*im);
    }
    public void conjugate()
    {
        im = -im;
    }
    public void opposite()
    {
        re = -re;
        im = -im;
    }
    public static Complex sqrt(double value)
    {
        if(value >= 0) return new Complex(Math.sqrt(value));
        else return new Complex(0,Math.sqrt(-value));
    }
    public boolean equals(Complex second)
    {
        if(re == second.re && im == second.im) return true;
        else return false;
    }
    public void test() {
        // Wykorzystanie konstruktorów:
        Complex c1 = new Complex(2.5, 13.1);
        Complex c2 = new Complex(-8.5, -0.9);
        System.out.println(c1); // 2.5 + 13.1i
        System.out.println(c2); // -8.5 - 0.9i
        System.out.println(new Complex(4.5)); // 4.5
        System.out.println(new Complex()); // 0.0
        System.out.println(new Complex(0, 5.1)); // 5.1i
        System.out.println();

        // Stałe typu Complex:
        System.out.println(Complex.I); // 1.0i
        System.out.println(Complex.ZERO); // 0.0
        System.out.println(Complex.ONE); // 1.0
        System.out.println();

        // Wykorzystanie metod zwracających wynik obliczeń:
        System.out.println("Re(c1) = " + c1.getRe()); // Re(c1) = 2.5
        System.out.println("Im(c1) = " + c1.getIm()); // Im(c1) = 13.1
        System.out.println("c1 + c2 = " + Complex.add(c1, c2)); // c1 + c2 = -6.0 + 12.2i
        System.out.println("c1 - c2 = " + Complex.subtract(c1, c2)); // c1 - c2 = 11.0 + 14.0i
        System.out.println("c1 * c2 = " + Complex.multiply(c1, c2)); // c1 * c2 = -9.46 - 113.6i
        System.out.println("c1 * 15.1 = " + Complex.multiply(c1, 15.1)); // c1 * 15.1 = 37.75 + 197.81i
        System.out.println("c1 / c2 = " + Complex.divide(c1, c2)); // c1 / c2 = -0.4522310429783739 - 1.4932931836846426i
        System.out.println("|c1| = " + c1.mod()); // |c1| = 13.336416310238668
        System.out.println("sqrt(243.36) = " + Complex.sqrt(243.36)); // sqrt(243.36) = 15.6
        System.out.println("sqrt(-243.36) = " + Complex.sqrt(-243.36)); // sqrt(-243.36) = 15.6i
        Complex c3 = new Complex(2.5, 13.1);
        System.out.println(c1.equals(c2)); // false
        System.out.println(c1.equals(c3)); // true
        // Poniższe wywołanie - dla chętnych :)
        //System.out.println(c1.equals("test ze zlym obiektem")); // false
        System.out.println();

        // Metoda zamieniająca liczbę na jej sprzężenie:
        c1.conjugate();
        System.out.println("c1* = " + c1); // c1* = 2.5 - 13.1i

        // Metoda zamieniająca liczbę na przeciwną:
        c1.opposite();
        System.out.println("-c1 = " + c1); // -c1 = -2.5 + 13.1i
    }
}