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