package com.example.android.quakereport;

/**
 * Created by Tina Taylor on 7/1/18.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Constructs a new com.example.android.quakereport.Earthquake object
     *
     * @param magnitude            is the earthquake magnitude
     * @param location             is the earthquake location
     * @param timeInMilliseconds;e is the earthquake date and time in Unix time
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the date of the earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
