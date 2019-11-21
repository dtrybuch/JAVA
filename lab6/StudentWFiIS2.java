public class StudentWFiIS2 implements StudentUSOS {
    private String[] przedmioty;
    private int rok;
    private Student stud;

    StudentWFiIS2(String n, String s, int id,int rok,String subject1,double grade1,String subject2,double grade2,String subject3,double grade3)
    {
        this.rok = rok;
        this.stud = new Student(n,s,id,new double[]{grade1,grade2,grade3});
        this.przedmioty = new String[]{subject1,subject2,subject3};
    }
    public void listaPrzedmiotow()
    {
        for(int i = 0; i < przedmioty.length;i++)
        {
            System.out.println(i+1 + ". " + przedmioty[i]+ ": " + stud.getGrade(i));
        }
    }
    public double srednia()
    {
        return stud.average();
    }
	public String toString() {
		return "[" + rok + "] " + stud.toString();
	}
}
