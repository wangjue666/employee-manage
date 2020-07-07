package project3.employee.src.com.atguigu.team.domain;

public class Printer implements Equipment  {
    private String name; //机器型号
    private String type; //机器类型

    public Printer() {
        super();
    }

   
    public Printer(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Printer name(String name) {
        this.name = name;
        return this;
    }

    public Printer type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getDescription() {
        return name + '(' + type + ')';
    }

  
}