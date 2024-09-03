import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExerciseDayOne {
    public static void main(String[] args) {

        // 1. Area of Rectangle
        int length = 5;
        int width = 3;
        int areaOfRectangle = length * width;
        System.out.println("The area of Rectangle is : " + areaOfRectangle);

        // 2. Diameter, Circumference and area of Circle
        int radius = 5;
        double pi = 3.14159;
        double diameterOfCircle = 2*radius;
        double circumferenceOfCircle = pi*diameterOfCircle;
        double areaOfCircle = pi*radius*radius;
        System.out.println("The diameter of the Circle is : " + diameterOfCircle);
        System.out.println("The circumference of the Circle is : " + circumferenceOfCircle);
        System.out.println("The area of the Circle is : "  + areaOfCircle);

        // 3. Find the third angle of a triangle
        int firstAngle = 80;
        int secondAngle = 65;
        int thirdAngle = 180 - (firstAngle + secondAngle);
        System.out.println("The third angle is : " + thirdAngle);

        // 4. Day Difference
        String dateOneString = "2024-03-19";
        String dateTwoString = "2024-03-24";
        LocalDate dateOne = LocalDate.parse(dateOneString);
        LocalDate dateTwo = LocalDate.parse(dateTwoString);
        long daysBetween = ChronoUnit.DAYS.between(dateOne, dateTwo);
        System.out.println("Difference in days: " + daysBetween);

        // 5. Print Initial Name
        String fullName = "Made Acarya";
        String[] splitName = fullName.split(" ");
        String initials = "";
        for(int i = 0; i < splitName.length; i++){
            initials += splitName[i].charAt(0);
        }
        System.out.println("Inisial : " + initials.toUpperCase());



    }
}
