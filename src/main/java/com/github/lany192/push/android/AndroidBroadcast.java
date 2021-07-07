package com.github.lany192.push.android;


import com.github.lany192.push.AndroidNotification;

public class AndroidBroadcast extends AndroidNotification {

    public AndroidBroadcast() throws Exception {
        this.setPredefinedKeyValue("type", "broadcast");
    }
}
