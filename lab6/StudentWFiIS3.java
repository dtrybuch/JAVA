public class StudentWFiIS3 extends Student {
    private StudentUSOS stud;
    StudentWFiIS3(String n, String s, int id,int rok,String subject1,double grade1,String subject2,double grade2,String subject3,double grade3)
    {
        super(n,s,id,new double[]{grade1,grade2,grade3});
        this.stud = new StudentUSOS()
        {
            public void listaPrzedmiotow()
            {
                System.out.println(1 + ". " + subject1 + ": " + grade1);
                System.out.println(2 + ". " + subject2 + ": " + grade2);
                System.out.println(3 + ". " + subject3 + ": " + grade3);
            }
            public double srednia()
            {
                return this.srednia();
            }

	        public String toString() {
		        return "[" + rok + "] ";
	        }
        };
    }
        public void listaPrzedmiotow()
            {
                stud.listaPrzedmiotow();
            }
        public double srednia()
        {
            return super.average();
        }

	    public String toString() 
        {
		    return stud.toString() + super.toString();
	    }
    

};