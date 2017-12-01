
public class Student extends People
{
	public Student(String firstname, String familyname, double height, int weight, double GPA, double osis, String major) 
	{
		super(firstname, familyname, height, weight);

	}
	public double GPA()
	{
		return GPA();
		 
	}
	public double osis()
	{
		return osis();
	}
	public String major() {
		return major();
	}
	@Override
	public String toString() {
		return "Student [GPA()=" + GPA() + ", osis()=" + osis() + ", major()=" + major() + ", getFirstname()="
				+ getFirstname() + ", getFamilyname()=" + getFamilyname() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
