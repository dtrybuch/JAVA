public class Graduate extends Student
{
    private int yearOfGraduate;
    private String degree;
    public Graduate(String degree,String name, String surname,int albumNr,int yearOfGraduate,double firstGrade,double secondGrade,double thirdGrade)
    {
        super(name,surname,albumNr,firstGrade,secondGrade,thirdGrade);
        this.yearOfGraduate = yearOfGraduate;
        this.degree = degree;
    }
    public String toString()
    {
        return new String("" + degree + " " + super.toString() + ", year of graduation: " + yearOfGraduate);
    }
}