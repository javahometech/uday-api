package com.example.demo.service;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

import com.google.common.io.Resources;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class EC2JsonService {

	public static String getInstances() throws Exception {
		URL resource = Resources.getResource("instances.json");
		InputStream fis = resource.openStream();
		BufferedInputStream bis = new BufferedInputStream(fis);
		StringBuffer sb = new StringBuffer();
		int i;
		while ((i = bis.read()) != -1) {
			sb.append((char) i);
		}
//		System.out.println(sb.toString());
		JsonObject jsonObject = new JsonParser().parse(sb.toString()).getAsJsonObject();
		
		return jsonObject.toString();
	}

	public static String getInstance(String instanceId) throws Exception {
		URL resource = Resources.getResource("instances.json");
		InputStream fis = resource.openStream();
		BufferedInputStream bis = new BufferedInputStream(fis);
		StringBuffer sb = new StringBuffer();
		int i;
		while ((i = bis.read()) != -1) {
			sb.append((char) i);
		}
		JsonObject jsonObject = new JsonParser().parse(sb.toString()).getAsJsonObject();
		JsonArray asJsonArray = jsonObject.get("Reservations").getAsJsonArray();
		for (JsonElement jsonElement : asJsonArray) {
			JsonArray asJsonArray2 = jsonElement.getAsJsonObject().get("Instances").getAsJsonArray();
			for (JsonElement jsonElement2 : asJsonArray2) {
				JsonElement instance = jsonElement2.getAsJsonObject().get("InstanceId");
				
				if(instance.getAsString().equals(instanceId)) {
					return jsonElement2.toString();
				}
				
			}
			
		}
		return "Instance Not found wiht Id - "+instanceId;
	}

}
