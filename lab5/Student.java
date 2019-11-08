import java.util.Arrays;
public class Student extends Man
{
    private final Integer albumNr;
    private final double [] grades;
    
    public Student(String name, String surname,int albumNr,double firstGrade,double secondGrade,double thirdGrade)
    {
        super(name,surname);
        grades = new double[3];
        grades[0] = firstGrade;
        grades[1] = secondGrade;
        grades[2] = thirdGrade;
        this.albumNr = new Integer("" + albumNr);
    }
    public double average()
    {
        if(grades.length == 3)
        {
            double sum = grades[0] + grades[1] + grades[2];
            return sum / 3;
        }
        else return super.average();
    }
    public Man compare(Man ob)
    {
        if(ob==null) return this;
        if(ob instanceof Student)
        {
            if(this.average() > ((Student)ob).average()) return this;
            else return ob;
        }     
        return null;
    }
    public String toString()
    {
        return new String("" + super.toString() + ", id number: " + new String("" + albumNr) +", grades " + Arrays.toString(grades)); 
    }
}