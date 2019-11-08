public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello " + "world!");

        Examples ob = new Examples();
        // ob.run();
        // ob.stringsV1();
        // ob.stringsV2();
        Examples ob2 = new Examples();
        System.out.println(ob==ob2);
        System.out.println("" + ob.equals(ob2));

    }

}

class Examples {
    float x1;

    public double run() {
        System.out.println(2 + 4); // ex. 1
        System.out.println("2 + 4 = " + (2 + 4)); // ex. 1

        float x2 = 4.5F; // ex. 2
        System.out.println("x1 = " + x1); // ex. 2
        System.out.println("x2 = " + x2); // ex. 2

        System.out.println("sqrt(36.0) calculated."); // ex. 3
        return Math.sqrt(36.0);
    }

    
    public void stringsV1(){ // ex. 4
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.print(s1 == s2);//porownuje referencje wiec slabo...
        System.out.println(" " + s1.equals(s2));//porownuje zawartosc obiektow 
    }

    public void stringsV2(){ // ex. 5
        String s1 = "Hello";//obie referencje wskazuja na ten sam obiekt
        String s2 = "Hello";//-||-
        System.out.print(s1 == s2);//wiec to dziala
        System.out.println(" " + s1.equals(s2));
        s2 = s2.toUpperCase();
        System.out.println(s2);
    }

}