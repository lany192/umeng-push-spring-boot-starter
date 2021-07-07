package com.github.lany192.push.android;


import com.github.lany192.push.AndroidNotification;

public class AndroidUnicast extends AndroidNotification {

	public AndroidUnicast() throws Exception {
			this.setPredefinedKeyValue("type", "unicast");	
	}
	
	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }

}