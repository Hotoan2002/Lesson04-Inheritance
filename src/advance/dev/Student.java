package advance.dev;

public class Student extends Person{
	private float dtb;
	
	public Student(String name, int old, String address) {
		super(name, old, address);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int old , String address, float dtb) {
		super(name,old,address);
		this.dtb = dtb;
	}

	public float getDtb() {
		return dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ten:%s - Tuoi:%d - DTB:%0.2f , name , old , address, dtb");
	}
	
}