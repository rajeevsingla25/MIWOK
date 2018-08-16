package com.example.keyss.miwok;

public class Word


{


    private String mDefaultTranslation;








    private int mAudioResourceId;





    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
 private static final int NO_IMAGE_PROVIDED=-1;
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId=audioResourceId;
    }



    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;


    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImgaeResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



    public int getAudioResourceId() {
        return mAudioResourceId;
    }



}