package com.github.lany192.push.ios;

import com.github.lany192.push.IOSNotification;

public class IOSUnicast extends IOSNotification {

	public IOSUnicast() throws Exception{
			this.setPredefinedKeyValue("type", "unicast");
	}
	
	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }
}
