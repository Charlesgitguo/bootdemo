package com.gqq.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by guo on 2017/7/12.
 */
public class Network4 {

    public  static void main(String args[]) throws IOException {
        DatagramSocket ds=new DatagramSocket(5555);

        byte [] buff=new byte[3];
        DatagramPacket packet=new DatagramPacket(buff,buff.length);
        System.out.print(packet.getLength());
        ds.receive(packet);
        String rec=new String(packet.getData());
        System.out.print(rec);
        String fromClient="from client";
        DatagramPacket packet1=new DatagramPacket(fromClient.getBytes(),fromClient.length(), packet.getAddress(),packet.getPort());
        ds.send(packet1);



        ds.close();

    }
}
