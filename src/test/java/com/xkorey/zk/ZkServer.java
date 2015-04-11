package com.xkorey.zk;

import java.io.IOException;

/**
 * Created by xkorey on 4/11/15.
 */
public class ZkServer {
    public static void main(String[]args){
        Conf conf = new Conf();
        conf.DIR="/home/xkorey/zkc";
        conf.PORT=22801;
        conf.TICK_TIME=2000;
        conf.MAX_CLIENT_CONNECTIONS=60;
        Server srv = new Server();
        try {
            srv.zkStart(conf);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
