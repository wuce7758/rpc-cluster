package com.linda.framework.rpc.cluster.redis;

import java.util.List;

import com.linda.framework.rpc.RpcService;
import com.linda.framework.rpc.cluster.RpcHostAndPort;
import com.linda.framework.rpc.cluster.admin.RpcAdminService;

public class RedisRpcAdminService implements RpcAdminService{
	
	private RedisRpcClient redisRpcClient;

	@Override
	public List<RpcHostAndPort> getRpcServers() {
		return null;
	}

	@Override
	public List<RpcService> getRpcServices(RpcHostAndPort rpcServer) {
		return null;
	}
}