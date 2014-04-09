import java.net.*;
import java.io.*;

class UdpSend01
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

class UdpRece01
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds = new DatagramSocket(10003);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		System.out.println(new String(buf,0,dp.getLength()));
		ds.receive(dp);
		ds.close();
	}
}
