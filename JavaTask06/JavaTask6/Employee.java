package JavaTask6;

public class Employee {

	static int id;
	static String firstName;
	static String lastName;
	static int salary;

	public Employee(int id, String firstName, String LastName, int salary) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;

	}

	// Getter Method
	public int getid() {
		return id;

	}

	public String getfirstName() {
		return firstName;

	}

	public String getlastName() {
		return lastName;
	}

	public int getsalary() {
		return salary;

	}
	// Setter Method

	public int setsalary(int salary) {
		return salary * 12;

	}

	// Method to change salary by percentage (%)
	public int raisesalary(int percent) {
		salary = salary + (salary * percent / 100);
		return salary;
	}

	
	
	public String tostring() {
		 return "Employee[id=" + id + ",firstName=" + getfirstName() + ",lastName=" + getlastName() + ",int =" +salary + "]";
	}
	public static void main(String[] args) {
 
		Employee emp = new Employee(1,"Pratik", "Kapur", 10000);
		emp.raisesalary(10);
		System.out.println(emp.tostring());
		System.out.println("Annual Salary ::" + emp.getsalary());
		System.out.println("After 10% raise ::" + emp.tostring());
		
	}
	

	}


