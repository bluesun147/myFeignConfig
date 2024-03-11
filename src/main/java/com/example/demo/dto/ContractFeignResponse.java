package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ContractFeignResponse {
    private Long contractId;
    private Double producerPercent;
    private Double singerPercent;
}