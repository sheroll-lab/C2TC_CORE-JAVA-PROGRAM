package C2TC_CORE_JAVA_PROGRAM.src.Day22.v1.scrollableresultset;

import java.sql.SQLException;

public class EmployeeDemo {

    public static void main(String[] args) {
        try {
            EmployeeService.showFirst();
            EmployeeService.showLast();
            EmployeeService.showPrevious();
            EmployeeService.showPrevious();
            EmployeeService.showNext();
            EmployeeService.updateSalary(65000);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}