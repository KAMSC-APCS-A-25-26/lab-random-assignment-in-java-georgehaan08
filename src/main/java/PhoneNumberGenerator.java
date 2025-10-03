import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random num = new Random();
        // TODO: Generate first three digits (XXX)
        int first = num.nextInt(8);
        int second = num.nextInt(8);
        int third = num.nextInt(8);
        
        // TODO: Generate second three digits (XXX) 
        int mid = num.nextInt(743);
        String mid1 = String.format("%03d",mid);

        // TODO: Generate third three digits (XXX)
        int end = num.nextInt(1000);
        String end1 = String.format("%03d",end);

        // TODO: Format and display phone number as XXX-XXX-XXX
        System.out.printf(first + "" + second + "" + third + "-" + mid1 + "-" + end1);
    }
}
