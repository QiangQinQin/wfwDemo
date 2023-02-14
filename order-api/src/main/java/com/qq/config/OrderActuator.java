package com.qq.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderActuator {

//    派小弟看铺面   用java代码的方式写 servlet的配置文件
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){

        HystrixMetricsStreamServlet mss = new HystrixMetricsStreamServlet();

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(mss);

        servletRegistrationBean.setName("servletRegistrationBean");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.addUrlMappings("/hystrix.stream");  // 和 Hystrix DashBoard图形界面统一 ,好像用  turbine.stream 会有问题
        return servletRegistrationBean;
    }

}
