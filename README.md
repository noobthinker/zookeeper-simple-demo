# zookeeper-simple-demo
zookeeper simple demo

简单解释：
客户端将初始值加1，然后写入server。
2个客户端输出的值的顺序是一致的。
说明客户端可已感知其他客户端的处理结果。

simple explan:
The client will be the initial value of 1, and then write to server.
2 client output value is consistent with the order.
That the client can have the perception of other client processing results.


Conf conf = new Conf();
// /home/user/zk
conf.DIR="/zookeeper";


test result.

the ZkServer log:
13:34:50,134  INFO NIOServerCnxnFactory:94 - binding to port 0.0.0.0/0.0.0.0:22801
13:34:57,623  INFO NIOServerCnxnFactory:197 - Accepted socket connection from /0:0:0:0:0:0:0:1:5466
13:34:57,632  INFO ZooKeeperServer:868 - Client attempting to establish new session at /0:0:0:0:0:0:0:1:5466
13:34:57,636  INFO FileTxnLog:199 - Creating new log file: log.1
13:34:57,759  INFO ZooKeeperServer:617 - Established session 0x14ca6f92d2b0000 with negotiated timeout 4000 for client /0:0:0:0:0:0:0:1:5466
13:35:00,357  INFO NIOServerCnxnFactory:197 - Accepted socket connection from /127.0.0.1:5474
13:35:00,360  INFO ZooKeeperServer:868 - Client attempting to establish new session at /127.0.0.1:5474
13:35:00,482  INFO ZooKeeperServer:617 - Established session 0x14ca6f92d2b0001 with negotiated timeout 4000 for client /127.0.0.1:5474
13:35:31,937  INFO PrepRequestProcessor:494 - Processed session termination for sessionid: 0x14ca6f92d2b0000
13:35:31,952  INFO NIOServerCnxn:1007 - Closed socket connection for client /0:0:0:0:0:0:0:1:5466 which had sessionid 0x14ca6f92d2b0000
13:35:34,657  INFO PrepRequestProcessor:494 - Processed session termination for sessionid: 0x14ca6f92d2b0001
13:35:34,765  INFO NIOServerCnxn:1007 - Closed socket connection for client /127.0.0.1:5474 which had sessionid 0x14ca6f92d2b0001

Zkclient1 log
0
20
1
21
2
22
3
23
4
24
5
25
6
26
7
27
8
28
9
29
10
30
13:35:31,946  INFO ZooKeeper:684 - Session: 0x14ca6f92d2b0000 closed
13:35:31,946  INFO ClientCnxn:512 - EventThread shut down


ZkClient2 log
20
1
21
2
22
3
23
4
24
5
25
6
26
7
27
8
28
9
29
10
30
13:35:34,765  INFO ZooKeeper:684 - Session: 0x14ca6f92d2b0001 closed
13:35:34,766  INFO ClientCnxn:512 - EventThread shut down


all done.
