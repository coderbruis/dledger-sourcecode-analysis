# dledger-sourcecode-analysis

DLedger源码分析。

DLedger是一款基于Raft的CommitLog存储库，本库的学习首先得熟悉Raft算法、RocketMQ源码。

## Raft算法原理以及流程分析

Raft算法核心逻辑：通过一切以领导为准的方式，来实现不同角色间"值"的共识以及一致性问题。

Raft算法核心流程有三步：
1. 如何选举出领导者？
2. 如何复制日志？
3. 如何解决成员变更问题？

### 1. 如何选举出领导者？

Raft中包含角色有三中：领导者（Leader）、跟随者（Follower）、候选者（Candidate）

- 领导者（Leader）：处理客户端的写请求；管理日志复制；与跟随者维持心跳关系；
- 跟随者（Follower）：接受和处理来之领导者的消息，当领导者故障了，推荐自己进行选举，推荐后称为候选者；
- 候选者（Candidate）：向其他跟随者节点发送请求投票RPC，通知进行投票，若获得大多数节点的投票，则成功竞选为领导者；

选举过程:

TODO

### 2. 如何复制日志？

### 3. 如何解决成员变更问题？

## DLedger框架运行流程分析

TODO

## RocketMQ基于DLedger实现的自动选举复制能力分析

TODO

## 参考

- [DLedger —基于 raft 协议的 commitlog 存储库](https://developer.aliyun.com/article/713017)