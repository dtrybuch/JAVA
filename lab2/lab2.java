import java.math.BigInteger;
class lab2
{
public static void main(String args[])
{
    if(args.length>0)
    {
        
        String key = args[0];
        Integer p = 397;
        Integer q = 103;
        Integer n = p*q;
        Integer fi = (p-1)*(q-1);
        Integer e = 2;
        Integer d;
        BigInteger arrayOfNumbers[] = new BigInteger[key.length()];
        while(NWD(e,fi)!=1)
        {   
            e++;
        }
        System.out.println(e);
        d = ExtendedEuclid(e,fi);
        System.out.println(d);
        for(int i = 0;i<key.length();i++)
        {
            arrayOfNumbers[i] = new BigInteger(""+(int)key.charAt(i));
        }
        BigInteger codedText[] = new BigInteger[key.length()]; 
        for( int i = 0; i < key.length(); i++)
        {
            codedText[i] = arrayOfNumbers[i].pow(e).mod(new BigInteger(""+n));
            //System.out.println(codedText[i].toString());
        }
        BigInteger uncodedText[] = new BigInteger[key.length()];
        BigInteger[] coded = {new BigInteger(""+10613),new BigInteger(""+40663), new BigInteger(""+17955), new BigInteger(""+3302), new BigInteger(""+11618), new BigInteger(""+9444), new BigInteger(""+16086)};
        for( int i = 0; i < key.length(); i++)
        {
            uncodedText[i] = codedText[i].pow(d).mod(new BigInteger(""+n));
            //System.out.println(uncodedText[i].toString());
        }
        for( int i = 0; i < 7; i++)
        {
            //uncodedText[i] = codedText[i].pow(d).mod(new BigInteger(""+n));
            System.out.println((char)(coded[i].pow(d).mod(new BigInteger(""+n)).intValue()));
        }


    }
}
static Integer NWD(int a, int b)
{
    while(b!=0)
    {
        int tmp = a % b;
        a = b;
        b = tmp;
    }
    return a;
}

static Integer ExtendedEuclid(int a, int b)
{
    int x0 = 1;
    int x = 0;
    int b0 = b;
    while(b != 0)
    {
        int q = a/b;
        int tmp = x;
        x = x0 - q * x;
        x0 = tmp;
        tmp = a % b;
        a = b;
        b = tmp;
    }
    if(x0 < 0) x0 = x0 + b0;
    return x0;
}
}
