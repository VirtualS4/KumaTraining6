package com.example.rona.kumatraining6;

import android.os.Parcel;
import android.os.Parcelable;

public class Bear implements Parcelable {

    private String name;
    private int umur;
    private String email;
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.umur);
        dest.writeString(this.email);
        dest.writeString(this.city);
    }

    public Bear() {
    }

    protected Bear(Parcel in) {
        this.name = in.readString();
        this.umur = in.readInt();
        this.email = in.readString();
        this.city = in.readString();
    }

    public static final Parcelable.Creator<Bear> CREATOR = new Parcelable.Creator<Bear>() {
        @Override
        public Bear createFromParcel(Parcel source) {
            return new Bear(source);
        }

        @Override
        public Bear[] newArray(int size) {
            return new Bear[size];
        }
    };
}
