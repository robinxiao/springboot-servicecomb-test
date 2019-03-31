package org.apache.servicecomb.samples.boot.simple;

import org.apache.servicecomb.provider.pojo.RpcSchema;

@RpcSchema(schemaId = "fibonacciRpcEndpoint")
public class FibonacciRestEndpoint implements FibonacciEndpoint {

	@Override
	public long term(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
