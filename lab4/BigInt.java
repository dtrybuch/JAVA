import java.lang.Object;
import java.util.Arrays;
import java.math.BigInteger;
public final class BigInt
{
    private final byte [] tab;

    public BigInt(String figure)
    {
        tab = new byte[figure.length()];
        for(int i = 0;i<tab.length;i++)
        {
            tab[i] = Byte.parseByte("" + figure.charAt(i));
        }
    }
    public BigInt(byte [] tab)
    {
        this.tab = new byte[tab.length];
        for(int i = 0; i < tab.length;i++)
        {
            this.tab[i] = tab[i];
        }
    }
    public BigInt(BigInt obj)
    {
        tab = new byte[obj.tab.length];
        for(int i = 0; i < tab.length;i++)
        {
            this.tab[i] = obj.tab[i];
        }
    }
    public boolean equals​(Object obj)
    {
        if(obj ==null) return false;
        if(obj == this) return true;
        if(obj.getClass() == this.getClass())
        {    
            BigInt newBig = (BigInt)obj;
            return Arrays.equals​(newBig.tab,this.tab);
        }
        return false;
    }
    public String toString()
    {
        StringBuilder string = new StringBuilder();
        for(int i =0;i<tab.length;i++)
        {
            string.append("" + tab[i]);
        }
        return  new String(string);
    }
    public byte[] getNum()
    {
        byte[] newTab = new byte[tab.length];
        for(int i = 0; i < tab.length;i++)
        {
            newTab[i] = tab[i];
        }
        return newTab;
    }
    public BigInt add(BigInt obj)
    {
        BigInteger first = new BigInteger(this.toString());
        BigInteger second = new BigInteger(obj.toString());
        
        return new BigInt(first.add(second).toString());
    }
}