package com.chemer.andrii.homeaccountacy.sqlite.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import lombok.Data;

@Data
@Entity(tableName = "event", foreignKeys = @ForeignKey(
        entity = CategoryModel.class,
        parentColumns = "id",
        childColumns = "id_category"
))
public class EventModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private Integer id;

    @ColumnInfo(name = "id_category")
    private Integer idCategory;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "amount")
    private Double amount;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "data")
    private String data;

    @ColumnInfo(name = "time")
    private String time;
}
