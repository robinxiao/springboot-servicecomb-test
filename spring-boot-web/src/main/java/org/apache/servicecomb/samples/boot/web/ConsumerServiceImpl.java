package org.apache.servicecomb.samples.boot.web;

import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerServiceImpl {

	@RpcReference(microserviceName = "worker", schemaId = "fibonacciRpcEndpoint")
	private FibonacciCalculator fibonacciCalculator;
	
	public long getTerm() {
		return fibonacciCalculator.term(222);
	}

}
