package com.github.lany192.push.ios;

import com.github.lany192.push.IOSNotification;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;

public class IOSFilecast extends IOSNotification {

	public IOSFilecast() throws Exception {
			this.setPredefinedKeyValue("type", "filecast");
	}
	
	public void setFileId(String fileId) throws Exception {
    	setPredefinedKeyValue("file_id", fileId);
    }
}
