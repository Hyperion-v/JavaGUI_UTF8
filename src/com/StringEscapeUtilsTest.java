//package com;
//
//import org.apache.commons.lang3.StringEscapeUtils;
//
////apache工具包common-lang中有一个很有用的处理字符串的工具类，其中之一就是StringEscapeUtils,这个工具类是在2.3版本以上加上的去的，利用它能很方便的进行html,xml,Java等的转义与反转义，而且还能对关键字符串进行处理预防SQL注入，不过好像common-lang3.0以后我看着好像没这个处理SQL语句的方法了，想用的话前提时引入对应的jar包，以下为它的部分方法：
//
//public class StringEscapeUtilsTest {  
//  
//    public static void main(String args[]){  
//          
//        String sql="1' or '1'='1";  
////        System.out.println("防SQL注入:"+StringEscapeUtils.escapeSql(sql)); //防SQL注入  
////          
//        System.out.println("转义HTML,注意汉字:"+StringEscapeUtils.escapeHtml3("<font>chen磊  xing</font>"));    //转义HTML,注意汉字  
//        System.out.println("反转义HTML:"+StringEscapeUtils.unescapeHtml3("<font>chen磊  xing</font>"));  //反转义HTML
//        
//        String str = "&#39;";
//        System.out.println("反转义HTML:"+StringEscapeUtils.unescapeHtml3(str));  //反转义HTML
////          
////        System.out.println("转成Unicode编码："+StringEscapeUtils.escapeJava("陈磊兴"));     //转义成Unicode编码  
////          
////        System.out.println("转义XML："+StringEscapeUtils.escapeXml("<name>陈磊兴</name>"));   //转义xml  
////        System.out.println("反转义XML："+StringEscapeUtils.unescapeXml("<name>陈磊兴</name>"));    //转义xml  
//          
//    }  
//}  