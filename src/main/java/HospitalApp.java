import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Hospital highStHospital = new Hospital();
		Employee phil = new Doctor("Phil", "3333", "Heart", 90000);
		Employee kelly = new Doctor("Kelly", "444", "Heart", 90000);
		Employee jackie = new Nurse("Jackie", "222", 6, 45000);
		Employee joanne = new Nurse("Joanne", "666", 4, 450_000);
		Employee john = new Janitor("John", "35", 40_000, true);
		Employee amal = new Receptionist("Amal", "30", 40_000, true);
		Employee nate = new Surgeon("Nate", "25", "Brain", 10_000, false);

		Patient andy = new Patient("88", "Andy");
		Patient maulik = new Patient("99", "Maulik");
		Patient kevin = new Patient("77", "Kevin");

		highStHospital.addEmployee(phil);
		highStHospital.addEmployee(jackie);
		highStHospital.addEmployee(kelly);
		highStHospital.addEmployee(joanne);
		highStHospital.addEmployee(john);
		highStHospital.addEmployee(amal);
		highStHospital.addEmployee(nate);

		highStHospital.addPatient(andy);
		highStHospital.addPatient(maulik);
		highStHospital.addPatient(kevin);

		System.out.println("Welcome to HighStreet Hopsital \nWhat would you like to do today?\n");
		hospitalOptions();
		String userInput = input.nextLine();

		switch (userInput) {
		case "1":
			// print all employees
			System.out.println(highStHospital.listEmployeesNamesAndIDs());
			break;
		case "2":
			// adding new employee
			System.out.println("What type of employee do you want to add?");
			System.out.println("1 for Doctor\n2 for Surgeon\n3 for nurse\n4 for Receptionist\n5 for Janitor");
			String typeOfEmployeeToAdd = input.nextLine();
			System.out.println("What is the name of the new employee?");
			String newEmployeeName = input.nextLine();
			System.out.println("What ID number do you want to assign the employee?");
			String newEmployeeIDNumber = input.nextLine();
			typeOfEmployeeToAdd(input, highStHospital, typeOfEmployeeToAdd, newEmployeeName, newEmployeeIDNumber);
			break;
		case "3":
			System.out.println(highStHospital.listEmployeesNamesAndIDs());
			System.out.println("Which employee deserves to be fired? Please enter their ID number.");
			String employeeIDToFire = input.nextLine();

			if (highStHospital.highStHospitalEmployees.containsKey(employeeIDToFire)) {
				Employee employeeToFire = highStHospital.highStHospitalEmployees.get(employeeIDToFire);
				highStHospital.highStHospitalEmployees.remove(employeeToFire.getEmployeeNumber());
				System.out.println(employeeToFire.getName() + " was secretly Hitler!\n");
			}

			System.out.println(highStHospital.listEmployeesNamesAndIDs());
			break;
		case "4":
			// grab patients
			System.out.println(highStHospital.listPatientNamesAndIDs());
			break;
		case "5":
			System.out.println("What is the name of the new patient?");
			String newPatientName = input.nextLine();
			System.out.println("What ID number do you want to assign the patient?");
			String newPatientIDNumber = input.nextLine();
			Patient newPatient = new Patient(newPatientIDNumber, newPatientName);
			highStHospital.addPatient(newPatient);
			System.out.println(highStHospital.listPatientNamesAndIDs());
			break;
		case "6":
			System.out.println(highStHospital.listPatientNamesAndIDs());
			System.out.println("Which patient is too old? Please enter their ID number.");
			String patientToKillLegally = input.nextLine();

			if (highStHospital.highStHospitalPatients.containsKey(patientToKillLegally)) {
				Patient patientToKill = highStHospital.highStHospitalPatients.get(patientToKillLegally);
				highStHospital.highStHospitalPatients.remove(patientToKill.getPatientID());
				System.out.println(patientToKill.getPatientName() + " has been killed!\n");
			}

			System.out.println(highStHospital.listPatientNamesAndIDs());
			break;
		case "7":
			System.out.println(
					"Please enter the ID number of the employee to check on. This will list if they're busy or not.");
			String employeeIDNumberToCheck = input.nextLine();
			// employeeID numbers that return a boolean value
			// 25, 30, 35
			if (highStHospital.highStHospitalEmployees.containsKey(employeeIDNumberToCheck)) {
				Employee employeeToCheck = highStHospital.highStHospitalEmployees.get(employeeIDNumberToCheck);
				if (employeeToCheck instanceof Surgeon) {
					System.out.println(
							employeeToCheck.getName() + " is busy. " + ((Surgeon) employeeToCheck).isOperating());
				} else if (employeeToCheck instanceof Janitor) {
					System.out.println(
							employeeToCheck.getName() + " is busy. " + ((Janitor) employeeToCheck).isSweeping());
				} else if (employeeToCheck instanceof Receptionist) {
					System.out.println(
							employeeToCheck.getName() + " is busy. " + ((Receptionist) employeeToCheck).isOnPhone());
				} else {
					System.out.println(employeeToCheck.getName() + " is not busy.");
				}
			} else {
				System.out.println("EmployeeID number " + employeeIDNumberToCheck + " does not exist in hospital.");
			}
			break;
		case "8":
			System.out.println(highStHospital.listEmployeesNamesAndIDs());
			System.out.println("Which employee do you want to search for? Please enter their ID");
			String employeeToSearchFor = input.nextLine();

			if (highStHospital.highStHospitalEmployees.containsKey(employeeToSearchFor)) {
				Employee foundEmployee = highStHospital.highStHospitalEmployees.get(employeeToSearchFor);
				System.out.println(foundEmployee.toString());
			}

			break;
		case "9":
			System.out.println("You're shift is over.");
			System.exit(0);
			break;
		default:
			break;
		}

		input.close();

	}

	private static void typeOfEmployeeToAdd(Scanner input, Hospital highStHospital, String typeOfEmployeeToAdd,
			String newEmployeeName, String newEmployeeIDNumber) {
		// 1 == Doctor, 2 == Surgeon, 3 == Nurse, 4 == Receptionist, 5 == Janitor
		switch (typeOfEmployeeToAdd) {
		case "1":
			System.out.println("What is the speciality of the doctor?");
			String newDocSpeciality = input.nextLine();
			Employee newDoc = new Doctor(newEmployeeName, newEmployeeIDNumber, newDocSpeciality, 90_000);
			highStHospital.highStHospitalEmployees.put(newEmployeeIDNumber, newDoc);
			break;
		case "2":
			System.out.println("What is the speciality of the Surgeon?");
			String newSurgeonSpeciality = input.nextLine();
			Employee newSurgeon = new Surgeon(newEmployeeName, newEmployeeIDNumber, newSurgeonSpeciality, 120_000,
					false);
			highStHospital.highStHospitalEmployees.put(newEmployeeIDNumber, newSurgeon);
			break;
		case "3":
			Employee newNurse = new Nurse(newEmployeeName, newEmployeeIDNumber, 90_000, 0);
			highStHospital.highStHospitalEmployees.put(newEmployeeIDNumber, newNurse);
			break;
		case "4":
			Employee newReceptionist = new Receptionist(newEmployeeName, newEmployeeIDNumber, 45_000, false);
			highStHospital.highStHospitalEmployees.put(newEmployeeIDNumber, newReceptionist);
			break;
		case "5":
			Employee newJanitor = new Janitor(newEmployeeName, newEmployeeIDNumber, 40_000, false);
			highStHospital.highStHospitalEmployees.put(newEmployeeIDNumber, newJanitor);
			break;
		default:
			break;
		}
	}

	public static void hospitalOptions() {
		System.out.println("Press 1. For a list of employees\r\n" + "Press 2. To add a new employee\r\n"
				+ "Press 3. To fire an employee\r\n" + "Press 4. To for a list of patients\r\n"
				+ "Press 5. To admit a new patient\r\n" + "Press 6. To kill a patient\r\n"
				+ "Press 7. To check if a employee id on busy\r\n" + "Press 8. To search for employee\r\n"
				+ "Press 9. To leave the hospital\r\n" + "Press 666. To check if the vampire is blood thirsty");

	}

}
