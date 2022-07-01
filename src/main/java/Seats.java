import java.util.Locale;
import java.util.Scanner;

public class Seats {
    public int numOfAisle = 3;
    public int numOfSeatsInAisle = 6;
    public int totalSeats = numOfAisle * numOfSeatsInAisle;
    int aisleCounter = 0;
    int[] plane = new int[totalSeats];
    String abcSeats = "ABCDEF";
    String seatLoc;
    Scanner scanner = new Scanner(System.in);

    public int getNumOfSeatsInAisle() {
        return numOfSeatsInAisle;
    }

    public void printSeats() {
        int column = 0;
        String temp = null;

        for (int n = 0; n < totalSeats; n++) {
            for (int s = 0; s < numOfAisle; s++) {
                for (int i = 0; i < numOfSeatsInAisle; i++) {
                    int row = s+1;
                    column = i % numOfSeatsInAisle; //get column value
                    temp = String.valueOf(abcSeats.charAt(column));
                    seatLoc = Integer.toString(row).concat(temp);
                    System.out.print(seatLoc + " ");
                    n++;
                }
                System.out.println();
            }
        }
    }

    int convertToIndex(String input){
        String getRow = String.valueOf(input.charAt(0));
        int row = Integer.parseInt(getRow) - 1;
        String getColumn = String.valueOf(input.charAt(1));
        getColumn = getColumn.toUpperCase(Locale.ROOT);
        int column = abcSeats.indexOf(getColumn);
        int index = row * numOfSeatsInAisle + column;
        return index;
    }

    String convertToString(int index){
        int row = index / numOfSeatsInAisle + 1;
        int column = index % numOfSeatsInAisle;
        String temp = String.valueOf(abcSeats.charAt(column));
        String loc = Integer.toString(row).concat(temp);
        return loc;
    }

    int valueAtIndex(int index){
        int value = plane[index];
        return value;
    }

    boolean seatIsEmpty (String seatChoice){
        String result;
        int chosenIndex = convertToIndex(seatChoice);
        if (valueAtIndex(chosenIndex) == 0){
            System.out.println("Seat is empty");
            result = "Empty";
            return true;
        }
        System.out.println("Seat is occupied, please choose another one");
        result = "Occupied";
        return false;
    }

    public String getUserChoice(){ //(String choice)
        String input = null;
        System.out.println("Please enter your choice: ");
        input = scanner.nextLine();
        String result = String.valueOf(seatIsEmpty(input));
        return input;
    }

    public void refreshSeatPlan(String result, String seatForBooking){
        result = result;
        int index = convertToIndex(seatForBooking);

        if (result == "Empty"){
            plane[index] = 1;
        }
        else if (result == "Occupied"){
            plane[index] = 8; // already occupied
        } else {
            plane[index] = 0;
        }

        int x = 0;
        for (int j = 0; j < numOfAisle; j++){
            for (int i = 0; i < numOfSeatsInAisle; i++){
                if (plane[x] == 1) {
                    System.out.print(" X ");
                } else if (plane[x] == 8){
                    System.out.print(" o ");
                } else {
                    System.out.print(convertToString(x) + " ");
                }
                x++;
            }
            System.out.println();
        }
        System.out.println();
    }

}
