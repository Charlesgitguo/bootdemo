package com.gqq.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by guo on 2017/7/11.
 */
public class Network1 {

    public static void main(String args[]) throws IOException {
       /* ServerSocket ss=new ServerSocket(8888);
        while (true){
            Socket socket=ss.accept();
            OutputStream outputStream=socket.getOutputStream();
            PrintStream printStream=new PrintStream(outputStream);
            printStream.print("hello world!!!");
            printStream.close();
            outputStream.close();
            socket.close();
        }*/

        ServerSocket ss=new ServerSocket(8888);
        Socket socket=ss.accept();
        PrintStream ps=new PrintStream(socket.getOutputStream());
        ps.println("server:haha");
        ps.println("server:ohoh");
        socket.shutdownOutput();
        System.out.println(socket.isClosed());
        Scanner scanner=new Scanner(socket.getInputStream());
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        ps.close();
        socket.close();
        ss.close();

    }
}
