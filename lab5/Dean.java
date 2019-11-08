public class Dean extends Man
{
    private final Integer YearOfStart;
    private final Integer YearOfEnd;
    private final String degree;

    public Dean(String degree, String name, String surname, Integer YearOfStart,Integer YearOfEnd)
    {
        super(name,surname);
        this.degree = new String(degree);
        this.YearOfStart = new Integer(""+ YearOfStart);
        this.YearOfEnd = new Integer("" + YearOfEnd);
    }
    public Man compare(Man ob)
    {
        if(ob==null) return this;
        if(ob instanceof Dean)
        {
            if(this.YearOfEnd > ((Dean)ob).YearOfEnd) return this;
            return ob;
        }
        return null;
    }
    public String toString()
    {
        return new String("" + degree + " " + super.toString() + ", Dean of the Faculty from: " + YearOfStart + " to " + YearOfEnd + ".");
    }
    public double average() {
        System.out.print("[Average not applicable]");
        return super.average();
    }
}