import java.net.*;
import java.io.*;

class UcpSend01
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds = new DatagramSocket();

		byte[] buf = "hi git,hi java ".getBytes();

		DatagramPacket dp = new DatagramPacket(buf,buf.length
				,InetAddress.getByAddress(new byte[]{127,0,0,1}),10003);
		ds.send(dp);
		ds.close();
	}
}
