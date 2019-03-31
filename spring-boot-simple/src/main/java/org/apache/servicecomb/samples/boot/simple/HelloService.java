package org.apache.servicecomb.samples.boot.simple;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestSchema(schemaId = "hello-java")
@RequestMapping(path = "/")
public class HelloService {
	@RequestMapping(path = "java/hello", method = RequestMethod.GET)
	public String sayHello(@RequestParam(name="name") String name) {
		return "Hello " + name;
	}
}
