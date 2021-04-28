package cn.com.xuxiaowei.web.configuration;

import cn.com.xuxiaowei.web.service.HelloWebService;
import com.sun.xml.internal.ws.api.BindingID;
import com.sun.xml.internal.ws.transport.http.server.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * WebService 配置
 *
 * @author 徐晓伟
 */
@Configuration
public class WebServiceConfiguration {

    private HelloWebService helloWebService;

    @Autowired
    public void setHelloWebService(HelloWebService helloWebService) {
        this.helloWebService = helloWebService;
    }

    @Bean
    public Endpoint helloWebServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(BindingID.SOAP12_HTTP, helloWebService);
        endpoint.publish("http://127.0.0.1:8081/helloWebService");
        return endpoint;
    }

}
