package com.xiangyu.material.gitandroid;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shixiangyu on 2019-10-30.
 */
public class VipName implements Parcelable {
    public String name;
    public String price;

    public VipName() {

    }

    protected VipName(Parcel in) {
        name = in.readString();
        price = in.readString();
    }

    public static final Creator<VipName> CREATOR = new Creator<VipName>() {
        @Override
        public VipName createFromParcel(Parcel in) {
            return new VipName(in);
        }

        @Override
        public VipName[] newArray(int size) {
            return new VipName[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(price);
    }
}
