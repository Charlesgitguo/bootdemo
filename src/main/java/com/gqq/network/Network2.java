package com.gqq.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by guo on 2017/7/11.
 */
public class Network2 {

    public static void main(String args[]) throws IOException {
      /*  Socket socket=new Socket("localhost",8888);
        InputStream inputStream=socket.getInputStream();
        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
        String res=reader.readLine();
        System.out.print(res);
        reader.close();
        inputStream.close();
        socket.close();*/

        Socket socket=new Socket("localhost",8888);
        PrintStream ps=new PrintStream(socket.getOutputStream());
        ps.println("client:hello world");
        ps.println("client:owofdkje");
        InputStream is=socket.getInputStream();
        int len=0;
        byte[] buff=new byte[1024];
        while ((len=is.read(buff,0,1024))!=-1){
            String res=new String(buff);
            System.out.println(res);

        }
        ps.close();
        is.close();
        socket.close();

    }
}
