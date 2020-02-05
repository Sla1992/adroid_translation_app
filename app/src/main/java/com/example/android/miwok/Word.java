package com.example.android.miwok;

import android.content.Context;

public class Word {


    // Values
    private String mDefaultTranslation;

    private String mSerbianTranslation;

    private Context mContext;

    public Word(String defaultTranslation, String serbianTranslation){

        mDefaultTranslation = defaultTranslation;
        mSerbianTranslation = serbianTranslation;

    }


    // Getter & Setter
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getSerbianTranslation() {
        return mSerbianTranslation;
    }

    public void setSerbianTranslation(String mSerbianTranslation) {
        this.mSerbianTranslation = mSerbianTranslation;
    }

}
