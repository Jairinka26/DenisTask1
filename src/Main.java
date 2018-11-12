import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        init();
    }

    static void init(){
        Task1 task1 = new Task1();
        task1.printValues();
        task1.printValuesRevers();
    }
}
