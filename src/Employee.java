public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final double salary;
    private final int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alex Ivanov", "Manager", "alex.ivanov@gmail.com", "+375-29-811-33-56", 2500, 41);
        employees[1] = new Employee("Dmitriy Seduk", "Developer", "dmitriy.seduk@gmail.com", "+375-29-555-12-38", 2200, 42);
        employees[2] = new Employee("Denis Sidorov", "Analyst", "denis.sidorov@mail.ru", "+375-29-555-77-00", 1600, 24);
        employees[3] = new Employee("Ekaterina Daviduk", "Designer", "katerina1998@mail.ru", "+375-44-789-01-23", 1800, 25);
        employees[4] = new Employee("Maksim Kovalev", "Engineer", "maxim.koval@gmail.com", "+375-44-890-12-34", 1550, 45);

        for (Employee employee : employees) {
            if (employee.age > 40)
                employee.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("------------------------");
    }
}
