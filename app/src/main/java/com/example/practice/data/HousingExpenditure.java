package com.example.practice.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author by syt
 * on 2021/1/13
 * desc:记事本
 */
@Entity(tableName = "housing_expenditure")
public class HousingExpenditure {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int rent;
    @ColumnInfo(name = "electricity_fees")
    private int electricityFees;
    @ColumnInfo(name = "maintenance_cost")
    private int maintenanceCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getElectricityFees() {
        return electricityFees;
    }

    public void setElectricityFees(int electricityFees) {
        this.electricityFees = electricityFees;
    }

    public int getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(int maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

}
