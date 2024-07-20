import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa)  {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    
    public int compareTo(Student student){
        if(cgpa == student.cgpa){
            if(this.fname.compareTo(student.fname) != 0){
                return this.fname.compareTo(student.fname);
            }
            else if(id>student.id)
                return 1;
            else return -1;
        }
        else if(cgpa<student.cgpa)
            return 1;
        else return -1;
        
    }

}


//Complete the code


public class Sort

{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
		in.close();
	}
}



