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
        // "Part3:输出全部医疗专业人员的信息用printDetails";
        General1.printDetails();
        System.out.println("------------------------------");
        General2.printDetails();
        System.out.println("------------------------------");
        General3.printDetails();
        System.out.println("------------------------------");
        Neurology1.printDetails();
        System.out.println("------------------------------");
        Neurology2.printDetails();
        System.out.println("------------------------------");

        // "Part5:添加2个GeneralPractitioner 2个Neurology的预约到appointmentList";
        createAppointment("Alice Johnson", "123-456-7890", "2024-11-13 10:00", General1);
        createAppointment("Bob Smith", "987-654-3210", "2024-11-13 11:30", General2);
        createAppointment("Charlie Brown", "555-123-4567", "2024-11-13 14:00", Neurology1);
        createAppointment("David Lee", "444-987-6543", "2024-11-13 15:30", Neurology2);

        // "Part5:输出已预约的列表";
        printExistingAppointments();
        // "Part5:取消预约";
        cancelBooking("1234567890");
        // "Part5:取消后更新的预约列表";
        printExistingAppointments();
        // "Part5:取消不存在的";
        cancelBooking("1212121212");
    }
    // "Part5:创建预约createAppointment";
    public static void createAppointment(String name, String phone, String time, HealthProfessional doctor) {
        // "生成appointment";
        Appointment appointment = new Appointment(name, phone, time, doctor);
        // "添加到appointmentList";
        appointmentList.add(appointment);
        // "添加成功";
        System.out.println("create appointment success!");
    }

    // "Part5:输出已预约列表printExistingAppointments";
    public static void printExistingAppointments() {
        // "判断预约列表是否为空";
        if (appointmentList.size() == 0) {
            System.out.println("please add appointment");

        } else {
            // "不是空的就打印预约列表appointmentList";
            for (int i = 0; i < appointmentList.size(); i++) {
                appointmentList.get(i).printDetails();
                System.out.println("------------------------------");
            }
        }

    }