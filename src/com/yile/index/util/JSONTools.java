package com.yile.index.util;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JSONTools {
	
	private static final Logger	log	= Logger.getLogger(JSONTools.class); 

	/**
	 * 默认转obj 转json方法
	 * @param obj
	 * @return
	 */
	public static String TO_JSON(Object obj) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.getSerializationConfig().setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
			return mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			log.error("JsonGenerationException:",e);
		} catch (JsonMappingException e) {
			log.error("JsonMappingException:",e);
		} catch (IOException e) {
			log.error("IOException:",e);
		}
		return null;
	}
	
	/**
	 * string 转 对象
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T TO_OBJ(String str, T t) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return (T)mapper.readValue(str, t.getClass());
		} catch (JsonParseException e) {
			log.error("JsonParseException:",e);
		} catch (JsonMappingException e) {
			log.error("JsonMappingException:",e);
		} catch (IOException e) {
			log.error("IOException:",e);
		}
		return null;
	}
	
}
