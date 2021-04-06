package com.example.login.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KeyboardItem(
    @SerializedName("letter")
    val letter: String?,
    @SerializedName("numbers")
    val numbers: ArrayList<Int>
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        TODO("numbers")
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(letter)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<KeyboardItem> {
        override fun createFromParcel(parcel: Parcel): KeyboardItem {
            return KeyboardItem(parcel)
        }

        override fun newArray(size: Int): Array<KeyboardItem?> {
            return arrayOfNulls(size)
        }
    }
}