package com.github.lany192.push.ios;

import com.github.lany192.push.IOSNotification;
import org.json.JSONObject;

public class IOSGroupcast extends IOSNotification {

	public IOSGroupcast() throws Exception {
			this.setPredefinedKeyValue("type", "groupcast");
	}
	
	public void setFilter(JSONObject filter) throws Exception {
    	setPredefinedKeyValue("filter", filter);
    }
}
