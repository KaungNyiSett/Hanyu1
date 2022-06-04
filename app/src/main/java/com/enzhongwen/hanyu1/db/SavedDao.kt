package com.enzhongwen.hanyu1.db

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface SavedDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun save(vocabData: VocabData)

    @Query("SELECT * FROM saved_table_1_1")
    fun readAllData(): LiveData<MutableList<VocabData>>

    @Query("DELETE FROM saved_table_1_1")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteItem(delete: VocabData)

}