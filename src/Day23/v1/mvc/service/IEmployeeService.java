package C2TC_CORE_JAVA_PROGRAM.src.Day23.v1.mvc.service;

import java.sql.SQLException;
import java.util.List;

import C2TC_CORE_JAVA_PROGRAM.src.Day23.v1.mvc.Employee;

public interface IEmployeeService {

    List<Employee> getAllEmployees() throws SQLException;
    Employee getEmployeeById(int empId) throws SQLException;
    void addEmployee(Employee e)throws SQLException;
    boolean deleteEmployee(int empId) throws SQLException;
    boolean updateEmployee(int empId, Employee e) throws SQLException;

}