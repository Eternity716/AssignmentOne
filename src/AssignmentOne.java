// "Part1:HealthProfessional";
class HealthProfessional {
    int id;
    String name;
    String description;

    public HealthProfessional() {
    }

    public HealthProfessional(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // "printDetails";
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }
}
// "Part2:创建子类GeneralPractitioner";
class GeneralPractitioner extends HealthProfessional {

    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int id, String name, String description) {
        super(id, name, description);
    }

    // "打印详情printDetails";
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: HealthProfessional");
    }
}

// "Part2:自定义Neurology";
class Neurology extends HealthProfessional {
    // "专业specialty";
    String specialty = "Neurology";

    public Neurology() {

    }

    public Neurology(int id, String name, String description) {
        super(id, name, description);
    }

    // "打印函数printDetails";
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: " + this.specialty);
    }
}

// "Part4:预约类Appointment";
class Appointment {

    String name;
    String phone;
    String time;
    HealthProfessional doctor;

    public Appointment() {

    }

    public Appointment(String name, String phone, String time, HealthProfessional doctor) {
        this.name = name;
        this.phone = phone;
        this.time = time;
        this.doctor = doctor;
    }

    // "打印预约详情printDetails";
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Time: " + time);
        doctor.printDetails();
    }
}
// "AssignmentOne";
public class AssignmentOne {
    // "Part5:appointmentList存放Appointment";
    static ArrayList<Appointment> appointmentList = new ArrayList<>();

    // "运行主函数main";
    public static void main(String[] args) {
        // "Part3:创建三名GeneralPractitioner和两名Neurology";
        GeneralPractitioner General1 = new GeneralPractitioner(1, "Charlie", "Pediatric care");
        GeneralPractitioner General2 = new GeneralPractitioner(2, "Brown", "Mental health");
        GeneralPractitioner General3 = new GeneralPractitioner(3, "John", "Geriatric care");
        Neurology Neurology1 = new Neurology(1, "Alice Green", "Specialist in epilepsy and seizures management");
        Neurology Neurology2 = new Neurology(2, "Bob White", "Expert in stroke rehabilitation and treatment");