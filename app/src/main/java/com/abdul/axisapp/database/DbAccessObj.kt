package com.abdul.axisapp.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.abdul.axisapp.database.FeedReaderContract.FeedEntry;


class DbAccessObj(var context: Context) {
    lateinit var database: SQLiteDatabase

    fun openDb(){
        var dbHelper = FeedReaderDbHelper(context);
        database = dbHelper.writableDatabase
    }
    fun closeDb(){}
    fun createRow(titleString: String, subTitleString: String) {

        var values = ContentValues()
        values.put(FeedEntry.COLUMN_NAME_TITLE,titleString)
        values.put(FeedEntry.COLUMN_NAME_SUBTITLE,subTitleString)

        database.insert(FeedEntry.TABLE_NAME,null,values)
    }
    
    fun readRow(): String{
     var cursor = database.query(FeedEntry.TABLE_NAME,null,null,null,null,null,null,)
        cursor.moveToFirst()
        var titleIndex = cursor.getColumnIndexOrThrow(FeedEntry.COLUMN_NAME_TITLE)
        var subtitleIndex = cursor.getColumnIndexOrThrow(FeedEntry.COLUMN_NAME_SUBTITLE)

        var title = cursor.getString(titleIndex)
        var subtitle = cursor.getString(subtitleIndex)

        return  title + "\n"+ subtitle
    }
    fun deleteRow(){}
    fun updateRow(){}

}