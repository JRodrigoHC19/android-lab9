package com.miempresa.androidapp09.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import com.miempresa.androidapp09.model.Stopwatch


@Dao // Data access observer
interface StopwatchDataDao {

    @Query("SELECT * FROM stopwatch")
    fun getStopWatch(): Flow<List<Stopwatch>> // Para obtener todos los datos

    @Query("SELECT * FROM stopwatch WHERE id = :id")
    fun getStopWatchById(id: Long): Flow<Stopwatch> // Para  retornar un solo dato

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(stopwatch: Stopwatch)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(stopwatch: Stopwatch)

    @Delete
    suspend fun delete(stopwatch: Stopwatch)
}