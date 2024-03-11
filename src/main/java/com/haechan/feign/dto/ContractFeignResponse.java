package com.haechan.feign.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Component
public class ContractFeignResponse {
    private Long contractId;
    private Double producerPercent;
    private Double singerPercent;
}