package com.xiangli.coolweather;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/2/23.
 */

public class Parcleable implements Parcelable{
    private String name;
    private int age;

    protected Parcleable(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<Parcleable> CREATOR = new Creator<Parcleable>() {
        @Override
        public Parcleable createFromParcel(Parcel in) {
            return new Parcleable(in);
        }

        @Override
        public Parcleable[] newArray(int size) {
            return new Parcleable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
}
