package com.example.main;

public class DBHelper {

    //LIBRARY_SYSTEM TABLES
    static class MainFields {
        public static String LIBRARY_TABLE = "library";
        public static String ADMIN_TABLE = "admin";
        public static String MANAGER_TABLE = "manager";
        public static String OTHERSTAFF_TABLE = "otherStaff";
        public static String STUDENT_TABLE = "student";
        public static String CELL_TABLE = "cell";
        public static String SHELF_TABLE = "shelf";
        public static String BOOKS_TABLE = "books";
        public static String VIDEOS_TABLE = "videos";
        public static String NEWSLETTER_TABLE = "newsLetter";
        public static String ITEM_TABLE = "item";
        public static String STUDENT_ITEM_TABLE = "student_item";
        public static String OTHERSTAFF_ITEM_TABLE = "otherStaff_item";
        public static String STUDENT_LIBRARY_TABLE = "student_library";
        /*
        public static String NAME_FIELD = "name";
        public static String DATE_OF_BIRTH_FIELD = "dateOfBirth";
        public static String SEX_FIELD = "sex";
        public static String EMAIL_FIELD = "email";
        public static String PHONE_FIELD = "phone";
        public static String HOME_ADDRESS_FIELD = "homeAddress";*/
    }
    MainFields mainFields = new MainFields();
    //TABLE FIELD NAMES
    //library table fields
    static class LibraryFields {
        public static String LIBRARY_NAME = "name";
        public static String LIBRARY_EMAIL = "email";
        public static String LIBRARY_PHONE = "phone";
        public static String LIBRARY_LOCATION = "location";
        public static String LIBRARY_TYPE = "type";
        public static String LIBRARY_ID = "libraryId";
    }
    LibraryFields libraryFields = new LibraryFields();

    //admin table fields
    static class AdminTable {
        public static String ADMIN_NAME = "name";
        public static String ADMIN_SEX = "sex";
        public static String ADMIN_DATEOFBIRTH = "dateOfBirth";
        public static String ADMIN_EMAIL = "email";
        public static String ADMIN_PHONE = "phone";
        public static String ADMIN_HOMEADDRESS = "homeAddress";
        public static String ADMIN_ID = "adminId";
        public static String ADMIN_LIBRARY = "libraryId";
        public static String ADMIN_USERNAME = "username";
        public static String ADMIN_PASSWORD = "password";
    }
    AdminTable adminTable = new AdminTable();

    //manager table fields
    static class ManagerTable {
        public static String MANAGER_NAME = "name";
        public static String MANAGER_SEX = "sex";
        public static String MANAGER_DATEOFBIRTH = "dateOfBirth";
        public static String MANAGER_EMAIL = "email";
        public static String MANAGER_PHONE = "phone";
        public static String MANAGER_HOMEADDRESS = "homeAddress";
        public static String MANAGER_ID = "managerId";
        public static String MANAGER_USERNAME = "username";
        public static String MANAGER_PASSWORD = "password";
        public static String MANAGER_LIBRARY = "libraryId";
    }
    ManagerTable managerTable = new ManagerTable();

    //OtherStaff table fields
    static class OtherStaffTable {
        public static String OTHERSTAFF_NAME = "name";
        public static String OTHERSTAFF_SEX = "sex";
        public static String OTHERSTAFF_DATEOFBIRTH = "dateOfBirth";
        public static String OTHERSTAFF_EMAIL = "email";
        public static String OTHERSTAFF_PHONE = "phone";
        public static String OTHERSTAFF_USERNAME = "username";
        public static String OTHERSTAFF_PASSWORD = "password";
        public static String OTHERSTAFF_ID = "staffId";
        public static String OTHERSTAFF_HOMEADDRESS = "homeAddress";
        public static String OTHERSTAFF_LIBRARY = "libraryId";
    }
    OtherStaffTable otherStaffTable = new OtherStaffTable();

    //student table fields
    static class StudentTable {
        public static String STUDENT_NAME = "name";
        public static String STUDENT_SEX = "sex";
        public static String STUDENT_DATEOFBIRTH = "dateOfBirth";
        public static String STUDENT_EMAIL = "email";
        public static String STUDENT_PHONE = "phone";
        public static String STUDENT_USERNAME = "username";
        public static String STUDENT_PASSWORD = "password";
        public static String STUDENT_ID = "studentId";
        public static String STUDENT_MANAGER = "managerId";
    }
    StudentTable studentTable = new StudentTable();

    //cell fields
    static class CellTable {
        public static String CELL_SHELFID = "shelfId";
        public static String CELL_CELLNUMBER = "cellNumber";
    }
    CellTable cellTable = new CellTable();

    //shelf fields
    static class ShelfTable {
        public static String SHELF_SECTION = "_section";
        public static String SHELF_ROOM = "room";
        public static String SHELF_SHELFNUMBER = "shelfNumber";
        public static String SHELF_ID = "shelfId";
        public static String SHELF_MANAGER = "managerId";
        public static String SHELF_LIBRARY = "libraryId";
    }
    ShelfTable shelfTable = new ShelfTable();

    //
    static class ItemStudentTable{
        public static String ITEM_ID = "itemId";
        public static String STUDENT_ID = "studentId";
        public static String RATING = "rating";
        public static String RECOMMENDATION = "recommendation";
        public static String LIKES;
    }
    ItemStudentTable itemStudentTable = new ItemStudentTable();

}