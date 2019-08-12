package com.app.sqlitebottomnav.utility;

public class Utility {

    public static final String DB_NAME = "db_clients";
    public static final String TABLE_NAME = "clients";
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_LAST_NAME = "last_name";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_PHONE = "phone";

    public static final String CREATE_TABLE_CLIENT = "CREATE TABLE " + TABLE_NAME + " (" + FIELD_ID +" INTEGER, " +
            FIELD_NAME +"  TEXT, " + FIELD_LAST_NAME + " TEXT, " + FIELD_EMAIL + " TEXT, " +
            FIELD_PHONE + " TEXT)";

    public static final String DROP_TABLE_CLIENT = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public static final String INSERT_MESSAGE = "Client has been successfully registered!";
}
