package com.example.sqlite.utilities;

public class Utility {

    // Field Constants user table
    public static final String TABLE_USER = "users";
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_TELEPHONE = "telephone";

    public static final String CREATE_TABLE_USERS = "CREATE TABLE " + TABLE_USER + " (" + FIELD_ID +
                                                    " INTEGER, " + FIELD_NAME + " TEXT, " + FIELD_TELEPHONE + " TEXT)";
}
