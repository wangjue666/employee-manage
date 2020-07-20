package project3.employee.src.com.atguigu.junit;
import org.junit.jupiter.api.Test;
import project3.employee.src.com.atguigu.team.service.NameListService;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for(int i = 0; i< employees.length; i++){
            System.out.println(employees[i]);
        }
    }
}