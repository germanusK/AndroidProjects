package com.example.accounts;

public class ItemAddress {

    //Fields
    private static String Section;
    private static String Room;
    private static String Shelf;
    private static String Cell;

    //Constructors
    public ItemAddress(){}

    public ItemAddress(String section, String room, String shelf, String cell)
    {
        setSection(section);
        setRoom(room);
        setShelf(shelf);
        setCell(cell);
    }

    public static String getSection() {
        return Section;
    }

    public static void setSection(String section) {
        Section = section;
    }

    public static String getRoom() {
        return Room;
    }

    public static void setRoom(String room) {
        Room = room;
    }

    public static String getShelf() {
        return Shelf;
    }

    public static void setShelf(String shelf) {
        Shelf = shelf;
    }

    public static String getCell() {
        return Cell;
    }

    public static void setCell(String cell) {
        Cell = cell;
    }

    @Override
    public String toString() {
        return String.format("Section > %s: Room > %s: Shelf > %s: Cell > %s", Section, Room, Shelf, Cell);
    }
}
