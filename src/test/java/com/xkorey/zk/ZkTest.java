package com.xkorey.zk;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by xkorey on 4/10/15.
 */
public class ZkTest extends TestCase {

    @Test
    public void testSrv(){
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

    @Test
    public void testClient1(){
        Client client = new Client();
        client.initZkClient("localhost:22801",3000,"/zkc");
        client.dataMaker(1);
    }

    @Test
    public void testClient20(){
        Client client = new Client();
        client.initZkClient("localhost:22801",3000,"/zk1");
        client.dataMaker(20);
    }
}
