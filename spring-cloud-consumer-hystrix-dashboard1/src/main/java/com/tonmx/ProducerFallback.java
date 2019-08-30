//package com.tonmx;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.client.ClientHttpResponse;
//import org.springframework.stereotype.Component;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//
///**
// * @author elln
// * @date 2019/8/29
// */
//@Component
//public class ProducerFallback implements FallbackProvider {
//    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);
//
//    //指定要处理的 service。
//    @Override
//    public String getRoute() {
//        return "spring-cloud-producer";
//    }
//
//    @Override
//    public ClientHttpResponse fallbackResponse() {
//        return new ClientHttpResponse() {
//            @Override
//            public HttpStatus getStatusCode() throws IOException {
//                return HttpStatus.OK;
//            }
//
//            @Override
//            public int getRawStatusCode() throws IOException {
//                return 200;
//            }
//
//            @Override
//            public String getStatusText() throws IOException {
//                return "OK";
//            }
//
//            @Override
//            public void close() {
//
//            }
//
//            @Override
//            public InputStream getBody() throws IOException {
//                return new ByteArrayInputStream("The service is unavailable.".getBytes());
//            }
//
//            @Override
//            public HttpHeaders getHeaders() {
//                HttpHeaders headers = new HttpHeaders();
//                headers.setContentType(MediaType.APPLICATION_JSON);
//                return headers;
//            }
//        };
//    }
//
//    @Override
//    public ClientHttpResponse fallbackResponse(Throwable cause) {
//        if (cause != null && cause.getCause() != null) {
//            String reason = cause.getCause().getMessage();
//            logger.info("Excption {}",reason);
//        }
//        return fallbackResponse();
//    }
//}
