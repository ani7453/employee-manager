package Model;

public class department {
	private int departId;
	private String departName;
	
	public department() { super(); }
	
	public department(String name) {
		departName = name;
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	
	
	
	
}
