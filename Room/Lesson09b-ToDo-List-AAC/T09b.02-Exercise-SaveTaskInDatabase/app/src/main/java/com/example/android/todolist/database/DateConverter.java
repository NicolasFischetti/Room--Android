package com.example.android.todolist.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    } // room utliza este metodo cuando esta leyendo de la base de datos. Ademas crea un objeto dia

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
    // en este segundo metodo recive un objeto date y lo va a usar cuando esta leyendo en la data base
}
