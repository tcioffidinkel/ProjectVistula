import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.omg.CORBA.portable.InputStream;


public class testMain {
	
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("This");
		
		URL url = new URL("http://www.sec.gov/Archives/edgar/data/1288776/000128877615000039/a20150810form8-k.htm");
		java.io.InputStream in = url.openStream();
		FileOutputStream fos = new FileOutputStream(new File("yourFile2.htm"));
	
		System.out.println("reading file...");
		
		int length = -1;
		byte[] buffer = new byte[1024];// buffer for portion of data from
		                                // connection
		while ((length = in.read(buffer)) > -1) {
		    fos.write(buffer, 0, length);
		}
		fos.close();
		in.close();
		
		System.out.println("file was downloaded");
	}
}
