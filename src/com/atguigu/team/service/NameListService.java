package project3.employee.src.com.atguigu.team.service;

import project3.employee.src.com.atguigu.team.domain.Architect;
import project3.employee.src.com.atguigu.team.domain.Designer;
import project3.employee.src.com.atguigu.team.domain.Employee;
import project3.employee.src.com.atguigu.team.domain.Equipment;
import project3.employee.src.com.atguigu.team.domain.NoteBook;
import project3.employee.src.com.atguigu.team.domain.PC;
import project3.employee.src.com.atguigu.team.domain.Printer;
import project3.employee.src.com.atguigu.team.domain.Programmer;

import static project3.employee.src.com.atguigu.team.service.Data.*;
public class NameListService{
    private Employee[] employees;

    // 给数组元素进行初始化
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for(int i=0; i< employees.length; i++){
            int type = Integer.parseInt(EMPLOYEES[i][0]); 

            //获取 EMPLOYEE 的四个基本属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch(type){
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]); 
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;   
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]); 
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;         
            }
        }
    }

    public Employee[] getAllEmployees(){
        return employees;
    }
    public Employee getEmployee(int id) throws TeamException{
        for(int i=0; i< employees.length; i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
    public Equipment createEquipment(int index){
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        String model = EQUIPMENTS[index][1];
        switch(type){
            case PC:
                String display = EQUIPMENTS[index][2];
                return new PC(model, display);
            case NOTEBOOK:
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(model, price);
            case PRINTER:
                return new Printer(model, EQUIPMENTS[index][2]);    
        }
        return null;
    }
}