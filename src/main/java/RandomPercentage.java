import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {

        Random r = new Random();
        Random r1= new Random(67);

        double a = r.nextDouble();
        double b = r1.nextDouble();
        
        // TODO: Display the values as percentages
        System.out.println("Unseeded Random");
        System.out.printf("%.2f%%",a*100);
        System.out.println("\nSeeded Random");
        System.out.printf("%.2f%%",b*100);
    }
}