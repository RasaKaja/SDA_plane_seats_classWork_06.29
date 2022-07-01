import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Seats seats = new Seats();
        SeatBooking booking = new SeatBooking();


        //seats.printSeats();
//        seats.plane[1] = 1;
//        System.out.println(Arrays.toString(seats.plane));
//        seats.printSeats();
//        seats.plane[2] = 2;
//        seats.plane[5] = 5; //1f
//        seats.plane[8] = 8; //2c
//        System.out.println(Arrays.toString(seats.plane));
        seats.printSeats();
        //System.out.println(seats.convertToIndex("3d"));
        //System.out.println("Seats value at index " + seats.valueAtIndex(0));

        //int i = booking.seats.plane[5];
        //System.out.println(seats.seatIsEmpty("1c"));
        //System.out.println("convertToIndex = " + seats.convertToIndex("2c"));
        //booking.getUserChoice();
        //System.out.println(seats.convertToString(17));

        seats.getUserChoice();
        //seats.printSeats();
        seats.refreshSeatPlan("Empty", "1a");
        seats.refreshSeatPlan("Empty", "3a");
        seats.refreshSeatPlan("Empty", "3f");
        seats.refreshSeatPlan("Empty", "1a");
    }


}
