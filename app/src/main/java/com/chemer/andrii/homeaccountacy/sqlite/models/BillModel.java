package com.chemer.andrii.homeaccountacy.sqlite.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import lombok.Data;

@Data
@Entity(tableName = "bill")
public class BillModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private Integer id;

    @ColumnInfo(name = "value")
    private String value;

    @ColumnInfo(name = "currency")
    private Double currency;
}
