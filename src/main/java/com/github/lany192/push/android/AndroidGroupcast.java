package com.github.lany192.push.android;

import com.github.lany192.push.AndroidNotification;
import org.json.JSONObject;

public class AndroidGroupcast extends AndroidNotification {

    public AndroidGroupcast() throws Exception {
        this.setPredefinedKeyValue("type", "groupcast");
    }

    public void setFilter(JSONObject filter) throws Exception {
        setPredefinedKeyValue("filter", filter);
    }
}
