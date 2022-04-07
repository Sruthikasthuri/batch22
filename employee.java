
public class employee {
	private int employeeid;
	private String employeename;
	private int employeesalary;
	//private static int counter;
	
	
	public employee() {
		super();
		//setCounter(getCounter() + 1);
	}
	public employee(int employeeid, String employeename, int employeesalary) {
		//setCounter(getCounter() + 1);
		System.out.print("I am emp constructor");
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}
	
	public static employee getInstance() {
		
		employee employee =new employee();
		return employee;
		
		}
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	public String toString()
	{
		return ""+employeeid+""+employeename+""+employeesalary;
	}
	
	

}
