# spring-cloud-study

1、外部或者内部的非Spring Cloud项目都统一通过API网关（Zuul）来访问内部服务.
2、网关接收到请求后，从注册中心（Eureka）获取可用服务
3、由Ribbon进行均衡负载后，分发到后端的具体实例
4、微服务之间通过Feign进行通信处理业务
5、Hystrix负责处理服务超时熔断
6、Turbine监控服务间的调用和熔断相关指标
