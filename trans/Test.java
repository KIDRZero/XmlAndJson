package com.netsfjson.trans;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
/*
 * �����������net.sf.json��xmlת��Ϊjson����������д���ǽ�xml�ļ�������Java�ļ�ͬһ��
 * Ŀ¼�£��õ������·����Ҳ�����þ���·��ָ��xmlλ��
 */
public class Test {
	  public static void ConvertXMLtoJSON()  {   
			 
	        InputStream is = Test.class.getResourceAsStream("student.xml");   
	        String xml;    
	        try {    
	            xml = IOUtils.toString(is);    
	            System.out.println(xml);    
	            XMLSerializer xmlSerializer = new XMLSerializer(); 
	            xmlSerializer.setSkipNamespaces(true);  
	            xmlSerializer.setTypeHintsEnabled(false);
	            JSON json = xmlSerializer.read(xml);    
	            System.out.println(json.toString(0));    
	        } catch (IOException e) {    
	            e.printStackTrace();    
	        }    
	    } 
	  public static void main(String[] args) {
		Test.ConvertXMLtoJSON();
	}
}
