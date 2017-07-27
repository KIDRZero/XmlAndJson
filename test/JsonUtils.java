package com.orgjsonstudy.test;

import java.io.IOException;
import java.io.InputStream;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.apache.commons.io.IOUtils;
/*
 * ������org.json��xmlת��Ϊjson
 * ����˼·����:��ȡxml�ļ�����������֮����ת��Ϊ�ַ���
 * ������org.json�ṩ��XML�ཫxml���ַ���ת��Ϊjsonobject����
 * ֮�����toString��������������ľ���json��ʽ���ַ���
 * ���org.json��ȱ����ǲ�����ȷxml�ı�ǩ�������ӱ�ǩ֮������𣬻Ὣ����ͳһ���д���
 * ����һ�㽨����json-lib��ת���ȽϺ�
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