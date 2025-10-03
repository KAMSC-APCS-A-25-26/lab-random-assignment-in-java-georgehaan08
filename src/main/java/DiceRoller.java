import java.util.Random;

public class DiceRoller
{
    public static void main(String[] args)
    {
        Random r1 = new Random();
        Random r2 = new Random(41);

        System.out.println(r1.nextInt(6)+1);
        System.out.println(r1.nextInt(6)+1);
        System.out.println(r1.nextInt(6)+1);
        System.out.println(r2.nextInt(6)+1);
    }
}
