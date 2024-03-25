public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о зарплате сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            System.out.printf("%-15s: %10.2f\n", emp.fullname, emp.salary);
        }

    }
}