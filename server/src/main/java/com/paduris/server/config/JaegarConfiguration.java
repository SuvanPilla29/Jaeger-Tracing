package com.paduris.server.config;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class JaegarConfiguration {

    @Bean
    public WebClient webClient(){
        return WebClient.create();
    }

    public JaegerTracer jaegarTracer(){
        return new io.jaegertracing.Configuration("jaegar-server")
                .withSampler(new io.jaegertracing.Configuration.SamplerConfiguration().withType(ConstSampler.TYPE)
                .withParam(1))
                .withReporter(new io.jaegertracing.Configuration.ReporterConfiguration().withLogSpans(Boolean.TRUE))
                .getTracer();
    }

}
