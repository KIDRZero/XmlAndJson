package com.netsfjson.trans;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
/*
 * 下面这个是用net.sf.json将xml转化为json，这里这种写法是将xml文件放在与Java文件同一级
 * 目录下，用的是相对路径，也可以用绝对路径指明xml位置
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
