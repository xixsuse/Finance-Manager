package com.chemer.andrii.homeaccountacy.sqlite.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.chemer.andrii.homeaccountacy.sqlite.models.EventModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Maybe;

@Dao
public interface EventDao {
    @Query("SELECT * FROM event ORDER BY Date ASC")
    Maybe<List<EventModel>> getAll();

    @Query("SELECT * FROM event WHERE id IN (:ids)")
    Flowable<List<EventModel>> loadAllByIds(List<Integer> ids);

    @Query("SELECT * FROM event where uid = :id")
    Maybe<EventModel> findById(int id);

    @Insert
    void insertAll(EventModel... event);

    @Delete
    void delete(EventModel event);

    @Update
    public void updateEvents(EventModel... event);
}
