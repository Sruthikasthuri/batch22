
public class wageEmployee extends employee {
	public int hours;
	private int rate;
	
	public wageEmployee(int employeeid, String employeename,int employeesalary,int hours,int rate) {
		setEmployeeid(employeeid);
		setEmployeename(employeename);
		setEmployeesalary(employeesalary);
		this.hours=hours;
		this.setRate(rate);
	}
	/*public String toString()
	{
		return getEmployeeid+""+getEmployeename+""+getEmployeesalary+""+hours+""+rate;
	}*/

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	public String toString()
	{
		return  getEmployeeid()+""+getEmployeename()+""+getEmployeesalary()+""+hours+""+rate;
	}

}
