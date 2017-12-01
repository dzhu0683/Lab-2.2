
public class Teacher extends People
{
	public Teacher(String firstname, String familyname, double height, int weight, String subject, String title) 
	{
		super(firstname, familyname, height, weight);
	}
	
	public String subject() 
	{
		return subject();
	}
	public String title() 
	{
		return title();
	}

	@Override
	public String toString() {
		return "Teacher [subject()=" + subject() + ", title()=" + title() + ", getFirstname()=" + getFirstname()
				+ ", getFamilyname()=" + getFamilyname() + ", getHeight()=" + getHeight() + ", getWeight()="
				+ getWeight() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
