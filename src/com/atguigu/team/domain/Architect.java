package project3.employee.src.com.atguigu.team.domain;

public class Architect extends Designer {
    private  int stock; //股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect stock(int stock) {
        this.stock = stock;
        return this;
    }

    
}