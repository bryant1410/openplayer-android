package com.audionowdigital.android.openplayer;

/**
 * Created by cristi on 13/10/14.
 */
public interface DecodeFeedListener {
    public void onReadFeedData(short[] pcmData, int amountToRead);
}
