package com.github.lany192.push.ios;


import com.github.lany192.push.IOSNotification;

public class IOSBroadcast extends IOSNotification {
	public IOSBroadcast() throws Exception {

			this.setPredefinedKeyValue("type", "broadcast");	
		
	}
}
