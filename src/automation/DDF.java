package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DDF {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\91630\\Downloads\\credentials.properties");
Properties p=new Properties();
p.load(fis);
String UN=p.getProperty("un");
System.out.println(UN);
	}

}
