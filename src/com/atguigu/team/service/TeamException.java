package project3.employee.src.com.atguigu.team.service;

public class TeamException extends Exception{
    static final long serialVersionUID = -3387514229948L;
    public TeamException(){
        super();
    }
    public TeamException(String msg){
        super(msg);
    }
}