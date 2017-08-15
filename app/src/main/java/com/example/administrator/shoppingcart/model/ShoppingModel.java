package com.example.administrator.shoppingcart.model;

import android.os.Parcel;
import android.os.Parcelable;


public class ShoppingModel implements Parcelable {


    private int id;

    private String name;

    private String path;

    private String description;

    private int num;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public ShoppingModel(int id, String name, String path, String description, int num, double price) {
        this.id=id;
        this.name = name;
        this.path = path;
        this.description = description;
        this.num = num;
        this.price=price;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.path);
        dest.writeString(this.description);
        dest.writeInt(this.num);
        dest.writeDouble(this.price);
    }

    public ShoppingModel() {
    }

    protected ShoppingModel(Parcel in) {
        this.id=in.readInt();
        this.name = in.readString();
        this.path = in.readString();
        this.description = in.readString();
        this.num=in.readInt();
        this.price=in.readDouble();
    }

    public static final Creator<ShoppingModel> CREATOR = new Creator<ShoppingModel>() {
        @Override
        public ShoppingModel createFromParcel(Parcel source) {
            return new ShoppingModel(source);
        }

        @Override
        public ShoppingModel[] newArray(int size) {
            return new ShoppingModel[size];
        }
    };
}
