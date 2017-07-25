package tr.org.linux.kamp.student;

public class Student {
	private String name;
	private double averge;

	public Student(String name, double averge) {
		this.name = name;
		if (averge >= 0.0) {
			if (averge <= 100) {
				this.averge = averge;
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverge(double averge) {
		return averge;
	}

	public void setAverge(double averge) {

		if (averge >= 0.0) {
			if (averge <= 100) {
				this.averge = averge;
			}
		}

	}

	public String getLetterGrade() {
		String letGrade = "";
		if (averge >= 90.0) {
			letGrade = "A";
		} else if (averge >= 80.0) {
			letGrade = "B";
		} else if (averge >= 70.0) {
			letGrade = "C";
		} else if (averge >= 60.0) {
			letGrade = "D";
		}
		else letGrade="F";
		return letGrade;

	}
}
