
public class App {

	public static void main(String[] args) {
		/*TeachingStaff staff2 = new TeachingStaff();
		Staff staff3 = new TeachingStaff();
		Staff staff4 = new NonTeachingStaff();
		
		staff3.calculateSalary();
		staff4.calculateSalary();
		
		staff2.teach();
		staff3.teach();
		staff4.teach();*/
		
		Staff staff1 = new ContractTeacher();
		staff1.calculateSalary();
	}

}
