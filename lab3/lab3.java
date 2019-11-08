
class lab3
{
public static void main(String args[])
{
    Complex complex = new Complex();
    complex.test();
    if(args.length > 2)
    { 
        System.out.println("////Rownanie kwadratowe////"); 
        Double a = new Double(args[0]);
        Double b = new Double(args[1]);
        Double c = new Double(args[2]);
        double delta = b*b - 4 * a * c;  
        Complex x1 = Complex.add(new Complex(-b/(2*a)),Complex.divide(Complex.sqrt(delta),new Complex(2*a)));
        Complex x2 = Complex.subtract(new Complex(-b/(2*a)),Complex.divide(Complex.sqrt(delta),new Complex(2*a)));
        System.out.println(x1); 
        System.out.println(x2);
    }
}
}


