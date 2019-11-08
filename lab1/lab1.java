import java.util.Random;
public class lab1 {
    public static void main(String[] args) {
        if(args.length >=2)
        {
            int n = Integer.parseInt(args[0]);
            double rmax = Double.parseDouble(args[1]);
            double x,y;
            Random rand = new Random();
            for(int i = 0; i < n; i++)
            {
                double alfa = rand.nextDouble() * 2* Math.PI;
                double r = rand.nextDouble() * rmax;
                x = r * Math.cos(alfa);
                y = r * Math.sin(alfa);
                System.out.println(x + " " + y);
            }
        }

    }

}