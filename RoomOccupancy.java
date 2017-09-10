/**
 * Author: Jack Brashier
 * Date: 09/08/2017
 * Professor: Kanchanawanchai
 * Purpose: To further demonstrate understanding of object-oriented programming.
 */
public class RoomOccupancy {
    private int numberInRoom;
    public static int totalNumber = 0;

    /** Default Constructor: 2 people in the room */
    public RoomOccupancy() {
        this.numberInRoom = 2;
        totalNumber += this.numberInRoom;
    }

    /** Custom Constructor */
    public RoomOccupancy(int occupants) {
        this.numberInRoom = occupants;
        totalNumber += this.numberInRoom;
    }

    /** Increases the amount of people in the room by 1 */
    public void addOneToRoom() {
        this.numberInRoom++;
        totalNumber++;
    }

    /** Decreases the amount of people in the room by 1 */
    public void removeOneFromRoom() {

        if (this.numberInRoom > 0) {
            this.numberInRoom--;
            totalNumber--;
        }
    }

    /** Returns the amount of people in the room */
    public int getNumber() {
        return this.numberInRoom;
    }

    /** Returns the total amount of people in all rooms */
    public int getTotal() {
        return totalNumber;
    }
}