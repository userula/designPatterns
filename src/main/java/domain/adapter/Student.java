package domain.adapter;

public class Student extends Unik implements IDCard {

	private String studentName;
	private int id;

	public Student(String n, int i, String u, String l) {
		super(u, l);
		setStudDetails(n, i);
	}

	@Override
	public void setStudDetails(String n, int i){
		setStudentName(n);
		setId(i);
	}

	@Override
	public String getIDCard() {
	    return ("Student " + getStudentName() + " with id " + getId() + " in " + getUnikName() + " located at " + getUnikLocation());
	  }

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
