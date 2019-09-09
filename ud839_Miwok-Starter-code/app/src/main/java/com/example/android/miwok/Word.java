package com.example.android.miwok;

public class Word {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mEnglishName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mOtherName;

    private int mImageId = No_Image_Shown;

    public static final int No_Image_Shown = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */

    public Word(String vName, String vOther, int audioResourceId)
    {
        mEnglishName = vName;
        mOtherName = vOther;
        mAudioResourceId = audioResourceId;

    }
    public Word(String vName, String vOther, int vImage,int audioResourceId )
    {
        mEnglishName = vName;
        mOtherName = vOther;
        mImageId = vImage;
        mAudioResourceId = audioResourceId;

    }

    /**
     * Get the name of the Android version
     */
    public String getEnglishName()
    {
        return mEnglishName;
    }

    /**
     * Get the Android version number
     */
    public String getOtherName()
    {
        return mOtherName;
    }


    public int getImageName()
    {
        return mImageId;
    }


    public boolean hasImage(){

        return mImageId != No_Image_Shown;
    }
    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}