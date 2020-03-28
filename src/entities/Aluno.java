package entities;

public class Aluno {
	public String name;
	public double sumGrade = 0;

	public void increaseGrade(double grade) {
		sumGrade += grade;
	}
	
	public String toString() {
		String help;
		if(sumGrade < 60) 
			help = String.format("FAILED%nMISSING %.2f POINTS", 60 - sumGrade);
		else
			help = "PASS";
		
		return String.format("FINAL GRADE = %.2f%n", sumGrade)
			+ help; 
	}
}
