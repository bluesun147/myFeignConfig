package com.haechan.feign;

import com.haechan.feign.dto.*;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
board와 member 연관 맺고 있을 때

MemberFeignResponse는 양쪽에 있어야 하고 -> 이 부분을 라이브러리로 배포

MemberFeignClient는 한쪽에만 있으면 됨 -> 보드에만, 코드에
 */

@AutoConfiguration // 자동구성 설정 어노테이션
public class AutoConfig {

    @Bean
    public ContractFeignResponse contractFeignResponse() {
        return new ContractFeignResponse();
    }

    @Bean
    public DistributorFeignResponse distributorFeignResponse() {
        return new DistributorFeignResponse();
    }

    @Bean
    public OstFeignResponse ostFeignResponse() {
        return new OstFeignResponse();
    }

    @Bean
    public ProducerFeignResponse producerFeignResponse() {
        return new ProducerFeignResponse();
    }

    @Bean
    public SingerFeignResponse singerFeignResponse() {
        return new SingerFeignResponse();
    }
}