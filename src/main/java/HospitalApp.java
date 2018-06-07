import java.util.Scanner;

public class HospitalApp {
	static Scanner input = new Scanner(System.in);
	static Hospital highStHospital = new Hospital();

	public static void main(String[] args) {


		highStHospital.addEmployee(new Doctor("Phil", "3333", "Heart", 90000));
		highStHospital.addEmployee(new Nurse("Jackie", "222", 6, 45000));
		highStHospital.addEmployee(new Doctor("Kelly", "444", "Heart", 90000));
		highStHospital.addEmployee(new Nurse("Joanne", "666", 4, 450_000));
		highStHospital.addEmployee(new Janitor("John", "35", 40_000, true));
		highStHospital.addEmployee(new Receptionist("Amal", "30", 40_000, true));
		highStHospital.addEmployee(new Surgeon("Nate", "25", "Brain", 10_000, false));
		highStHospital.addEmployee(new VampireJanitor("Lil Jon", "21494", 1_000_000, false, 20));

		highStHospital.addPatient(new Patient("88", "Andy"));
		highStHospital.addPatient(new Patient("99", "Maulik"));
		highStHospital.addPatient(new Patient("77", "Kevin"));

		System.out.println("Welcome to HighStreet Hopsital \nWhat would you like to do today?\n");
		hospitalOptions();
		String userInput = input.nextLine();

		switch (userInput) {
		case "1":
			// print all employees
			System.out.println(highStHospital.listEmployeesNamesAndIds());
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
			typeOfEmployeeToAdd(typeOfEmployeeToAdd, newEmployeeName, newEmployeeIDNumber);
			break;
		case "3":
			System.out.println(highStHospital.listEmployeesNamesAndIds());
			System.out.println("Which employee deserves to be fired? Please enter their ID number.");
			String employeeIdToFire = input.nextLine();

			System.out.println(highStHospital.getHighStHospitalEmployees().get(employeeIdToFire) + " was secretly Hitler!\n");
			highStHospital.highStHospitalEmployees.remove(employeeIdToFire);

			System.out.println(highStHospital.listEmployeesNamesAndIds());
			break;
		case "4":
			System.out.println(highStHospital.listPatientNamesAndIds());
			break;
		case "5":
			System.out.println("What is the name of the new patient?");
			String newPatientName = input.nextLine();
			System.out.println("What ID number do you want to assign the patient?");
			String newPatientIdNumber = input.nextLine();
			Patient newPatient = new Patient(newPatientIdNumber, newPatientName);
			highStHospital.addPatient(newPatient);
			System.out.println(highStHospital.listPatientNamesAndIds());
			break;
		case "6":
			System.out.println(highStHospital.listPatientNamesAndIds());
			System.out.println("Which patient is too old? Please enter their ID number.");
			String patientToKillLegally = input.nextLine();

			System.out.println(highStHospital.getHighStHospitalPatients().get(patientToKillLegally) + " has been killed!\n");
			highStHospital.highStHospitalPatients.remove(patientToKillLegally);

			System.out.println(highStHospital.listPatientNamesAndIds());
			break;
		case "7":
			System.out.println(
					"Please enter the ID number of the employee to check on. This will list if they're busy or not.");
			String employeeIdNumberToCheck = input.nextLine();
			Employee employeeToCheck = highStHospital.highStHospitalEmployees.get(employeeIdNumberToCheck);
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
			break;
		case "8":
			System.out.println(highStHospital.listEmployeesNamesAndIds());
			System.out.println("Which employee do you want to search for? Please enter their ID");
			String employeeToSearchFor = input.nextLine();

			System.out.println(highStHospital.highStHospitalEmployees.get(employeeToSearchFor));

			break;
		case "9":
			System.out.println("You are healthy now. Or dead...");
			System.exit(0);
			break;
		case "666":
			System.out.println("Don't check on the vampire stupid.");
			System.out.println("Lil Jons blood thirst is currently: " + ((VampireJanitor) highStHospital.getHighStHospitalEmployees().get("21494")).getBloodThirst());
		default:
			break;
		}

		input.close();

	}

	private static void typeOfEmployeeToAdd(String typeOfEmployeeToAdd, String newEmployeeName, String newEmployeeIDNumber) {
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
				+ "Press 9. To leave the hospital\r\n" + "Press 666. To check the blood thirst of Lil Jon");

	}

}
