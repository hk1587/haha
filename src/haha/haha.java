package haha;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;

/**
 * 
 *
 *  @version ： 1.0
 *  
 *  @author  ： 苏若年              <a href="mailto:DennisIT@163.com">发送邮件</a>
 *    
 *  @since   ： 1.0        创建时间:    2013-4-8    上午11:34:04
 *     
 *  @function： TODO        
 *
 */
/*public class haha {

     public static void main(String[] args) throws FileNotFoundException, IOException {
		          Properties pps = new Properties();
		          pps.load(new FileInputStream("Test.properties"));
		          Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
		          while(enum1.hasMoreElements()) {
		             String strKey = (String) enum1.nextElement();
		             String strValue = pps.getProperty(strKey);
		             System.out.println(strKey + "=" + strValue);
		         }
	     }
}*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class haha {

	public static void main(String[] args) throws ParseException {
		long sd=1495788929000L;  
        Date dat=new Date(sd);  
        GregorianCalendar gc = new GregorianCalendar();   
        gc.setTime(dat);  
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        String sb=format.format(gc.getTime()); 
        String haha=String.valueOf(sd);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
        long millionSeconds = sdf.parse("2017-05-26 14:55:29").getTime();//毫秒
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println(millionSeconds);
        
        Date now = new Date();
        long time = 30*60*1000;//30分钟
        Date afterDate = new Date(now .getTime() + time);//30分钟后的时间
        Date beforeDate = new Date(now .getTime() - time);//30分钟前的时间
        System.out.println(sdf.format(afterDate ));
        System.out.println(sdf.format(beforeDate));
        System.out.println(sdf1.format(now));

        System.out.println(sb);  
        System.out.println(haha);  
	}

}
