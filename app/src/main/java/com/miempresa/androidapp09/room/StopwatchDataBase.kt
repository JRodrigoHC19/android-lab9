package com.miempresa.androidapp09.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.miempresa.androidapp09.model.Stopwatch

@Database(entities = [Stopwatch::class], version = 1, exportSchema = false)
abstract class StopwatchDataBase: RoomDatabase() {
    abstract fun stopDao(): StopwatchDataDao
}