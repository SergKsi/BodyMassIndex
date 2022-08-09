import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int weight = 75;
        int height = 175;
       int bMI;

       BmiService service = new BmiService();
       bMI = service.calculate(weight, height);

       System.out.println("ИМТ = " + bMI);
    }
}
