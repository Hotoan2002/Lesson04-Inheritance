package advance.dev;

public class Teacher extends Person {
	
	private float hsl;
	
	public Teacher(String name, int old, String address) {
		super(name, old, address);
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int old , String address, float dtb) {
		super(name, old , address);
		this.hsl = hsl;
	}
	public float getHsl() {
		return hsl;
	}
	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
	
	
}