package com.xkorey.zk;

/**
 * Created by xkorey on 4/11/15.
 */
public class ZkClient2 {
    public static void main(String[]args){
        Client client = new Client();
        client.initZkClient("localhost:22801",3000,"/zka");
        client.dataMaker(20);
    }
}
