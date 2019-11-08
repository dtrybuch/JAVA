import java.util.Random;
class lab4
{
public static void main(String args[])
{
    Random random = new Random();
    long first, second;
    for(int i = 0 ; i<1000;i++)
    { 
        first = random.nextLong()/3;
        second = random.nextLong()/3;
        test(first,second);
    }
    first = 999999999999999999L;
    second = 1L;
    test(first,second);
    first = 1L;
    second = 999999999999999999L;
    
}
static public void test(long first, long second)
{
        if(first < 0) first = -first; 
        if(second < 0) second = -second;   
        BigInt firstBig = new BigInt("" + first); 
        BigInt secondBig = new BigInt("" + second); 
        System.out.println(firstBig);
        System.out.println(secondBig);
        System.out.println("Z wykorzystaniem dodawania BigInt: " + firstBig.add(secondBig));
        System.out.println("Z wykorzystaniem dodawania long: " + (first + second));
}
}


