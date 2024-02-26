package main;
 
public class PatientDriverApp {

	public static void main(String[] args) {

		Patient patient = new Patient("Lucious", "Ezra", "Diaz", "4444 Main Ct", "Mytown", "MD", "12345",
                "301-098-4444", "Steve Craft", "240-222-1111");

        // Create procedures
        Procedure procedure1 = new Procedure("Splint", "08/05/2020", "Dr.Lanza", 180.00);
        Procedure procedure2 = new Procedure("X-Ray", "02/21/2020","Dr. Ortega", 300.00);
        Procedure procedure3 = new Procedure("MRI", "05/25/2023", "Dr. Levi", 600.00);

        // Display patient information
        displayPatient(patient);

        // Display information about each procedure
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);

        // Display total charges
        System.out.println("Total Charges: $" + String.format("%.2f", totalCharges));
        System.out.println();
        System.out.println("Student Name: Darina Diaz");
        System.out.println("MC#: M21104522");
        System.out.println("Due Date: 02/26/2024");
	}

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println(patient);
        System.out.println();
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
        System.out.println();
    }

    // Method to calculate total charges
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
     
    }
}
