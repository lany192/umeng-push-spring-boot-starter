package com.github.lany192.push.ios;

import com.github.lany192.push.IOSNotification;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;


public class IOSCustomizedcast extends IOSNotification {

	public IOSCustomizedcast() throws Exception {
			this.setPredefinedKeyValue("type", "customizedcast");
	}
	
	public void setAlias(String alias,String aliasType) throws Exception {
    	setPredefinedKeyValue("alias", alias);
    	setPredefinedKeyValue("alias_type", aliasType);
    }
		
	public void setFileId(String fileId, String aliasType) throws Exception {
		setPredefinedKeyValue("file_id", fileId);
		setPredefinedKeyValue("alias_type", aliasType);
	}

}
