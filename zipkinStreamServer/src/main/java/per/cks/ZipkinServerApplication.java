package per.cks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
//@EnableZipkinStreamServer//配置可以作为zipkinserver、
@EnableZipkinServer			//此配置为E版本配置，既可以接受https传输，也可以是消息中间件传输
public class ZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class,args);
    }
}
