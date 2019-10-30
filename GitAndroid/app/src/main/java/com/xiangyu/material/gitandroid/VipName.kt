package com.xiangyu.material.gitandroid

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by shixiangyu on 2019-10-30.
 */
class VipName() : Parcelable {
    var name: String? = null
    var price: String? = null

    constructor(parcel: Parcel) : this() {
        name = parcel.readString()
        price = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<VipName> {
        override fun createFromParcel(parcel: Parcel): VipName {
            return VipName(parcel)
        }

        override fun newArray(size: Int): Array<VipName?> {
            return arrayOfNulls(size)
        }
    }
}