import java.util.Scanner;

public class HospitalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Doctor doctor = new Doctor();

        System.out.println("Enter Doctor Details");

        System.out.print("Enter name: ");
        doctor.setName(sc.nextLine());

        System.out.print("Enter staff ID: ");
        doctor.setStaffId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter specialization: ");
        doctor.setSpecialization(sc.nextLine());

        Nurse nurse = new Nurse();

        System.out.println("\nEnter Nurse Details");

        System.out.print("Enter name: ");
        nurse.setName(sc.nextLine());

        System.out.print("Enter staff ID: ");
        nurse.setStaffId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter ward: ");
        nurse.setWard(sc.nextLine());

        System.out.println("\nDoctor Details");
        doctor.displayStaffDetails();
        doctor.displayDoctorDetails();

        System.out.println("\nNurse Details");
        nurse.displayStaffDetails();
        nurse.displayNurseDetails();

        sc.close();
    }
}
