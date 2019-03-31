package org.apache.servicecomb.samples.boot.web;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestSchema(schemaId = "hello-web")
@RequestMapping(path = "/web/")
public class HelloService {
	
	@Autowired
	private ConsumerServiceImpl consumerSevice;
	
	@RequestMapping(path = "hello", method = RequestMethod.GET)
	public long sayHello(@RequestParam(name="name") String name) {
		
		return consumerSevice.getTerm();
	}
}
