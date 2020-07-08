package project3.employee.src.com.atguigu.team.domain;

import project3.employee.src.com.atguigu.team.service.Status;

public class Programmer extends Employee {
    private int memberId;
    private Status status;
    private Equipment equipment;
    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
       super(id, name, age, salary);
       this.equipment = equipment;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Programmer memberId(int memberId) {
        this.memberId = memberId;
        return this;
    }

    public Programmer status(Status status) {
        this.status = status;
        return this;
    }

    public Programmer equipment(Equipment equipment) {
        this.equipment = equipment;
        return this;
    }

}

    
   
 
    