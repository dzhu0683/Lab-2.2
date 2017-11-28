
public abstract class People 
{
	private String firstname, familyname;
	private double height;
	private int weight;
	public People(String firstname, String familyname, double height, int weight)
	{s
		this.firstname = firstname;
		this.familyname = familyname;
		this.height = height;
		this.weight = weight;
	}
	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}


