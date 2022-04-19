package advance.dev;

public class Person {
	protected String name;
	protected int old;
	protected String address;
	
	public Person(String name, int old , String address) {
		this.name = name;
		this.old = old;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}