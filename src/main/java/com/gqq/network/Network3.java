package com.gqq.network;

import java.io.IOException;
import java.net.*;

/**
 * Created by guo on 2017/7/12.
 */
public class Network3 {

    public  static void main(String args[]) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        String content="hello world";
        DatagramPacket packet=new DatagramPacket(content.getBytes(),content.length(), InetAddress.getByName("localhost"),5555);
        ds.send(packet);
        byte [] buff=new byte[1024];
        DatagramPacket packet1=new DatagramPacket(buff,0,buff.length);
        ds.receive(packet1);

        String rec=new String(packet1.getData());
        System.out.print(rec);
        ds.close();

    }
}
