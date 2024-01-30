import java.util.Scanner;

public class CylinderVolume {

    public static double computeVolume(int radius, int height, double pi){
        double volume = 0.0;

        volume = pi * (radius * radius) * height;

        return volume;
    }

    public static void main(String[] args) {
        int radius;
        int height;
        double volume = 0.0;
        String answer = "yes";

        Scanner scanner = new Scanner(System.in);

        while(answer.equalsIgnoreCase("yes")){
            try {
                System.out.println("Please enter radius of cylinder");
                radius = scanner.nextInt();
                System.out.println("Please enter height of cylinder");
                height = scanner.nextInt();
                System.out.println("pi = 3.14");

                volume = computeVolume(radius, height, 3.14);

                System.out.println("The volume of the cylinder of a radius of " +
                        radius + " and height of " + height + " is: " + volume);

                System.out.println("Would you like to try again, yes/no?");
                answer = scanner.next();
            }
            catch(Exception e){
                System.out.println("Keyboard malfunctioned!");
            }
        }
    }
}
