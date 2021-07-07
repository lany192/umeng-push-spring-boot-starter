package com.github.lany192.push.android;


import com.github.lany192.push.AndroidNotification;

public class AndroidFilecast extends AndroidNotification {

    public AndroidFilecast() throws Exception {
        this.setPredefinedKeyValue("type", "filecast");
    }

    public void setFileId(String fileId) throws Exception {
        setPredefinedKeyValue("file_id", fileId);
    }
}