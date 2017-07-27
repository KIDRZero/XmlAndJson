package com.orgjsonstudy.test;

import java.io.IOException;
import java.io.InputStream;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.apache.commons.io.IOUtils;
/*
 * 这种是org.json将xml转化为json
 * 整体思路就是:获取xml文件的输入流，之后将其转化为字符串
 * 再利用org.json提供的XML类将xml的字符串转化为jsonobject对象
 * 之后调用toString方法，这样输出的就是json格式的字符串
 * 这个org.json的缺点就是不能明确xml的标签属性与子标签之间的区别，会将他们统一进行处理，
 * 所以一般建议用json-lib来转化比较好
 */
public class JsonUtils {
	public static String xml2jsonString() throws JSONException, IOException {
		InputStream in = JsonUtils.class.getResourceAsStream("student.xml");
		String xml = IOUtils.toString(in);
		JSONObject xmlJSONObj = XML.toJSONObject(xml);
		return xmlJSONObj.toString();
	}

	public static void main(String[] args) throws JSONException, IOException {

		String string = xml2jsonString();
		System.out.println(string);

	}
}