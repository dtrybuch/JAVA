public class StudentWFiIS1 extends Student implements StudentUSOS {
    private String[] przedmioty;
    private int rok;

    StudentWFiIS1(String n, String s, int id,int rok,String subject1,double grade1,String subject2,double grade2,String subject3,double grade3)
    {
        super(n,s,id,new double[]{grade1,grade2,grade3});
        this.przedmioty = new String[]{subject1,subject2,subject3};
        this.rok = rok;
    }
    public void listaPrzedmiotow()
    {
        for(int i = 0; i < przedmioty.length;i++)
        {
            System.out.println(i+1 + ". " + przedmioty[i]+ ": " + getGrade(i));
        }
    }
    public double srednia()
    {
        return super.average();
    }

	public String toString() {
		return "[" + rok + "] " + super.toString();
	}

}
