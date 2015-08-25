package com.barclays;

public class MaterialWithLength{
    private float meterLength;
    private float centimeterLength;

    public float getMeterLength() {
        return meterLength;
    }

    public float getCentimeterLength() {
        return centimeterLength;
    }

    public MaterialWithLength(int meterLength, int centimeterLength) {
        this.meterLength = meterLength;
        this.centimeterLength = centimeterLength;
    }



}
