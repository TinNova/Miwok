package com.example.android.miwokv2;


/**
 * Created by Tin on 10/04/2017.
 * Word class represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Miwok translation of the default word */
    private String mMiwokTranslation;

    /** Default word */
    private String mDefaultTranslation;

    /** Miwok translation audio file */
    private int mAudioResourceId;

    /** Image representation of the word, the default value is set to no image, if there is an
     *  it will be overwritten by the image */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** This is the contact value that represents no image was provided for the word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor
     *
     * @param defaultTranslation is the default word we want to see translated to Miwok
     * @param miwokTranslation is the translation of the default word into Miwok
     * @param audioResourceId is the audio of the Miwok word
     */
    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    /**
     * Constructor
     *
     * @param defaultTranslation is the default word we want to see translated to Miwok
     * @param miwokTranslation is the translation of the default word into Miwok
     * @param imageResourceId is an image representation of the word being translated
     * @param audioResourceId is the audio of the Miwok word
     */
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    /**
     *
     * Method that gets the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     *
     * Method that gets the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     *
     * Method that gets the audio file of the Miwok word
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     *
     * Method that states the is no image, because mImageResourceId = NO_IMAGE_PROVIDED.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     *
     * Method that gets the image represnetation of the word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}

