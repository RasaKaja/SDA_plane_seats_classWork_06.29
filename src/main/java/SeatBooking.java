import java.util.Scanner;

public class SeatBooking {
    Scanner scanner = new Scanner(System.in);
    Seats seats = new Seats();

    public String getUserChoice(){ //(String choice)
        String input = null;
        System.out.println("Please enter your choice: ");
        input = scanner.nextLine();
        System.out.println("input is = " + input);
        seats.seatIsEmpty(input);
        return input;
    }
}
