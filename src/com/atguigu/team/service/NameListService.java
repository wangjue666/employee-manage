package project3.employee.src.com.atguigu.team.service;

import project3.employee.src.com.atguigu.team.domain.Employee;
import static project3.employee.src.com.atguigu.team.service.Data.*;
public class NameListService{
    private Employee[] employees;

    // 给数组元素进行初始化
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for(int i=0; i< employees.length; i++){
            int type = Integer.parseInt(EMPLOYEES[i][0]); 
            switch(type){
                case EMPLOYEE:
                    
                    break;
                case PROGRAMMER:
                    
                    break;
                case DESIGNER:
                    
                    break;   
                case ARCHITECT:
                    
                    break;         
            }
        }
    }

    public Employee[] getAllEmployees(){
        return null;
    }
    public Employee getEmployee(int id){
        return null;
    }
}