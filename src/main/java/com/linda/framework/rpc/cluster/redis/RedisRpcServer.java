package com.linda.framework.rpc.cluster.redis;

import com.linda.framework.rpc.cluster.RpcClusterServer;
import com.linda.framework.rpc.net.RpcNetBase;

public class RedisRpcServer extends RpcClusterServer{

	@Override
	public void onClose(RpcNetBase network, Exception e) {
		
	}

	@Override
	public void onStart(RpcNetBase network) {
		
	}

	@Override
	protected void doRegister(Class<?> clazz, Object ifaceImpl) {
		
	}

	@Override
	protected void doRegister(Class<?> clazz, Object ifaceImpl, String version) {
		
	}

}
